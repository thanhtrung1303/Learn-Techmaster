package com.company;

public class PersonService {
    public static void createPerson() {
        Person person =new Person("Nova", 28, "HN");


        person.setName("Linh");
        System.out.println(person);
    }
}
