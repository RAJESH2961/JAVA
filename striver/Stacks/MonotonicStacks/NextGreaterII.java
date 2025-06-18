import java.util.Stack;

public class NextGreaterII {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];

        for (int i = 0; i < n; i++) {
            nge[i] = -1; // default value if no greater element found
            for (int j = i + 1; j < i + n; j++) {
                int index = j % n;
                if (nums[index] > nums[i]) {
                    nge[i] = nums[index];
                    break; // stop after finding the first greater element
                }
            }
        }
        return nge;
    }
    public static int[] nextGreaterElementsOptimal(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2*n-1; i >= 0; i--) {
            nge[i%n] = -1; // default value if no greater element found
            while(stack.isEmpty()==false && stack.peek() <= nums[i%n]){
                stack.pop();
            }
            if(stack.isEmpty() == true){
                nge[i%n] = -1;
            } else {
                nge[i%n] = stack.peek();
                // break;
            }
            stack.push(nums[i%n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int arr[] = {2,10,12,1,11};
        // System.out.println();
        int[]ans = nextGreaterElements(arr);
        int[]optimalAns = nextGreaterElementsOptimal(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(ans[i] +" ");
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print(optimalAns[i] +" ");
        }

    }
}
