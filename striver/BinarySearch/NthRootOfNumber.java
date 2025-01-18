public class NthRootOfNumber {
    public static int fun(int i, int m){
        int ans = (i*i*i);
        // System.err.println(ans);
        return ans;
    }
    public static int brute(int n, int m){
        for(int i = 1; i<=n; i++){
            int ans = (i*i*i);
            System.out.println(ans);
            if((fun(i, m)) == m){//or (i*i*i) will work but readibility purpose we are writing another function
                return i;
            }
        }
        return -1;
    }

    public static int optimal(int n, int m){
        int low = 0;
        int high = m;
        while(low <= high){
            int mid = (low + high)/2;
            int val = (fun(mid, m));
            if(val == m){
                return mid;
            }
            else if(val > m){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int n = 3, m = 27;
        // o/p = 3
        // System.out.println("Brute :"+brute(n, m));
        System.out.println("optimal :"+optimal(n, m));
        

    }
    
}
