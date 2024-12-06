public class MooreVotingAlgo {
    
    public static int moore(int arr[], int n) {
        int ele = 0;  // candidate for majority element
        int cnt = 0;  // count of current candidate
        
        // First pass to find potential majority element
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                ele = arr[i];  // New candidate
                cnt = 1;  // Reset the count
            } else if (arr[i] == ele) {
                cnt++;  // Increase count if current element matches the candidate
            } else {
                cnt--;  // Decrease count if current element does not match
            }
        }

        // Second pass to verify if the candidate is actually the majority
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) cnt1 = cnt1+1;  // Count occurrences of the candidate
            
        }

        // If candidate occurs more than n/2 times, return the candidate
        if (cnt1 > (n / 2)) {
            return ele;
        }
        // If no majority element, return -1
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2,2,2,2,2,2,2,2, 2, 1, 1, 1, 3, 4};
        
        System.out.println(moore(arr, arr.length));  // Output will be the majority element or -1
    }
}
