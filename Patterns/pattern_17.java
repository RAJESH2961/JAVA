public class pattern_17 {
    public static void main(String[] args) {
        //spaces data spaces
        //0123A
        //012ABA
        //01ABCBA
        //0ABCDBCA
        //ABCDEDCBA
        int n=5;
        for (int i = 0; i < n; i++) {

            for(int j=0; j<n-i-1;j++){
                System.out.print("  ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;

            for(int j=0; j<(2*i+1); j++){
                System.out.print(ch +" ");
                // ch++;
                if(j<breakpoint){
                    ch++;
                }
                else ch--;
            }

            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
