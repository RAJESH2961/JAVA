import java.util.ArrayList;
import java.util.List;

class demo {
    public static int xorAllNums(int[] nums1, int[] nums2) {
            // int xor1 = 0;
            // int xor2 = 0;
            
            // // XOR all elements in nums1
            // for (int num : nums1) {
            //     xor1 ^= num;
            // }
            
            // // XOR all elements in nums2
            // for (int num : nums2) {
            //     xor2 ^= num;
            // }
            
            // // If the length of nums1 is odd, include xor2, otherwise return xor1.
            // if (nums1.length % 2 == 0) {
            //     xor2 = 0;
            // }
    
            // // If the length of nums2 is odd, include xor1, otherwise return xor2.
            // if (nums2.length % 2 == 0) {
            //     xor1 = 0;
            // }
            
            // return xor1 ^ xor2;
            List<Integer> arr = new ArrayList<>();
            for(int i=0; i<nums1.length; i++){
                for(int j = 0; j<nums2.length; j++){
                    arr.add(nums1[i]^nums2[j]);
                }
            }
            System.out.println(arr);
            int finalAns=0;
            for(int num : arr){
                finalAns = finalAns^num;
            }
            return finalAns;
        }

        public static void main(String[] args) {
            int[] num1 = {2, 1 ,3};
            int[] num2 = {10 ,2, 5, 0};
            System.out.println(xorAllNums(num1,num2));
    }
}

