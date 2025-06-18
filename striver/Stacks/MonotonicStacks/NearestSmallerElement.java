
import java.util.Stack;

public class NearestSmallerElement {
    /**
     *  NearestSmallerElement is used to find the smallest element 
     * 
     * @param input is an array receiving from main function
     */
    public static int[] nearestSmallerElementOptimal(int arr[]) {
        // Size of an Input array
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        // array to store values
        int nse[] = new int[n];
        for(int i = 0; i<n; i++){
            while(stack.isEmpty() == false && stack.peek() >= arr[i]) {
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
    /**
     * Main funciton
     */
    public static void main(String[] args) {
        int arr[] = {4,5,2,10,8};
        int[] sol = nearestSmallerElementOptimal(arr);

        for(int data: sol){
            System.out.print(data+",");
        }

    }
}
