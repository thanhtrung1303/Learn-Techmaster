package com.company;

public class CarService {
    public static void createCar() {
        Car car = new Car("er", "red", "rf");

                car.setModel("ertig");
                car.setBrand("ef");
                car.setColor("green");
        System.out.printf(car.getModel());
    }
}
