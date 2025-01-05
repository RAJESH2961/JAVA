public class SearchInsertPosition {
    public static int searchPosition(int arr[], int n, int target){
        int ans = n;
        int low = 0; 
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= target){
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
        int []arr = {1, 2, 4 ,7};
        System.out.println("Finding Insert Position :"+searchPosition(arr, arr.length, 2));
    }
    
}
