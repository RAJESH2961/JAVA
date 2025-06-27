public class ConstantWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int sum = 0;

        // Step 1: Compute sum of first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum; // store max seen so far

        // Step 2: Slide the window
        int left = 0;
        int right = k - 1;
        int size = arr.length -1;

        while (right < size) {
            sum = sum - arr[left]; // remove leftmost
            left++;
            right++;
            sum = sum + arr[right]; // add new right
            maxSum = Math.max(maxSum, sum); // update max
        }

        System.out.println("Maximum sum : " + maxSum);
    }
}
