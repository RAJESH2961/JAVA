public class ClearithBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        System.out.println(n &~(1<<i));
        //Step-1 negation of (1<<i) amd perform & operation in 2nd
        // 3 2 1 0 Index
        // 1 1 0 1 -->9
        // 1 0 1 1 -- ~(1<<2)
        // --------
        // 1 0 0 1 (After Performing '&')
    }
    
}
