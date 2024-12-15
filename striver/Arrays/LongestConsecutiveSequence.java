
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longest(int arr[], int n){
        int lon = 1;
        for(int i = 0; i<n; i++){
            int temp = arr[i];
            int cnt = 1;
            while(linearSearch(arr, temp+1) == true){
                temp+=1;
                cnt+=1;
            }
            lon = Math.max(lon, cnt);
        }
        return lon;
    }
    public static boolean linearSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target)
            return true;
        }
        return false;
    }

    //Better Approach
    //sort the Algorithm

    public static int better(int arr[], int n){
        //sort the algotithm
        Arrays.sort(arr);
        int longest  = 1;
        int previous = Integer.MIN_VALUE;
        int cnt = 1;
        for(int i = 0; i<n ; i++){
            if(arr[i]-1 == previous){
                cnt = cnt+1;
                previous = arr[i];
            }
            else if(arr[i] != previous){
                cnt = 1;
                previous = arr[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    //optimal Approach
    public static int optimal(int arr[], int n){
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        //push the elements into set
        for(int i = 0; i < n; i++){
            st.add(arr[i]);
        }
        //finding consecutive array
        for(int i =0; i<n; i++){
            int cnt = 0;
            if(!st.contains(arr[i]-1)){
                cnt =1;
                int x = arr[i];
                while(st.contains(x+1)){
                    x = x+1;
                    cnt = cnt+1;
                }
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {99, 4, 100, 1, 101, 3, 2 ,4,5 , 6};
        System.out.println(optimal(arr, arr.length));
    }  
}
