//public class Main<T> {
//    public static void main(String[] args) {
//        MyGeneric<Integer> myGeneric1 = new MyGeneric<>(1);
//        System.out.println(myGeneric1.getVariable());
//
//        MyGeneric<Double> myGeneric2 = new MyGeneric<>(5.6);
//        System.out.println(myGeneric2.getVariable());
//
//        MyGeneric<String> myGeneric3 = new MyGeneric<>("Hello");
//        System.out.println(myGeneric3.getVariable());
//
//        String[] arrString = new String[]{"java", "html/css", "python", "c++"};
//
//        Integer[] arrInt = new Integer[]{1,2,3,4,5};
//
//        Double[] arrDouble = new Double[]{1.2, 2.5, 3.5, 5.5};
//
//        Main<String> stringMain = new Main<>();
//        Main<Integer> intmain = new Main<>();
//        Main<Double> doublemain = new Main<>();
//
//        System.out.println("mang chuoi");
//        stringMain.showArray(arrString);
//
//        System.out.println("mang so nguyen");
//        intmain.showArray(arrInt);
//
//        System.out.println("mang so thuc");
//        doublemain.showArray(arrDouble);
//
//    }
//
//    public void showArray(T arr[]){
//        for (T s : arr){
//            System.out.println(s);
//        }
//    }
//
//}
