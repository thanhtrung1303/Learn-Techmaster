import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);

        numbers.forEach(integer -> System.out.println(integer));

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

//        su dung lamda
        numbers.sort((number1, number2) -> number1 - number2);
        numbers.forEach(number -> System.out.println(number));
        System.out.println("loc ra nhung so lon hon 2");
        numbers.stream().filter(number -> number > 2).forEach(number -> System.out.print(number +"\t"));
    }
}
