import java.util.Arrays;
import java.util.Stack;
public class LargestRectangle {
    private static int[] nsl(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int nsl[] = new int[arr.length];
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            while(stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        return nsl;
    }

    private static int[] nsr(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int nsr[] = new int[arr.length];
        int n = arr.length;
        for(int i = n-1; i >= 0; i--) {
            while(stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        return nsr;
    }
    public static int largestRectangleArea(int[] heights) {
        int nsr[] = nsr(heights);
        int nsl[] = nsl(heights);
        int area = 0;
        System.out.println(Arrays.toString(nsl));
        System.out.println(Arrays.toString(nsr));
        for(int i = 0; i < heights.length; i++) {
            int width = nsr[i] - nsl[i] -1;
            int height = heights[i];
            area = Math.max(area, (width*height));
        }
        return area;
    }
    public static void main(String[] args) {
        // int height[] = {2,1,5,6,2,3};
        int height[] = {4,4,4,4};
        System.out.println(largestRectangleArea(height));
    }
}