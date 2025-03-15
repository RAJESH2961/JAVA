public class RemoveLastSetBit {
    public static void main(String[] args) {
        // int n = 16;
        int n = 40;
        // int n = 84;

        System.out.println(n&n-1);
        // 1 0 0 0 0 0 n
        // 0 1 1 1 1 1 n-1
        //--------------- &&
        // 0 0 0 0 0 0

        // n = 40
        // 1 0 1 0 0 0 n  = 40
        // 1 0 0 1 1 1 n = 39
        //--------------
        // 1 0 0 0 0 0  40 & 39
    }
    
}
