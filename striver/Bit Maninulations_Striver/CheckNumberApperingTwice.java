
import java.util.*;

public class CheckNumberApperingTwice {
    public static int[] findTwoUniques(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the two numbers that appear exactly once
        int[] result = new int[2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result[index++] = entry.getKey();
            }
        }

        return result;
    }

    public static int[] optimal(int[] nums){
        int ans[] = new int[2];
        //Finding Xorr of Two Numbers
        int xorr = 0;
        for(int i =0; i<nums.length;i++){
            xorr = xorr^nums[i];
        }

        long rightMostBit = ((xorr&(xorr-1))&xorr);
        int b1 = 0;
        int b2 = 0;
        for(int i =0; i<nums.length; i++){
            if((nums[i] & rightMostBit) !=0){
                b1 = b1^nums[i];
            }
            else{
                b2 = b2^nums[i];
            }
        }
        ans[0]=b1;
        ans[1]=b2;
        return  ans;
    }

    // Demo
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 2, 3, 7}; // 5 and 7 are unique
        int[] result = findTwoUniques(nums);
        int[] result1 = optimal(nums);
        System.out.println("Unique numbers are: " + result[0] + " and " + result[1]);
        System.out.println("Unique numbers are: " + result1[0] + " and " + result1[1]);
    }
}
