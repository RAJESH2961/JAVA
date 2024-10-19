public class pattern_8 {
    public static void main(String[] args) {
        int n=5;
        // * * * * * * * * * [0,9,0]
        //   * * * * * * *   [1,7,1]
         //    * * * * *     [2,6,2]
           //    * * *       [3,3,3]
             //    *         [4,1,4]

        for(int i=0;i<n;i++){
            //spaces
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=0; j<2*n-(2*i+1); j++ ){
            System.out.print("* ");
            }
            //spaces
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
         
        System.out.println();
         } 
    
}
}
