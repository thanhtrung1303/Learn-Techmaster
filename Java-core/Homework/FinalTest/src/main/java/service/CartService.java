package service;

import controller.Controller;
import exception.MyException;
import models.CartItem;
import models.Order;
import models.Product;
import models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CartService {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<CartItem> cartItems = new ArrayList<>();
    public static Controller controller = new Controller();
    public static void addToCart (User user){
        System.out.println("   1 - Nhập ID sản phẩm để thêm vào giỏ hàng");
        System.out.println("   2 - Quay lại");
        System.out.print("Lựa chọn : ");
        int buy = 0;
        boolean isContinue = true;
        while (isContinue) {
            try {
                buy = Integer.parseInt(sc.nextLine());
                if (buy < 0 || buy > 2) {
                    throw new MyException("Lựa chọn không hợp lệ");
                }
                isContinue=false;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại : ");
            }
        }
        switch (buy){
            case 1 -> {
                System.out.println("Nhập ID : ");
                int id = sc.nextInt();
                for (Product p : ProductService.allProducts){
                    if (p.getId()==id){
                        while (p.getStock()==0){
                            System.out.println("Sản phẩm hiện đã hết hàng");
                            return;
                        }
                        System.out.println("Nhập số lượng cần mua");
                        int quantity = sc.nextInt();
                        while (quantity > p.getStock()){
                            System.out.println("Số lượng mua không hợp lệ, vui lòng thử lại");
                            quantity = sc.nextInt();
                        }
                        CartItem cartItem = new CartItem(controller.cartItemID, user.getUserID(), p.getId() ,p.getName(),p.getPrice(),quantity);
                        int count = 0;
                        for (CartItem i : cartItems){
                            if(id == i.getId()){
                                i.setQuantity(i.getQuantity()+ quantity);
                                count++;
                                System.out.println("Cập nhật giỏ hàng thành công");
                            }
                        }
                        if (count == 0){
                            cartItems.add(cartItem);
                            Controller.cartItemID++;
                            System.out.println("Thêm vào giỏ thành công");
                        }
                    }
                }
            }
            case 2 -> {
                return;
            }
        }
    }
    public static ArrayList<CartItem> userCartlist(ArrayList<CartItem> list, User user){
        ArrayList<CartItem> listByCart = new ArrayList<>();
        for (CartItem c : list){
            if(c.getUserId() == user.getUserID()) {
                listByCart.add(c);
            }
        }
        return listByCart;
    }
    public static void showCartItems(){
        ArrayList<CartItem> cartArrayList = userCartlist(cartItems, Controller.currentUser);
        long totalPrice = 0;
        if(cartArrayList.isEmpty()){
            System.out.println("Bạn chưa thêm sản phẩm nào vào giỏ");
            return;
        }
        else{
            for (CartItem c : cartArrayList) {
                System.out.println(c);
                totalPrice += c.getPrice() * c.getQuantity();
            }
            System.out.println("Tổng : " + totalPrice);
        }
        System.out.println("   1 - Đặt hàng");
        System.out.println("   2 - Xóa sản phẩm khỏi giỏ hàng");
        System.out.println("   3 - Quay lại");
        System.out.println("Lựa chọn : ");
        int pay = 0;
        boolean isContinue = true;
        while (isContinue) {
            try {
                pay = Integer.parseInt(sc.nextLine());
                if (pay < 0 || pay > 3) {
                    throw new MyException("Lựa chọn không hợp lệ");
                }
                isContinue=false;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại : ");
            }
        }
        switch (pay){
            case 1 -> {
                System.out.println("Thông tin đơn hàng : ");
                Date date = new Date();
                System.out.println();
                ArrayList<CartItem> orderItems = new ArrayList<>();
                for (CartItem c : cartItems){
                    orderItems.add(c);
                }
                Order order = new Order(Controller.currentUser.getUserID(), Controller.currentUser.getPhoneNum(), Controller.currentUser.getEmail(),
                        Controller.currentUser.getAddress(), Controller.currentUser.getName(), Controller.orderID, date,orderItems,totalPrice);
                System.out.println(order);
                System.out.println("   1 - Xác nhận mua hàng");
                System.out.println("   2 - Quay lại");
                int paid = 0;
                boolean isContinue2 = true;
                while (isContinue2) {
                    try {
                        paid = Integer.parseInt(sc.nextLine());
                        if (paid < 0 || paid > 3) {
                            throw new MyException("Lựa chọn không hợp lệ");
                        }
                        isContinue2=false;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập lại");
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Vui lòng nhập lại : ");
                    }
                }
                switch (paid){
                    case 1 -> {
                        for (CartItem item : cartItems){
                            Product p = Controller.findProductById(item.getProductId());
                            p.setStock(p.getStock()-item.getQuantity());
                            ProductService.allProducts.set(p.getId()-1, p); //update quantity
                        }

                        OrderService.orderList.add(order);
                        Controller.orderID++;
                        cartItems.removeAll(cartItems);   //Xóa giỏ hàng
                        System.out.println("Mua hàng thành công, đơn hàng đang được xử lý");
                    }
                }
            }
            case 3 -> {return;}
            case 2 -> {
                System.out.println("Nhập ID sản phẩm trong giỏ cần xóa");
                int id = sc.nextInt();
                int count = 0;
                for (int i =0; i<cartItems.size(); i++){
                    CartItem c = cartItems.get(i);
                    if (c.getId()==id){
                        cartItems.remove(c);
                        count++;
                        System.out.println("Xóa sản phẩm thành công");
                    }
                }
                if (count==0){
                    System.out.println("Không tìm thấy sản phẩm trong giỏ");
                }
            }
        }
    }
}