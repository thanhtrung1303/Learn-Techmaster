package service;

import controller.Controller;
import models.Order;
import models.User;

import java.util.ArrayList;

public class OrderService {
    static public ArrayList<Order> orderList = new ArrayList<>();
    public static void showOrderList(){
        ArrayList<Order> orderListByUser = orderListByUser(orderList, Controller.currentUser);
        if(orderListByUser.isEmpty()){
            System.out.println("Bạn chưa có giao dịch nào");
        }
        else{
            for (Order o : orderListByUser){
                System.out.println(o);
            }
        }
    }
    public static ArrayList<Order> orderListByUser(ArrayList<Order> list, User user){   //Lọc orderlist theo id user
        ArrayList<Order> listByUser = new ArrayList<>();
        for (Order o : list){
            if(o.getUserID() == user.getUserID()) {
                listByUser.add(o);
            }
        }
        return listByUser;
    }
}