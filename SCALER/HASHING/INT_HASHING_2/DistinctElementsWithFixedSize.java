
import java.util.HashMap;
import java.util.HashSet;

public class DistinctElementsWithFixedSize{

    public static void brute(int[] arr, int k) {
    int n = arr.length;
    for (int i = 0; i <= n - k; i++) {
        HashSet<Integer> set = new HashSet<>();
        for (int j = i; j < i + k; j++) {
            set.add(arr[j]);
        }
        System.out.print(set.size() + " ");
    }
}


    public static void optimal(int[] arr, int k) {
    int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();

    // First window
    for (int i = 0; i < k; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    System.out.print(map.size() + " ");

    // Slide the window
    for (int i = k; i < n; i++) {
        // Remove the leftmost element of the previous window
        int left = arr[i - k];
        map.put(left, map.get(left) - 1);
        if (map.get(left) == 0) {
            map.remove(left);
        }

        // Add the new element
        int right = arr[i];
        map.put(right, map.getOrDefault(right, 0) + 1);

        // Print the number of distinct elements in the current window
        System.out.print(map.size() + " ");
    }
}

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3,1,5};
        int k = 4;
        optimal(arr, k);
        System.out.println(".()");
        brute(arr,k);
    }
}