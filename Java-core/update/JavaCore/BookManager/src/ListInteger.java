import java.util.ArrayList;
import java.util.Collections;

public class ListInteger {
    public static void usinbArraylist(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(6);
        numbers.add(5);
        numbers.add(1);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for (Integer i:numbers
        ) {
            System.out.println(i);
        }
        numbers.add(2,8);
        System.out.println("Sau do");
        for (Integer i:numbers
        ) {
            System.out.println(i);
        }
        numbers.remove(1);
        System.out.println("sau khi xoa");
        for (Integer i:numbers
        ) {
            System.out.println(i);
        }
        numbers.set(2,6);
        for (Integer i:numbers
        ) {
            System.out.println(i);
        }
        Collections.sort(numbers);
        for (Integer i:numbers
        ) {
            System.out.println(i);
        }
        Collections.reverse(numbers);
        for (Integer i:numbers
        ) {
            System.out.println(i);
        }
    }
}
