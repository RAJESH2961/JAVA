import java.util.Stack;

public class NearestSmallerDistence {
    public static int[] nearestSmallerDistance(int arr[]) {
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
                nse[i] = arr[i]-stack.peek();
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
        int[] sol = nearestSmallerDistance(arr);

        for(int data: sol){
            System.out.print(data+",");
        }

    }
}