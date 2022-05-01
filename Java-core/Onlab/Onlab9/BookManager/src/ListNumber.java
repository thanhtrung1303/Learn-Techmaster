import java.util.ArrayList;
import java.util.Collections;
public class ListNumber {
    public void createlistnumber() {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(9);
        numbers.add(7);

        System.out.println(numbers);

        System.out.println("\nsu dung ham lap for");
        for (int i = 0; i < numbers.size();i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\nsu dung foreach");
        for (Integer i: numbers) {
            System.out.print(i + "\t");
        }

        numbers.add(8);
        System.out.println("\ndang sach sau khi them");
        for (Integer i : numbers
             ) {
            System.out.print(i + "\t");
        }

        numbers.add(4,5);
        System.out.println("\ndang sach sau khi them");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }

        numbers.remove(6);
        System.out.println("\ndang sach sau khi xoa");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }

        numbers.set(2, 3);
        System.out.println("\ndang sach sau khi cap nhat");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }

        Collections.sort(numbers);
        System.out.println("\nsap xep");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }

        Collections.reverse(numbers);
        System.out.println("\ndsap xep giam dan");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }

        Collections.shuffle(numbers);
        System.out.println("\nsap xep dao");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }

        Collections.swap(numbers, 3,5);
        System.out.println("\ndoi vi tri");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }
    }
}
