public class Factorial_Of_Number {

    int factorial(int n){
        if (n < 1 ){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Factorial_Of_Number obj = new Factorial_Of_Number();
        
        System.out.println(obj.factorial(5));
        
    }
    
}
