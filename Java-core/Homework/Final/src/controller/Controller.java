package controller;

import exception.ValidateException;
import model.*;
import service.*;
import util.Gender;
import util.Menu;
import util.Validate;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    BookService bookService;
    ArrayList<Book> books;
    AdminService adminService;
    ArrayList<Admin> admins;
    UserService userService;
    ArrayList<User> users;
    OrderService orderService;
    ArrayList<Order> orders;
    BillService billService = new BillService();
    ArrayList<Bill> bills = billService.getAllBill();


    public Controller() {
        sc = new Scanner(System.in);
        bookService = new BookService();
        books = bookService.getAllBook();
        adminService = new AdminService();
        admins = adminService.getAllAdmin();
        userService = new UserService();
        users = userService.getAllUser();
        orderService = new OrderService();
        orders = orderService.getAllOrder();
    }

    public void home() {
        boolean iscountinue = true;
        while (iscountinue) {
            try {
                Menu.mainmenu();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        show(books);
                        break;
                    case 2:
                        System.out.println(" Nhập tên sách bạn muốn tìm: ");
                        String searchTitle = sc.nextLine();
                        bookService.searchByTitle(books, searchTitle);
                        break;
                    case 3:
                        System.out.println(" Nhập thể loại bạn muốn tìm: ");
                        String searchCategory = sc.nextLine();
                        bookService.searchByCategory(books, searchCategory);
                        break;
                    case 4:
                        Menu.subMenuPrice();
                        bookService.printBookByPrice(books);
                        break;
                    case 5:
                        bookService.bestSeller(books);
                        break;
                    case 6:
                        bookService.currentYear(books);
                        break;
                    case 7:
                        menubuyBook();
                        break;
                    case 8:
                        loginAdmin();
                        break;
                    case 0:
                        System.out.println("Cảm ơn bạn đã sử dụng phần mềm");
                        System.exit(0);
                    default:
                        System.out.println("Không có lựa chọn này");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số vui lòng nhập lại");
            }
        }
    }

    public Admin loginAdmin() {
        Admin admin;
        System.out.println("Nhập tài khoản: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        admin = adminService.checklogin(username, password, admins);

        if (admin == null) {
            System.out.println("Sai tài khoản hoặc mật khẩu");
            loginAdminFail();
        } else {
            loginSucces(admin);
        }
        return admin;
    }

    public void loginAdminFail() {
        Menu.loginfail();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                loginAdmin();
                break;
            case 2:
                handleForgotPasswordAdmin();
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }

    public void handleForgotPasswordAdmin() {
        boolean isRightEmail = false;
        while (!isRightEmail) {
            System.out.println("Nhập email của bạn: ");
            String email = sc.nextLine();
            Admin admin = adminService.checkEmailAdmin(email, admins);
            if (admin != null) {
                isRightEmail = true;
                admin.setPassword(inputPassword());
            }
        }
        System.out.println("Cập nhật mật khẩu thành công");
        loginAdmin();
    }

    public void loginSucces(Admin admin) {
        System.out.println("Chào mừng " + admin.getUsername() + ", bạn có thể thực hiện các công việc sau: ");
        boolean isCheck = true;
        while (isCheck) {
            try {
                Menu.subMenuUpdate();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        addBook(books);
                        break;
                    case 2:
                        System.out.println("Nhập mã sách bạn muốn update: ");
                        String searchID = sc.nextLine();
                        Book updatebook = bookService.searchByid(books, searchID);
                        try {
                            if (updatebook.getId().equals(searchID)) {
                                updateBook(updatebook);
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Mã sách Không tồn tại");
                        }
                        break;
                    case 3:
                        System.out.println("Nhập mã sách bạn muốn xóa: ");
                        String ID = sc.nextLine();
                        Book removeBook = bookService.searchByid(books, ID);
                        try {
                            if (removeBook.getId().equals(ID)) {
                                System.out.println("Xóa sách thành công");
                                books.remove(removeBook);
                                System.out.println("Danh sách sau khi xóa");
                                show(books);
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Mã sách không tồn tại");
                        }
                        break;
                    case 4:
                        show(users);
                        break;
                    case 5:
                        createNewUser(users);
                        break;
                    case 6:
                        System.out.println("Nhập UserName bạn muốn xóa: ");
                        String username = sc.nextLine();
                        User removeUsername = userService.searchByUsername(users, username);
                        try {
                            if (removeUsername.getUsername().equals(username)) {
                                System.out.println("Xóa sách thành công");
                                users.remove(removeUsername);
                                System.out.println("Danh sách sau khi xóa");
                                show(users);
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Username không tồn tại");
                        }
                        break;
                    case 7:
                        show(bills);
                        break;
                    case 8:
                        isCheck = false;
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
            }
        }
    }

    public void addBook(ArrayList<Book> books) {
        String id = inputID();
        System.out.println("Nhập tên sách: ");
        String title = sc.nextLine();
        System.out.println("Nhập thể loại: ");
        String category = sc.nextLine();
        System.out.println("Nhập tác giả: ");
        String author = sc.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        String publishingCompany = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        YearMonth publishingYear = YearMonth.parse(sc.nextLine());
        System.out.println("Nhập số Lượng đã bán: ");
        int sold = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số trang");
        int numberOfPage = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá bán");
        long sellPrice = Long.parseLong(sc.nextLine());
        books.add(new Book(id, title, new String[]{category}, author,
                publishingCompany, publishingYear, sold, numberOfPage, sellPrice));
        System.out.println("Thêm sách thành công");
    }

    public String inputID() {
        String id = null;
        while (id == null) {
            System.out.println("Nhập ID");
            id = sc.nextLine();
            try {
                Validate.validateId(id);
                for (Book book : books) {
                    if (book.getId().equals(id)) {
                        System.out.println("Mã sách đã tồn tại");
                        id = null;
                    }
                }
            } catch (ValidateException e) {
                id = null;
                System.out.println(e.getMessage());
                ;
            }
        }
        return id;
    }

    public void changeTitle(Book book) {
        System.out.println("Nhập tên: ");
        String newTitle = sc.nextLine();
        book.setTitle(newTitle);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(book);
    }

    public void changeCategory(Book book) {
        System.out.println("Nhập thể loại: ");
        String newCategory = sc.nextLine();
        book.setCategory(new String[]{newCategory});
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(book);
    }

    public void changeAuthor(Book book) {
        System.out.println("Nhập tên tác giả: ");
        String newAuthor = sc.nextLine();
        book.setAuthor(newAuthor);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(book);
    }

    public void changePublishingCompany(Book book) {
        System.out.println("Nhập nhà xuất bản: ");
        String newPublishingCompany = sc.nextLine();
        book.setPublishingCompany(newPublishingCompany);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(book);
    }

    public void changePublishingYear(Book book) {
        System.out.println("Nhập năm xuất bản(YYYY/MM): ");
        YearMonth newPublishingYear = YearMonth.parse(sc.nextLine());
        book.setPublishingYear(newPublishingYear);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(book);
    }

    public void changeSold(Book book) {
        System.out.println("Nhập số lượng đã bán: ");
        int newSold = Integer.parseInt(sc.nextLine());
        book.setSold(newSold);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(book);
    }

    public void changeNumberOfPage(Book book) {
        System.out.println("Nhập số trang: ");
        int newNumberOfPage = Integer.parseInt(sc.nextLine());
        book.setNumberOfPage(newNumberOfPage);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(book);
    }

    public void changeSellPrice(Book book) {
        System.out.println("Nhập giá bán: ");
        long newSellPrice = Long.parseLong(sc.nextLine());
        book.setSellPrice(newSellPrice);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(book);
    }

    public void updateBook(Book book) {
        boolean iscontinue = true;
        while (iscontinue) {
            Menu.subSubMenuUpdate();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    changeTitle(book);
                    break;
                case 2:
                    changeCategory(book);
                    break;
                case 3:
                    changeAuthor(book);
                    break;
                case 4:
                    changePublishingCompany(book);
                    break;
                case 5:
                    changePublishingYear(book);
                    break;
                case 6:
                    changeSold(book);
                    break;
                case 7:
                    changeNumberOfPage(book);
                    break;
                case 8:
                    changeSellPrice(book);
                    break;
                case 9:
                    iscontinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void loginUser() {
        System.out.println("Nhập tài khoản: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        User user = userService.checkloginUser(username, password, users);
        if (user == null) {
            System.out.println("Sai tài khoản hoặc mật khẩu");
            loginFail();
        } else {
            System.out.println("Đăng nhập thành công");
            orderBook(user);
        }
    }

    public void loginFail() {
        Menu.loginfail();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                loginUser();
                break;
            case 2:
                handleForgotPassword();
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }

    public void handleForgotPassword() {
        boolean isRightEmail = false;
        while (!isRightEmail) {
            System.out.println("Nhập email của bạn: ");
            String email = sc.nextLine();
            User user = userService.checkEmailUser(email, users);
            if (user != null) {
                isRightEmail = true;
                user.setPassword(inputPassword());
            }
        }
        System.out.println("Cập nhật mật khẩu thành công");
        loginUser();
    }

    public String inputUserID() {
        String id = null;
        while (id == null) {
            System.out.println("Nhập mã người dùng (USER + 3 chữ số): ");
            id = sc.nextLine();
            try {
                Validate.validateIdUser(id);
                for (User user : users) {
                    if (user.getId().equals(id)) {
                        System.out.println("Mã người dùng đã tồn tại");
                        id = null;
                    }
                }
            } catch (ValidateException e) {
                id = null;
                System.out.println(e.getMessage());
                ;
            }
        }
        return id;
    }

    public String inputUsername() {
        boolean isValidUsername = false;
        String username = null;
        while (!isValidUsername) {
            System.out.println("Nhập username: ");
            username = sc.nextLine();
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    System.out.println("Username đã tồn tại");
                } else {
                    isValidUsername = true;
                }
            }
        }
        return username;
    }

    public String inputPassword() {
        String password = null;
        while (password == null) {
            System.out.println("Nhập mật khẩu(Mật khẩu phải chứa ít nhất 7 ký tự và có chữ cái in hoa): ");
            password = sc.nextLine();
            try {
                Validate.validatePassword(password);
            } catch (ValidateException e) {
                password = null;
                System.out.println(e.getMessage());
                ;
            }
        }
        return password;
    }

    public String inputEmail() {
        String email = null;
        while (email == null) {
            System.out.println("Nhập Email");
            email = sc.nextLine();
            try {
                Validate.validateEmail(email);
                for (User user : users) {
                    if (user.getEmail().equals(email)) {
                        System.out.println("Email đã tồn tại");
                        email = null;
                    }
                }
            } catch (ValidateException e) {
                email = null;
                System.out.println(e.getMessage());
                ;
            }
        }
        return email;
    }

    public Gender inputGender() {
        Gender gender = null;
        while (gender == null) {
            try {
                System.out.println("Chọn giới tính: ");
                Menu.subMenuGender();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        gender = Gender.MALE;
                        break;
                    case 2:
                        gender = Gender.FEMALE;
                        break;
                    default:
                        System.out.println("Không có lựa chọn nay");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
            }
        }
        return gender;
    }

    public String inputphone() {
        String phone = null;
        while (phone == null) {
            System.out.println("Nhập số điện thoại: ");
            phone = sc.nextLine();
            try {
                Validate.validatePhone(phone);
            } catch (ValidateException e) {
                phone = null;
                System.out.println(e.getMessage());
                ;
            }
        }
        return phone;
    }

    public LocalDate inputBirthday() {
        LocalDate birthday = null;
        while (birthday == null)
            try {
                System.out.println("Nhập ngày sinh (YYYY-MM-DD): ");
                birthday = LocalDate.parse(sc.nextLine());
            } catch (DateTimeException e) {
                System.out.println("Ngày sinh không hợp lệ");
            }
        return birthday;
    }

    public void createNewUser(ArrayList<User> users) {
        String id = inputUserID();
        String username = inputUsername();
        String password = inputPassword();
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        Gender gender = inputGender();
        String phone = inputphone();
        LocalDate birthday = inputBirthday();
        String email = inputEmail();
        users.add(new User(id, username, password, name, gender, phone, birthday, email));
        System.out.println("Đăng ký thành công");
    }

    public void menubuyBook() {
        boolean ischeck = true;
        while (ischeck) {
            try {
                Menu.subMenuBuyBook();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        loginUser();
                        break;
                    case 2:
                        createNewUser(users);
                        break;
                    case 3:
                        ischeck = false;
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
            }
        }
    }

    public void createOrder(User user) {
            System.out.println("Nhập mã sản phẩm: ");
            String id = sc.nextLine();
            System.out.println("Nhập số lượng: ");
            int quantity = Integer.parseInt(sc.nextLine());
            Book book = bookService.searchByid(books, id);
            Order order = new Order();
            if (book != null) {
                if (orders.stream().anyMatch(order1 -> order1.getId().equals(book.getId()))) {
                    System.out.println("Đã tồn tại sách trong giỏ");
                } else {
                    order.setIdOrder(user.getId());
                    order.setName(user.getName());
                    order.setPhone(user.getPhone());
                    order.setId(book.getId());
                    order.setTitle(book.getTitle());
                    order.setPrice(book.getSellPrice());
                    order.setQuantity(quantity);
                    book.setSold(book.getSold() + quantity);
                    orders.add(order);
                    System.out.println("Thêm vào giỏ hàng thành công");
                }
            }else {
                System.out.println("Không tồn tại sách");
        }
    }

    public void createBill(Order order) {
        Bill bill = new Bill();
        bill.setIdOrder(order.getIdOrder());
        bill.setId(order.getId());
        bill.setDate(LocalDate.now());
        bill.setName(order.getName());
        bill.setPhone(order.getPhone());
        bill.setTitle(order.getTitle());
        bill.setPrice(order.getPrice());
        bill.setQuantity(order.getQuantity());
        bills.add(bill);
        orders.remove(order);
        System.out.println("Mua sách thành công, sách đã được xóa khỏi giỏ hàng");
    }

    public void orderBook(User user) {
        boolean iscontinue = true;
        while (iscontinue) {
            try {
                Menu.subMenuOrder();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        createOrder(user);
                        break;
                    case 2:
                        orderHistory(orders, user);
                        break;
                    case 3:
                        changUser(user);
                        break;
                    case 4:
                        billHistory(bills, user);
                        break;
                    case 5:
                        iscontinue = false;
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Bạn phải nhập số");
            }
        }
    }

    public void changeNameUser(User user) {
        System.out.println("Nhập tên: ");
        String updateName = sc.nextLine();
        user.setName(updateName);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changePasswordUser(User user) {
        String updatePassword = inputPassword();
        user.setPassword(updatePassword);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changeGenderUser(User user) {
        Gender updateGender = inputGender();
        user.setGender(updateGender);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changePhoneUser(User user) {
        String updatePhone = inputphone();
        user.setPhone(updatePhone);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changeBirthdayUser(User user) {
        LocalDate updateBirthday = inputBirthday();
        user.setBirthday(updateBirthday);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changeEmailUser(User user) {
        String updateEmail = inputEmail();
        user.setEmail(updateEmail);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changUser(User user) {
        boolean iscontinue = true;
        while (iscontinue) {
            Menu.subMenuUpdateUser();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    changeNameUser(user);
                    break;
                case 2:
                    changePasswordUser(user);
                    break;
                case 3:
                    changeGenderUser(user);
                    break;
                case 4:
                    changePhoneUser(user);
                    break;
                case 5:
                    changeBirthdayUser(user);
                    break;
                case 6:
                    changeEmailUser(user);
                    break;
                case 7:
                    iscontinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void show(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public void orderHistory(ArrayList<Order> orders, User user) {
        int count = 0;
        for (Order order : orders) {
            if (order.getIdOrder().equals(user.getId())) {
                System.out.println(order);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Chưa có đơn hàng trong giỏ");
        }
        for (Order order : orders) {
            if (order.getIdOrder().equals(user.getId())) {
                buybook();
                break;
            }
        }
    }

    public void buybook(){
        Menu.submenubill();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                System.out.println("Nhập mã sách muốn mua");
                String buyId = sc.nextLine();
                Order buybook = orderService.searchById(orders, buyId);
                if (buybook != null) {
                    createBill(buybook);
                }
                else {
                    System.out.println("Không tồn tại sách trong giỏ hàng");
                }
                break;
            case 2:
                System.out.println("Nhập mã sách muốn xóa");
                String remoId = sc.nextLine();
                Order remoOrder = orderService.searchById(orders, remoId);
                if (remoOrder != null) {
                    orders.remove(remoOrder);
                    System.out.println("Xóa đơn hàng thành công");
                } else {
                    System.out.println("Mã sách không tồn tại");
                }
                break;
            case 3:
                System.out.println("Nhập mã sách muốn cập nhật");
                String updateId = sc.nextLine();
                Order updateOrder = orderService.searchById(orders, updateId);
                if (updateOrder != null) {
                    System.out.println("Nhập số lượng mua muốn thay đổi");
                    int updateQuantity = Integer.parseInt(sc.nextLine());
                    updateOrder.setQuantity(updateQuantity);
                    System.out.println("Cập nhật thành công");
                }
                else {
                    System.out.println("Không tồn tại sách trong giỏ hàng");
                }
            case 4:
                break;
        }
    }

    public void billHistory(ArrayList<Bill> bills, User user){
        int count = 0;
        for (Bill bill: bills){
            if (bill.getIdOrder().equals(user.getId())){
                System.out.println(bill);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Chưa có hóa đơn mua hàng");
        }
    }
}
