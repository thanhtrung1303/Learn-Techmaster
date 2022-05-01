package service;

import model.Book;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BookService {
    public ArrayList<Book> getAllBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("B001", "Bách Khoa Thư Về Các Loại Phương Tiện Giao Thông",
                new String[]{"Khoa học", "Tự nhiên"}, "Clive Gifford",
                "Nxb Thanh niên", YearMonth.of(2021,8), 200,
                256, 453000));
        books.add(new Book("B002", "Phát triển trị tuệ cảm xúc",
                new String[]{"Khoa học", "xã hội"}, "Jayneen Sanders",
                "Nxb Dân trí", YearMonth.of(2021,4), 320,
                56, 83000));
        books.add(new Book("B003", "Học tiếng anh qua truyện ngụ ngôn",
                new String[]{"Ngoại ngữ", "Xã hội"}, "Megan Sussman",
                "Nxb Thanh niên", YearMonth.of(2021,2), 120,
                46, 88000));
        books.add(new Book("B004", "Kế toán tài chính",
                new String[]{"Giáo trình", "Sách giáo khoa"}, "nhà phát hành kinh tế",
                "Nxb tài chính", YearMonth.of(2015,3), 180,
                908, 246000));
        books.add(new Book("B005", "Sơ đồ kế toán doanh nghiệp",
                new String[]{"Giáo trình", "Sách giáo khoa"}, "nhà phát hành kinh tế",
                "Nxb tài chính", YearMonth.of(2020,4), 200,
                98, 89000));
        books.add(new Book("B006", "Ehon - Mọt sách Mogu - Đêm Tất Bật",
                new String[]{"Thiếu nhi", "học tập"}, "nhà phát hành More Production Vietnam",
                "Nxb kim đồng", YearMonth.of(2021,1), 280,
                32, 34000));
        books.add(new Book("B007", "Sách Giáo dục an toàn giao thông dành cho trẻ 3-4 tuổi",
                new String[]{"Thiếu nhi", "học tập", "Sách giáo khoa"}, "Nhiều tác giả",
                "Nxb kim đồng", YearMonth.of(2022,2), 150,
                50, 46000));
        books.add(new Book("B008", "Mê cung phát triển kỹ năng",
                new String[]{"Thiếu nhi", "Mỹ thuật", "âm nhạc"}, "Kawa",
                "Nxb Dân trí", YearMonth.of(2022,2), 190,
                40, 56000));
        books.add(new Book("B009", "Dán hình siêu đáng yêu",
                new String[]{"Thiếu nhi", "học tập", "Mỹ thuật"}, "Hemma",
                "Nxb Thanh niên", YearMonth.of(2021,8), 50,
                50, 76000));
        books.add(new Book("B010", "Kể Chuyện Văn Hoá Việt - Chuyện Ở Của Người Xưa",
                new String[]{"Văn hóa", "lịch sử"}, "Miên Thảo",
                "Nxb Lao động", YearMonth.of(2022,1), 40,
                69, 86000));
        books.add(new Book("B011", "Cách Mạng Công Nghệ 4.0 ",
                new String[]{"Công nghệ", "Kỹ thuật"}, "nhà phát hành tri thức",
                "Nxb Thanh niên", YearMonth.of(2021,8), 48,
                79, 29000));
        books.add(new Book("B012", "Cách Mạng Blockchain ",
                new String[]{"Công nghệ", "Kỹ thuật"}, "Alex Tapscott",
                "Nxb ĐH Kinh tế Quốc dân", YearMonth.of(2022,2), 88,
                509, 259000));
        books.add(new Book("B013", "Chúng ta tuổi 40",
                new String[]{"tâm lý", "văn học"}, "Nguyễn Xuân Lâm",
                "Nxb Lao động", YearMonth.of(2021,5), 68,
                169, 49000));

        return books;
    }

    public Book searchByid(ArrayList<Book> books, String searchId) {
        for (Book book : books) {
            if (book.getId().equals(searchId)) {
                return book;
            }
        }
        return null;
    }

    public void searchByTitle(ArrayList<Book> books, String searchTitle) {
        int count = 0;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }
//        books.stream().filter(book1 -> book1.getTitle().toLowerCase().contains(searchTitle.toLowerCase())).
//                forEach(System.out::println);
//        count++;
        if (count == 0){
            System.out.println("Không tồn tại tên sách");
        }
    }

    public void searchByCategory(ArrayList<Book> books, String searchCategory) {
        int count = 0;
        for (Book book : books) {
            for (String s : book.getCategory()) {
                if (s.toLowerCase().equals(searchCategory.toLowerCase())) {
                    System.out.println(book);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Không tồn tại thể loại này");
        }
    }

    public void printBookByPrice(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                for (Book book : books) {
                    if (book.getSellPrice() < 50000) {
                        System.out.println(book);
                    }
                }
//                books.stream().filter(book -> book.getSellPrice() < 50000).forEach(System.out::println);
                break;
            case 2:
                for (Book book : books) {
                    if (book.getSellPrice() >= 50000 && book.getSellPrice() <= 100000) {
                        System.out.println(book);
                    }
                }
//                books.stream().filter(book -> book.getSellPrice() >= 50000 && book.getSellPrice() <= 100000).
//                        forEach(System.out::println);
                break;
            case 3:
                for (Book book : books) {
                    if (book.getSellPrice() > 100000) {
                        System.out.println(book);
                    }
                }
//                books.stream().filter(book -> book.getSellPrice() > 100000).forEach(System.out::println);
            break;
            default:
                System.out.println("Không có lựa chọn này");
                break;
        }
    }

    public void bestSeller(ArrayList<Book> books){
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getSold() - o1.getSold();
            }
        });
        for (int i = 0; i < 5; i++){
            System.out.println(books.get(i));
        }
//        books.stream().sorted((o1, o2) -> o2.getSold()-o1.getSold()).limit(5).forEach(System.out::println);
    }

    public void currentYear(ArrayList<Book> books){
        for (Book book : books){
            if(book.getPublishingYear().getMonth() == LocalDate.now().getMonth() &&
                    book.getPublishingYear().getYear() == LocalDate.now().getYear()){
                System.out.println(book);
            }
        }
    }
}
