public class CountNoOfSetBits {
    public static void main(String[] args) {
        int  n = 13;
        int cnt = 0;
        //Method-1
        while(n > 1){
            // if(n %2 == 1) cnt++;
            cnt = cnt+(n&1); //n&1 returns 1 if the  number is odd
            // n = 13
            // 1 1 0 1 13
            // 0 0 0 1 1
            // 0 0 0 1 //Returns 1 if it is odd
            // n = 12 
            // 1 1 0 0
            // 0 0 0 1
            // 0 0 0 0 // Returns 0
            n = n>>1;
        }
        if(n==1) cnt++;
        System.out.println(cnt);

        //Method-2
        int num = 13;
        int count = 0;
        while(num != 0){
            num = (num&num-1);
            count++;
            // n = 84
            // 1 0 1 0 1 0 0 n
            // 1 0 1 0 0 1 1 &n-1
            // -------------
            // 1 0 1 0 0 0 0 n
            // 1 0 0 1 1 1 1 &n-1
            //---------------
            // 1 0 0 0 0 0 0
            // 0 1 1 1 1 1 1
            // 0 0 0 0 0 0 0
        }
        System.out.println(count);
    }
    
}
