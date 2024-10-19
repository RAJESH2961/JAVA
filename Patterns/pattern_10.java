public class pattern_10 {
    public static void main(String[] args) {
        int n=5;
        // Method-1
        // for(int i=1; i<=(2*n-1); i++){
        //     // System.out.println("*");
        //     int stars = i;
        //     if(i>n) stars= 2*n-i;
        //     for(int j=0; j<stars; j++){
        //             System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
        // /Method-2

        for(int i=0; i<=n; i++){
            for(int j=0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<=n-i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
