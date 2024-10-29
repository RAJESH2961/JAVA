public class ArrayIsSortedOrNot {
    static boolean sorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Array is sorted  :" + sorted(arr));
    }

}
