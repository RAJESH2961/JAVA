public class FloorAndCeil {
    public static int findfloor(int arr[], int n, int target){
        int ans = -1;
        int low = 0 ;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= target){
                high = mid-1;
            }
            else{
                ans = arr[mid];
                low = mid+1;
            }
        }
        return ans;
    }

    public static int findceil(int arr[], int n, int target){
        int ans = -1;
        int low = 0 ;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]>=target ){
                //search for left
                high = mid-1;
                ans = arr[mid];
            }
            else{
                low = mid+1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 35;
        System.out.println("Finded Floor :"+findfloor(arr, arr.length, target));
        System.out.println("Finded Ceil : "+findceil(arr, arr.length, target));
        
    }
    
}
