package service;

import model.Order;

import java.util.ArrayList;

public class OrderService {
    public ArrayList<Order> getAllOrder(){
        ArrayList<Order> orders = new ArrayList<>();
        return orders;
    }

    public Order searchById(ArrayList<Order> orders, String searchId){
        for (Order order: orders){
            if (order.getId().equals(searchId)){
                return order;
            }
        }
        return null;
    }
}
