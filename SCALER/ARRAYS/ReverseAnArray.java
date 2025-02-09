//Time Complexicity O(N)  Space Complexity O(1)
//This is an inplace Algorithm which means the array is sorted without creating an seperate array.

/* 
 * Here swap is an seperate function which accepts an array and swap inplace 
 * the two pointers is placed at starting and ending the while loop runs until low <= high
 * 
*/



public class ReverseAnArray {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int arr[]) {
        int low = 0, high = arr.length - 1;
        
        while (low < high) {
            swap(arr, low, high); // Using the swap function
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 7, -1, 0};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverseArray(arr);

        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
