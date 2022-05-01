import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person("Nova", 27, "HN");
//        System.out.println(p1);

        ArrayList<Person> List = new ArrayList<>();
        List.add(new Person("ann", 23, "Hn"));
        List.add(new Person("anna", 26, "Hn"));
        List.add(new Person("anno", 25, "Hn"));
        List.add(new Person("anne", 24, "Hn"));

        System.out.println("Danh sach ban dau");
        show(List);

        Collections.sort(List);
        System.out.println("danh sach sau khi sap xep");
        show(List);

//        sap xep theo tuoi
       Collections.sort(List, new Comparator<Person>() {
                   @Override
                   public int compare(Person o1, Person o2) {
                       return o1.getAge() - o2.getAge() ;
                   }
               }
       );
        System.out.println("sap xep theo tuoi");
        show(List);
    }

    public static void show(ArrayList<Person> List){
        for (Person p : List) {
            System.out.println(p);
        }
    }
}
