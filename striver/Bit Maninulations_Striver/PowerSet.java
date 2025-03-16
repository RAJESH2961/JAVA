import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        // Add elements to test (example)
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        ArrayList<ArrayList<Integer>> powerSet = new ArrayList<>();
        int n = nums.size();
        int totalSubsets = 1 << n;  // 2^n subsets

        for (int mask = 0; mask < totalSubsets; mask++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums.get(i));
                }
            }
            powerSet.add(subset);
        }

        // Print results
        for (ArrayList<Integer> subset : powerSet) {
            System.out.println(subset);
        }
    }
}
