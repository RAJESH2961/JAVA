public class findingMissingNumber {
    static int brute(int arr[], int n) {
        for (int i = 1; i <= n + 1; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i; // Return the missing number
            }
        }
        return -1; // Return -1 if no missing number is found
    }

    static int better(int arr[], int n) {
        int hashing[] = new int[n + 2];
        // Marking the presence of each value in arr[] in the hashing array
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n + 1) { // Ensure we only mark within the bounds
                hashing[arr[i]] = 1;
            }
        }
        // returning the Missing ELement
        for (int i = 1; i <= hashing.length; i++) {
            if (hashing[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    static int optimalbetter(int arr[], int n) {
        // sum = n*n+1/2 why?? here n+1 * n+2 because we are finding 1 missing element so wee need to add +1 in the n
        int sum = (n + 1) * (n + 2) / 2;
        int array_sum = 0;
        for (int i = 0; i < n; i++) {
            array_sum+= arr[i];
        }
        System.out.println(sum);
        System.out.println(array_sum);

        return (sum - array_sum);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        // System.out.println("Missing number: " + brute(arr, arr.length));
        // System.out.println("Missing number: " + better(arr, arr.length));
        System.out.println("Missing number: " + optimalbetter(arr, arr.length));
    }
}
