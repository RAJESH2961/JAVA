public class SumOfSubArraysMin {
    static int brute(int arr[]) {
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = i; j<n; j++){
                min = Math.min(min, arr[j]);
                sum = sum + min;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,3,7,8,1};
        System.out.println("Brute Force Solution : "+brute(arr));
    }
}
