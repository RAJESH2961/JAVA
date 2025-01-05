public class BinarySearch {
    static int binarySearch(int arr[], int n, int target){
        // boolean ans = false;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target ) return mid;
            else if(target>arr[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 };

        System.out.println(binarySearch(arr, arr.length, 8));
        
    }
    
}
