package com.company;

public class Dog {
    public String Bread;
    public String Size;
    public String Color;
    public int Age;
    public Dog(){
    }

    public Dog(String bread, String size, String color, int age) {
        Bread = bread;
        Size = size;
        Color = color;
        Age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Bread='" + Bread + '\'' +
                ", Size=" + Size +
                ", Color='" + Color + '\'' +
                ", Age=" + Age +
                '}';
    }
}
