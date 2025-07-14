
import java.util.HashMap;


// Problem statement 
// given an array and n array return the frequency of every element in nth array

// Time complexity
// O(N*Q)
public class returnFreq{
    public static int[] brute(int arr[], int n[]){
        int cnt[] = new int[n.length];
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt[i]++;
                }
            }
        }
        return cnt;
    }
    //O(N+Q)
    // O(n)
    public static int[] optimal(int arr[], int[] n){
        // Hashmap to store elements
        HashMap<Integer, Integer> hm = new HashMap<>();
        // storing elements in hashmap
        for(int data:arr){
            hm.put(data, hm.getOrDefault(0, data)+1);
        }

        // Stroing frequency in cnt array
        int cnt[] = new int[n.length];
        for(int i = 0; i < cnt.length; i++){
            cnt[i] = hm.get(n[i]);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,1,3,5};
        int n[] = {1,2};
        // int[] sol = brute(arr, n);
        int[] sol = optimal(arr, n);
        System.out.println("Brute Force Approach :");
        for(int i = 0;i < n.length; i++){
            System.out.println("Frequency of "+n[i]+" is "+sol[i]);
        }

    }
}