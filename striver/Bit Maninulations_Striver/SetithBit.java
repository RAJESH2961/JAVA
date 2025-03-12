public class SetithBit {
    public static void main(String[] args) {
        int n = 9;
        int i = 2;
        System.out.println(n | (1<<i));
        // 3 2 1 0 Index
        // 1 0 0 1 //9
        // 0 1 0 0
        //--------
        // 1 1 0 1 //13

        // 3 2 1 0 Index
        // 1 1 0 1 //13
        // 0 1 0 0
        //--------
        // 1 1 0 1 //13
    }
    
}
