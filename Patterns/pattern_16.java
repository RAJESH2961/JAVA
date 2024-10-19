public class pattern_16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            char ch = (char) ('A'-1 + i);
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();



        }
    }
    
}
