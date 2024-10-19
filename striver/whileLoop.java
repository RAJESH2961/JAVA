// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class whileLoop {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int array [] = {11,22,3,14,5,6,37,18,9,10};
        int target = 18;
        for(int num : array){
            if(num % 2 == 0){
                if(num == target){
                    System.out.println("target found"+num);
                }

            }
        }
        


        // for(int i=0 ; i< array.length; i+=2){
        //     if(array[i] == target){
        //         System.out.println("Target : "+array[i]);
        // }
        // else{
        //     System.out.println("Target Not found ");

        // }
        // }
        
        
        // for (int num : array){
        //     if (num == target){
        //             System.out.println("Target : "+num);
        //             break;

        //     }
        // }
        
        // System.out.println("Factorial : "+factorial);
    }
}