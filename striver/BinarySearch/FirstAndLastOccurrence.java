public class FirstAndLastOccurrence {
    //to Find first Occurrence we use LowerBound
    public static int lowerbound(int arr[], int n, int target ){
        int res = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] >= target){
                high = mid-1;
                res = mid;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }

    //to Find first Occurrence we use LowerBound
    public static int upperBound(int arr[], int n, int target ){
        int res = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] > target){
                high = mid-1;
                res = mid;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    // To find both the first and last occurrence of the target
    public static int[] solve(int arr[], int target, int n) {
        int lb = lowerbound(arr, n, target);  // Find the first occurrence
        if (lb == n || arr[lb] != target) {
            return new int[] { -1, -1 };  // If target not found, return {-1, -1}
        }
        
        int ub = upperBound(arr, n, target);  // Find the last occurrence
        return new int[] { lb, ub-1 };  // Return the indices of the first and last occurrence
    }
    public static void main(String[] args) {
        int []arr = {2, 4 ,6, 8, 8, 8, 11, 13};
        int target = 8;
        System.out.println(lowerbound(arr, arr.length, 8));
        System.out.println(upperBound(arr, arr.length, 8));
        //Main Edge case
        System.out.println(lowerbound(arr, arr.length, target)); //OP-6 which is basically 11 intens of values is it correct 11 is lower bound of 10
        System.out.println(upperBound(arr, arr.length, 14)); //It points outside the array
        System.out.println(solve(arr, target ,arr.length));
        



    }
    
}
