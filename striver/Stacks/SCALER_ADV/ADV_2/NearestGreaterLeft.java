import java.util.Stack;

public class NearestGreaterLeft {
    public static int[] nearestGreaterLeft(int arr[]) {
        // Size of an Input array
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        // array to store values
        int nse[] = new int[n];
        for(int i = 0; i<n; i++){
            while(stack.isEmpty() == false && stack.peek() <= arr[i]) { // Change the condition only same code as NearestSmallerElement
                stack.pop();
            }
            if(stack.isEmpty()) {
                nse[i] = -1;
            } else {
                nse[i] = stack.peek();
            }

            stack.push(arr[i]);
        }
        return nse;
    }
    public static void main(String[] args) {
        int arr[] = {14,5,2,1,8};
        int[] sol = nearestGreaterLeft(arr);

        for(int data: sol){
            System.out.print(data+",");
        }
    }
}
