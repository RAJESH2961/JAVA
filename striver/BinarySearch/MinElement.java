public class MinElement {
    public static int element(int []arr, int n){
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            //left part is sorted
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid+1;
            }
            //Right part is sorted
            else{
                ans = Math.min(ans, arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int []arr = {1, 8, 1, 7, 3 ,0,  5, 6};
        int []arr = {2, 2, 2, 0, 1, 2};
        System.out.println("Minimum Element is :"+element(arr, arr.length));
        
    }
    
}
