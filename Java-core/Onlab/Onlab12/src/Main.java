import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        boolean iscontinue = true;
//        while (iscontinue) {
//            try {
//                System.out.println("nhap a: ");
//                int a = Integer.parseInt(sc.nextLine());
//                System.out.println("nhap b: ");
//                int b = Integer.parseInt(sc.nextLine());
//                int c = b / a;
//                System.out.println(c);
//                iscontinue = false;
//            } catch (ArithmeticException e) {
//                e.printStackTrace();
//                System.out.println(e.toString());
//                System.out.println("Ban dang chia 1 so cho 0");
//            } catch (NumberFormatException e){
//                System.out.println("ban phai nhap so");
//            } finally {
//                System.out.println("tam biet");
//            }
//        }

//        boolean iscontinue = true;
//        while (iscontinue) {
//
//            System.out.println("Nhap tuoi: ");
//            try {
//                int age = Integer.parseInt(sc.nextLine());
//                Validate.validateAge(age);
//                iscontinue = false;
//            } catch (MyException e) {
//                e.printStackTrace();
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
//        }
        boolean iscontinue = true;
        while (iscontinue) {

            try {
                System.out.println("nhap can nang: ");
                int weight = Integer.parseInt(sc.nextLine());
                System.out.println("nhap chieu cao: ");
                int height = Integer.parseInt(sc.nextLine());
                Validate.ValidateBMI(height, weight);
            } catch (MyException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
