
import java.util.HashMap;
import java.util.HashSet;

public class checkpair {

    public static boolean brute(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean better(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int b = k - a;
            for (int j = i + 1; j < n; j++) {
                // if(arr[i] + arr[j] == k){
                //     return true;
                // }
                if (arr[j] == b) {
                    return true;
                }
            }
        }
        return false;
    }
    // Optimal approahc usinh hashmaps
    public static boolean optimal(int arr[], int k) {
        // Storing elements into hashmap
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int data : arr) {
        hm.put(data, hm.getOrDefault(data, 0) + 1);
    }

    for (int a : arr) {
        int b = k - a;
        // Only two conditions a==b && a!=b
        if (a != b) {
            if (hm.containsKey(b)) {
                return true;
            }
        } else {
            if (hm.get(b) > 1) {
                return true;
            }
        }
    }
    return false;
}

// Solving using only hashset
public static boolean optimalHashset(int arr[], int n){
    // Decalring HashSet
    HashSet<Integer> hs = new HashSet<>();
    for(int a:arr){
        if(hs.contains(a)){
            return true;
        } else {
            hs.add(a);
        }
    }
    return false;
}


    public static void main(String[] args) {
        int arr[] = {11, 2, 3, 4, 5, 11, 2, 4};
        int k = 22;
        System.out.println("Brute : " + brute(arr, k));
        System.out.println("Slight Better : " + better(arr, k));
        System.out.println("Optimal : " + optimal(arr, k));
        System.out.println("Optimal using Hashset : " + optimalHashset(arr, k));
    }
}
