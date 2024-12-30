

public class MaxProductSubArray {
    public static int brute(int arr[]){
        //Time Complexicity of the Brute Force Approach is O(N^3) we need to reduce to O(N^2)
        int n = arr.length;
        int result = Integer.MIN_VALUE;
        for(int i=0; i < n-1; i++){
            for(int j = i+1; j<n; j++){
                int product = 1;
                for(int k=i; k<=j; k++){
                    product = product*arr[k];
                }
                result = Math.max(result, product);
            }
        }
        return result;
    }
    public static int better(int arr[]){
        //Time Complexicity of the Better Approach is O(N^2) we need to reduce to O(N)
        int n = arr.length;
        int result = Integer.MIN_VALUE;
        for(int i=0; i < n-1; i++){
            int product = arr[i];
            for(int j = i+1; j<n; j++){
                product = product*arr[j];
                result = Math.max(result, product);
            }
        }
        return result;
    }
    public static int optimal(int arr[]){
        int n = arr.length;
        int pre = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
            pre *=arr[i];
            suff *= arr[n-i-1];
            System.out.println(suff);
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4};
        // System.out.println(brute(arr));
        // System.out.println("Brute Force Approach is :"+brute(arr));
        // System.out.println("Better Approach is      :"+better(arr));
        System.out.println("optimal Approach is      :"+optimal(arr));
    }
    
}
