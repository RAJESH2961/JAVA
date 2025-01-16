public class SqrtOfNumber {
    // T.C = O(n) S.C = O(1)
    public static int sqrtBrute(int n){
        // int sqrt = 1;
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if((i*i)<=n){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static int sqrtOptimal(int n){
        int ans = 0;
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = (low + high)/2;
            if((mid*mid)<=n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 39;
        System.out.println("Square Root of "+sqrtBrute(n));
        System.out.println("Square Root of "+sqrtOptimal(n));
    }
    
}
