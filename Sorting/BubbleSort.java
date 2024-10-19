public class BubbleSort {
    // Method to perform bubble sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for each pass to compare adjacent elements
            int swapped = 0;

            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = 1; 
                }
                
            }
            if(swapped == 0){
                break;
            
            }
            System.out.println("Runs");

        }
    }

    // Method to print the array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the bubble sort
    public static void main(String[] args) {
        // int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] arr = {4, 14, 25, 26, 27, 31, 90};
        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
