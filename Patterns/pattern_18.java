public class pattern_18 {
    public static void main(String[] args) {
        int n=5;
        // char ch = 'E';
        for(int i=0; i<n; i++){
            for (char ch = (char) ('E' - i); ch<='E'; ch++){
                System.out.print(ch +" ");
                // ch--;
            }
            System.out.println();
        }
    }
    
}
