public class LowerBound {
    public static int lowerBound(int arr[], int n, int x){
        int ans = n;
        int low  = 0; 
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                high = mid-1;
                ans = mid;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int upperBound(int arr[], int n, int x){
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > x){
                high = mid-1;
                ans = mid;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 8, 9, 15, 19};
        int arr1[] = {2, 4, 6, 8, 8, 8, 11, 13};
        //Lower bound finds first or the smallest index in a sorted array where the value at that index is greather than or equal to the given key.

        System.out.println("The Lower Bound of an array is :"+lowerBound(arr, arr.length, 8));
        System.out.println("The Lower Bound of an array is :"+lowerBound(arr1, arr1.length, 14));
        System.out.println("The Upper Bound of an array is :"+upperBound(arr, arr.length, 9));
    }
    
}
