public class prime {
    // Approach-1
    // we know that an prime number has only two factors i.e divisible by 1 and it self
    // so we ignore those and check if it divisible by some other number or not
    public static boolean prime1(int n){
        boolean isPrime = true;
        // 1 2 3 4 5 6 7 8 9 10 11 12 13
        // |                           |
        // Ignore these two 
        for(int i = 2; i < n; i++) {
            if(n % i == 0){
                isPrime = false;
                break;
            } else {

            }
        }
        return isPrime;
    }
    // Method -2 we gonna chack until the sqrt
    // ex : 36
    // 1 x 36 = 36
    // 2 x 18 = 36
    // 3 x 12 = 36
    // 4 x 9 = 36
    // 6 x 6 = 36
    // 9 x 4 = 36
    // |.  | = |
    // here the repaeting occured 
    // if 4*9 = 36 == 9*4 = 36 so dont need to check again we need to check until the sqrt
    public static boolean prime2(int n){
        boolean isPrime = true;
        // 1 2 3 4 5 6 7 8 9 10 11 12 13
        // |                           |
        // Ignore these two 
        for(int i = 2; i*i < n; i++) {

            if(n % i == 0){
                isPrime = false;
                break;
            } 
        }
        return isPrime;
    }
    public static void printingPrime(int n){
        for(int i = 1; i <=n; i++) {
            System.out.println(i+" "+ prime2(i));
        }
    }
    public static void main(String args[]) {
        int n = 12;
        System.out.println(prime1(n));
        System.out.println(prime2(n));
        System.out.println("Printing prime numbers upto 10");
        printingPrime(10);

        

    }
}