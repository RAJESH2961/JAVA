public class FindHowManyTimesArrayIsRotated {
    public static int findRotationCountLinear(int arr[], int n) {
        int minIndex = 0; // Assume the first element is the smallest
        
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] < arr[minIndex]) {
        //         minIndex = i; // Update the index of the smallest element
        //         break;
        //     }
        // }

        // or

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(min,arr[i]);
        }
        for(int i=0; i<n ;i++){
            if(arr[i] == min){
                return i;
            }
        }
        return min; // The index of the smallest element is the rotation count
    }

    //Explanation of code
    //Left half is sorted
    // initially ans = some MAX_VALUE
    // if left half is sorted we will check if the arr[low] < ans then the ans will be updated
    //  and then index is updated to low hence we found the smallest value as compared to previous ans
    //IF not we gonna eliminate the left half(low = mid+1)
    //Right half is sorted
    // same we will check if arr[mid]<ans
    //we willupdate same index and ans variable and then if it is not then we eliminate that part(right) high = mid-1;

    // public static int optimal(int []arr, int n){
    //     int ans = Integer.MAX_VALUE;
    //     int low = 0;
    //     int index = 0;
    //     int high = n-1;
    //     while(low <= high){
    //         int mid = (low+high)/2;
    //         //Edge case if array is aldready sorted then arr[low] will be always my answer
    //         if(arr[low] <= arr[high]){
    //             return index;
    //         }
    //         //Left half is sorted
    //         if(arr[low] <= arr[mid]){
    //             if(arr[low]< ans){
    //                 index = low;
    //                 ans = arr[low];
    //             }
    //             low = mid+1;

    //         }
    //         //Right half is sorted
    //         else{
    //             if(arr[mid] < ans){
    //                 index = mid;
    //                 ans = arr[mid];
    //             }
    //             high = mid-1;

    //         }

    //     }

    //     return index;
    // }


    public static int optimal(int[] arr, int n) {
        if (n == 0) return 0; // Handle empty array case

        int ans = Integer.MAX_VALUE; // Initialize to maximum value
        int low = 0; // Start index
        int high = n - 1; // End index
        int index = 0; // To store the index of the minimum element

        while (low <= high) {
            int mid = (low + high) / 2;

            // Edge case: if the array is already sorted
            if (arr[low] <= arr[high]) {
                return low; // Return low as it points to the minimum element
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                // Update ans and index if the current minimum is smaller
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                low = mid + 1; // Eliminate left half
            } 
            // Right half is sorted
            else {
                // Update ans and index if the current minimum is smaller
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1; // Eliminate right half
            }
        }

        return index; // Return the index of the smallest element found
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};
        // int rotationCount = findRotationCountLinear(arr, arr.length);
        int rotationCount = optimal(arr, arr.length);
        System.out.println("Array is rotated " + rotationCount + " times.");
    }
}
