public class PrimeNumber {
    public static void main(String[] args) {
        int number = 4;
        int count =0;
        for(int i=1; i<=number; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Given Number is Prime");
        }
        else{
            System.out.println("Not a prime");
        }
    }
    
}
