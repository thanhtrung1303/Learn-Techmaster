import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Test {

    public class RandomStringExmple {
        static final String alpha = "abcdefghijklmnopqrstuvwxyz";
        public String randomAlphaNumeric(int numberOfCharactor) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < numberOfCharactor; i++) {
                int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
                char ch = ALPHA_NUMERIC.charAt(number);
                sb.append(ch);
            }
            return sb.toString();
        }

        public static void main(String a[]) {
            int numberOfCharactor = 8;
            RandomStringExmple rand = new RandomStringExmple();
            System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));
        }
    }
}
