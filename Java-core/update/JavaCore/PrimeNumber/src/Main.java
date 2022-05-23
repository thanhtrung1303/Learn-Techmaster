import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkPrimeNumber();
    }
public static void checkPrimeNumber() {
    boolean isContinue = true;
    while (isContinue) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số cấn kiểm tra: ");
        String s = sc.nextLine();
        if ((s.equals("Q")) || (s.equals("X"))) {
            isContinue = false;
        } else {
            int number = Integer.parseInt(s);
            if (isPrimeNumber(number)) {
                System.out.println("Số " + number + " là số nguyên tố");
            } else System.out.println("Số " + number + " không là số nguyên tố");
        }
    }
}

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            return false;
        } else return true;
    }
}
