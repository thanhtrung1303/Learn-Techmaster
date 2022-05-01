package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal cat = new Animal();
//        cat.name = "kitty";
//        cat.age = 3;
//        cat.leg = 4;
//        cat.color = "trắng";
//
////            System.out.println(cat.name + " - " + cat.age + " - " + cat.leg + " - " + cat.color + " - " );
//        System.out.println(cat);
//    cat.eat("fish");
//    Animal dog = new Animal("Mika",2,4,"black");
//        System.out.println(dog);
//        Person john = new Person(1,"John",30,"male","HCM");
//        Person.study();
//        System.out.println(john);

//        Dog object_1 = new Dog("German Shepherds", "Large", "white & grey",6);
//        System.out.println(object_1);
//        Dog object_2 = new Dog("bulldog","large","light grey", 5);
//        System.out.println(object_2);

//        Person[] persons = new Person[3];
//        persons[0] = new Person(1, "nova", 28, "male","HN");
//        persons[1] = new Person(2, "nava", 28, "female","HN");
//        persons[2] = new Person(3, "neva", 28, "male","HN");
//
//        for (Person p:persons) {
//            System.out.println(p);
//        }

        PersonService service = new PersonService();
        Person[] persons = service.addPerson(3);
        service.show(persons);


    }
}
