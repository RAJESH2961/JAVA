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
        System.out.println("The Lower Bound of an array is :"+lowerBound(arr, arr.length, 8));
        System.out.println("The Upper Bound of an array is :"+upperBound(arr, arr.length, 9));
    }
    
}
