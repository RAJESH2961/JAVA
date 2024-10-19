public class PrintDivisors {
    public static void main(String[] args) {
        int data = 36;
        for(int i=1; i<=data; i++){
            if(data % i ==0){
                System.out.println("Divisors are : "+i);
            }
        }

    }
    
}
