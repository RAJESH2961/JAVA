import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerIndex {
    public static int[] nextSmallerIndex(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(i);
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3,1};
        System.out.println(Arrays.toString(nextSmallerIndex(arr)));
    }
}
