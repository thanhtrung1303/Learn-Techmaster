package com.company;

public class Person {
    public Person(){
        System.out.println("gọi tới conatructor");
    }
    public int id;
    public String name;
    public int age;
    public Gender gender;
    public String address;
    public static String school = "techmaster";
    public static void study() {
        school ="cntt";
    }

    public Person(int id, String name, int age, Gender gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}