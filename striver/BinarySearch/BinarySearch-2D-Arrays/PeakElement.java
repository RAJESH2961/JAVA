public class PeakElement {
    public static int brute(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(((i == 0) || (arr[i-1] < arr[i])) && ((i == n-1) || (arr[i] > arr[i+1]))) {
                return i;
            }
        }
        return -1;
    }

    public static int optimal(int arr[]){
        int n = arr.length;
        if(n == 1) return arr[0]; //In case there is only one element we can return beacuse we consider both sides -infinity
        if(arr[0] > arr[1]) return arr[1]; // first element case - infinity 2 0  peak is 0th index
        if(arr[n-1] > arr[n-2]) return arr[n-1]; // Last Element case 10 20 -infinity so, Peak is arr[n-1];
        //Here we reduced/ shirinked the array by eliminating first and last element so when checking mid-1 & mid+1 there will be no overflow 
        // Over flow will occur when case 0 1 -infinity low = 0 mid = 1 high = infinity if we compare mid+1 out of bound error
        int low = 1;
        int high = n-2;
        while(low <= high){
            int mid = (low + high) / 2;
            if((arr[mid] > arr[mid-1]) && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid] > arr[mid-1])// It is in raising edge hence the peak will be always right so 
            {
                low = mid+1;
            }
            else if(arr[mid] > arr[mid+1])//It is in falling edge hence the peak will be always left so eliminate right hals and go
            {
                high = mid-1;
            }
            else {
                high = mid-1;
                // or
                // low = mid + 1;
            }
        }
        return -1;
    }

//This below case is to for Multiple peaks it wont work wehn insom ecases like 1 5 1 2 1
// first and last is handled
// 5 1 2 it fails three conditions like low peek low peek low the 1 will in center hence we wliminate elther left or right in order to get peak
//If we eliminated right high = mid-1 the array will look like 151 the peak is 5 
//If we elimiate left then the array would look like 121 the peak is 2
    public static int Optimal1(int arr[]){
        int n = arr.length;
        if(n == 1) return arr[0]; //In case there is only one element we can return beacuse we consider both sides -infinity
        if(arr[0] > arr[1]) return arr[1]; // first element case - infinity 2 0  peak is 0th index
        if(arr[n-1] > arr[n-2]) return arr[n-1]; // Last Element case 10 20 -infinity so, Peak is arr[n-1];
        //Here we reduced/ shirinked the array by eliminating first and last element so when checking mid-1 & mid+1 there will be no overflow 
        // Over flow will occur when case 0 1 -infinity low = 0 mid = 1 high = infinity if we compare mid+1 out of bound error
        int low = 1;
        int high = n-2;
        while(low <= high){
            int mid = (low + high) / 2;
            if((arr[mid] > arr[mid-1]) && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid] > arr[mid-1])// It is in raising edge hence the peak will be always right so 
            {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2 ,3 ,4 ,5 ,6 ,7, 8, 5 ,1};
        int arr1[] = {1,5 ,1, 2, 1};
        System.out.println("Brute Force :"+brute(arr));
        System.out.println("optimal Approach :"+optimal(arr));
        System.out.println("optimal Approach with particular Test case :"+Optimal1(arr1));
    }
    
}
