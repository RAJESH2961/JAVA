public class toggleithBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        System.out.println(n^(1<<i));
        // 1 1 0 1
        // 0 1 0 0
        //--------
        // 1 0 0 1
    }
    
}
