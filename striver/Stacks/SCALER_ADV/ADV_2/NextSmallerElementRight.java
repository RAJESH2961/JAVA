import java.util.Stack;

public class NextSmallerElementRight {
    static int[] nge(int arr[]){
        int[] sol = new int [arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1; i>=0; i--) {

            while(stack.isEmpty() == false &&  stack.peek() >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty() == true){
                sol[i] = -1;
            } else {
                sol[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        int[]ans = nge(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(ans[i] +" ");
        }
        
    }
}
