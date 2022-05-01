class Bai1550 {
    public static boolean threeConsecutiveOdds(int[] arr) {
    for (int i = 0; i < arr.length-2; i++) {
    if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
    return true;
    }
    }
    return false;
    }

    // public static boolean threeConsecutiveOdds(int[] arr) {
    //     int count = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] % 2 != 0) {
    //             count++;
    //         }
    //     }
    //     if (count >= 3) {
    //         return true;
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        int[] arr1 = { 2, 6, 4, 1 };
        System.out.println(threeConsecutiveOdds(arr1));

        int[] arr2 = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
        System.out.println(threeConsecutiveOdds(arr2));

    }
}