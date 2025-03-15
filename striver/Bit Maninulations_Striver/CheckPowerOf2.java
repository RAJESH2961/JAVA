public class CheckPowerOf2 {
    public static void main(String[] args) {
        int n = 13;
        if((n & (n-1)) == 0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
    
}
