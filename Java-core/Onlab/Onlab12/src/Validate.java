public class Validate {
    public static void validateAge(int age) throws MyException{
        if(age <= 0) {
            throw new MyException("Tuoi khong duoc phep nho hon hoac bang 0");
        } else {
            System.out.println("tuoi cua ban la "+age);
        }

    }

    public static void ValidateBMI(int weight, int height) throws MyException{
        if(height <= 0) {
            throw new MyException("chieu cao khong duoc phep nho hon hoac bang 0");
        } else if (weight <= 0) {
            throw new MyException("can nang khong duoc phep nho hon hoac bang 0");
        } else {
            System.out.println("BMI cua ban la "+ height/weight*weight);
        }
    }
}
