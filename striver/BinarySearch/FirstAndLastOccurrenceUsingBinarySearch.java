// Notes In order to find first and last occurrence we can use lower boud and upper bound concept but interviewer might ask dont use complex topic use simple binary search
// simple brute approach is Linear Search run two seperate loops first one from starting another from reverse 
// or
// find the target and update the first variable if first == -1 and update last everytime whenever target is found


public class FirstAndLastOccurrenceUsingBinarySearch {
    
    public static  int[] f_l_occurrence_linearSearch(int arr[], int n, int target){
        int first = -1;
        int last = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[] {first, last};
    }

    public static int firstOccurrence(int arr[], int target){
        int ans = -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurrence(int arr[], int target){
        int ans = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid =(low+high)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid]> target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {1 ,2 ,3 ,4 ,5 ,6, 7, 7 ,7};

        //Test cases
        // all elements are target
        // int [] arr = {7, 7, 7, 7, 7, 7};
        // int [] arr = {7};
        // int [] arr = {1, 2 ,3 ,4 ,5};
        int target = 7;
        System.out.println("First Occurrence : "+firstOccurrence(arr, target));
        System.out.println("Last Occurrence : "+lastOccurrence(arr, target));
// Linear Search Method
int[] result = f_l_occurrence_linearSearch(arr, arr.length, target);
System.out.println("Linear Search First and Last Occurrence: " + result[0] + ", " + result[1]);
// System.out.println("Frequency of an Element :"+ (lastOccurrence(arr, target) - firstOccurrence(arr, target)+1));
} 
}
