public class PrimeNumber {
    public static void main(String[] args) {
        int cnt = 0;
        int n = 12;
        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                cnt +=1;
            }
        }
        if(cnt == 2){
            System.out.println("Prime Number");
        }
    }
    
}
