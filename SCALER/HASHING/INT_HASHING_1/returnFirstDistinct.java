
import java.util.HashMap;

// Problem statement 
// given an array and n array return the frequency of every element in nth array
// Time complexity
// O(N*Q)
public class returnFirstDistinct {

    public static int brute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {  // Check if duplicate exists
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                return arr[i];  // First distinct element found
            }
        }
        return -1;  // No distinct element found
    }


    public static int optimal(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // First pass: Build frequency map (O(n))
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Second pass: Find first element with frequency 1 (O(n))
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }
        
        return -1; // No distinct element found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 1, 3, 5};
        int n[] = {1, 2};
        int sol = brute(arr);
        int sol1 = optimal(arr);
        System.out.println("Brute First Distinct ELement :" + sol);
        System.out.println("Optimal First Distinct ELement :" + sol1);
        // int[] sol = optimal(arr, n);
        // System.out.println("Brute Force Approach :");
        // for(int i = 0;i < n.length; i++){
        //     System.out.println("Frequency of "+n[i]+" is "+sol[i]);
        // }

    }
}
