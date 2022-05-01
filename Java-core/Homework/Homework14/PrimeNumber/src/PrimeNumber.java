import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void checkPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        boolean isCheckPrimeNumber = true;
        while (isCheckPrimeNumber) {
            try {
                System.out.println("Vui lòng nhập số muốn kiểm tra: ");
                String number = sc.nextLine();
                if (number.equals("q") || number.equals("x")) {
                    isCheckPrimeNumber = false;
                } else {
                    if (isPrimeNumber(Integer.parseInt(number))) {
                        System.out.println(number + " là số nguyên tố");
                    } else {
                        System.out.println(number + " không là số nguyên tố");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(" Vui lòng nhập số");
            }
        }
    }
}
