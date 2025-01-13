public class RotatedSortedDuplicates {
    public static int searchElement(int arr[] ,int n, int target){
        int ans = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            //Edge case when array contains Duplicates if this found it shirinks the array
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
            //Left array is sorted
            if(arr[low]<= arr[mid]){
                //check isf the target lies between the range
                if(arr[low]<= target && target <= arr[mid]){
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
        //Edge case
        int []arr = {3, 1, 2, 3, 3 ,3, 3};
        // int []arr = {7, 8, 1, 2 ,3, 4, 5};
        System.out.println("Element Found at : "+searchElement(arr, arr.length, 1));
        
    }
    
}
