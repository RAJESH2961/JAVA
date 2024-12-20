public class CountSubarray_k{
    public static int brute(int arr[], int n, int target){
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                // we need to calculate sum from i-j
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum +=arr[k];
                }
                if(sum == target){
                    count++;
                }
            }
        }
        return count;

    }

    public static int better(int arr[], int n, int target){
        int count = 0;
        for(int i = 0; i<n; i++){
            int sum = 0;

            for(int j = i; j<n; j++){
                // we need to calculate sum from i-j
                // for(int k = i; k<=j; k++){
                    sum +=arr[j];
                // }
                if(sum == target){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        // System.out.println("Count :"+brute(arr, arr.length, 3));
        System.out.println("Count :"+better(arr, arr.length, 6));
    }
}