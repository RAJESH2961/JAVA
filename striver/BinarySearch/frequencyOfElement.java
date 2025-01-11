//Brute force approach --> Linear Search
public class frequencyOfElement {
    public static int frequency(int arr[], int target){
        int fre = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                fre++;
            }
        }
        return fre;
    }
    
    //optimal
    public static  int[] f_l_occurrence_linearSearch(int arr[], int n, int target){
        int first = firstOccurrence(arr, target);
        if (first == -1) return new int []{-1, -1};
        int last = lastOccurrence(arr, target);
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
        int []arr = {1, 2 ,3 ,4 ,5, 5 ,5};
        int target = 5;
        System.out.println("Brute force :"+frequency(arr, target));
        int ans[] = (f_l_occurrence_linearSearch(arr,arr.length, target));
        System.out.println("Better  :"+(ans[0]+" :::::::::::::::::::: "+ans[1]));
        System.out.println(ans[0]);
        System.out.println("Frequency "+(lastOccurrence(arr, target) - firstOccurrence(arr, target)+1));
    }
    
}
