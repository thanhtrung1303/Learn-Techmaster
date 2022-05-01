package com.company;

import java.util.Scanner;

public class PersonService {
    public Person[] getAllPerson() {
        Person[] persons = new Person[3];
        persons[0] = new Person(1, "nova", 28, Gender.MALE,"HN");
        persons[1] = new Person(2, "nava", 28, Gender.FEMALE, "HN");
        persons[2] = new Person(3, "neva", 28, Gender.MALE,"HN");
        return persons;
    }
    public void show(Person [] persons) {
        for (Person p:persons) {
            System.out.println(p);
        }
    }

    public Person createPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten");
        String name = sc.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("lua chon gioi tinh");
        System.out.println("1 - nu");
        System.out.println("0 - nam");
        int choice = Integer.parseInt(sc.nextLine());
        Gender gender = Gender.FEMALE;
        if (choice == 1) {
            gender = Gender.FEMALE;
        }else if(choice == 0) {
            gender = Gender.MALE;
        }else {
            System.out.println("ko co lua chon nay");
        }

        System.out.println("nhap dia chi: ");
        String address = sc.nextLine();

        Person newPerson = new Person(id, name, age, gender, address);
        return newPerson;

    }

    public Person[] addPerson(int size) {
        Person[] persons = new Person[size];
        for (int i = 0; i < size; i++) {
            persons[i] = createPerson();
        }
        return persons;
    }
}
