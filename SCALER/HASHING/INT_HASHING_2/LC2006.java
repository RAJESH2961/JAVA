
import java.util.HashMap;

public class LC2006 {
    public static int countKDifference(int[] nums, int k) {
        // Using hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int data : nums) {
            hm.put(data, hm.getOrDefault(data, 0) + 1);
        }

        int cnt = 0;
        for (int key : hm.keySet()) {
            // |a - b| == k
            // a - b == k
            // b - 1 == k
            // b = a + k
            int b = key + k;
            if (hm.containsKey(b)) {
                // cnt = 1 * 2
                // 2 *2 = 4
                cnt += hm.get(key) * hm.get(b);
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        System.out.println("The Difference is");
        System.out.println("Optimal "+countKDifference(arr,1));
    }
}

