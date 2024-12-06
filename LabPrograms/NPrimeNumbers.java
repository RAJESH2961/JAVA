class NPrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        int n = 5;
        while(count < n){
            if (isPrime(num)){
                System.out.println(num+" ");
                count++;
            }
            num++;
        }
    }

    static boolean isPrime(int num){
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num % i == 0 ){
                return false;
            }
        }
        return true;
    }
    
}
