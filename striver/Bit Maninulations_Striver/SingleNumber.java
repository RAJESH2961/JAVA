import java.util.ArrayList;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(3);

        HashMap<Integer, Integer> mpp = new HashMap<>();

        // Count occurrences correctly
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        // Find and print the single number
        for (int key : mpp.keySet()) {
            if (mpp.get(key) == 1) {
                System.out.println("Single Number: " + key);
            }
        }

        //-------------------------------
        int xor = 0;
        for(int i = 0; i<nums.size(); i++){
            xor = xor^nums.get(i);
        }
        System.out.println(xor);
    }
}
