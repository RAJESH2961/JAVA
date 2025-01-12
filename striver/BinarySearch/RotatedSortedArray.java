public class RotatedSortedArray {
    public static int binarySearch (int arr[], int n, int target){
        int ans = -1;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            //Left array is sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }

            }
            //Right array is sorted
            else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {7, 8, 9, 1 ,2 ,3 ,4 ,5, 6};
        System.out.println("Element Index : "+binarySearch(arr, arr.length, 6));
    }
    
}
