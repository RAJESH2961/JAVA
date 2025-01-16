// public class FindSingleElement {
//     public static int brute(int arr[] ,int n){
//         // p-s : there should be always only one signel element and multiple 2 elements not more that 2 (multple 2 elements will have not tri elements)
//         //If there is no single element ther return -1
//         int ans = -1;
//         //If there is single element 
//         if(n==1) return arr[n-1]; //or arr[0]
//         for(int i=0; i<n; i++){
//             //the below two conditions will handle Edge cases like if the index is 0 and n-1 if we try to cmpare with i-1 and i+1 then it will lead to index out of bound error
//             if(i == 0){
//                 if(arr[i] != arr[i+1]){
//                     return arr[i];
//                 }
//             }
//             else if(i == n-1){
//                 if(arr[i] != arr[i-1]){
//                     return arr[i];
//                 }
//             }
//             else{
//                 if(arr[i]!= arr[i-1] && arr[i] != arr[i+1]){
//                     return arr[i];
//                 }
//             }
//         }

//         return ans;
//     }
//     public static void main(String[] args) {
//         // int arr[] = {1, 1, 2 ,2,3,3, 4,5,5,6,6};
//         int []arr = {0};
//         System.out.println("Brute :"+ brute(arr, arr.length));

//     }
    
// }


public class FindSingleElement {

    // Finds the single element in the array where all other elements appear twice
    // public static int findSingleElement(int[] inputArray, int length) {
    //     // If the array is invalid or empty, return -1
    //     if (inputArray == null || length == 0) {
    //         return -1;
    //     }

    //     // If there is only one element, return it directly
    //     if (length == 1) {
    //         return inputArray[0];
    //     }

    //     // Iterate through the array to find the single element
    //     for (int i = 0; i < length; i++) {
    //         // Check the first element
    //         if (i == 0 && inputArray[i] != inputArray[i + 1]) {
    //             return inputArray[i];
    //         }

    //         // Check the last element
    //         if (i == length - 1 && inputArray[i] != inputArray[i - 1]) {
    //             return inputArray[i];
    //         }

    //         // Check all middle elements
    //         if (i > 0 && i < length - 1 && inputArray[i] != inputArray[i - 1] && inputArray[i] != inputArray[i + 1]) {
    //             return inputArray[i];
    //         }
    //     }

    //     // If no single element is found, return -1
    //     return -1;
    // }
    public static int optimal(int []arr, int n){
        if (n == 0 || arr == null) {
            return -1;
        }

        // Handle the case where the array has only one element
        if (n == 1) {
            return arr[0];
        }

        // Check for first and last elements
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1;
        int high = n - 2;


        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] != arr[mid-1] && arr[mid]!= arr[mid+1]){
                return arr[mid];
            }
            if( (mid %2 ==0 && arr[mid] == arr[mid-1]) || (mid % 2==1 && arr[mid] == arr[mid+1] )){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6}; // Single element: 4
        int[] array2 = {0};                               // Single element: 0
        int[] array3 = {};                                // No elements: -1

        System.out.println("Single Element in Array 1: " + optimal(array1, array1.length));
        System.out.println("Single Element in Array 2: " + optimal(array2, array2.length));
        System.out.println("Single Element in Array 3: " + optimal(array3, array3.length));
    }
}
