class print_1_n{
    // Head recurion
    public static void recursion(int n){
        // Base case
        if(n == 0) return;
        recursion(n-1);
        System.out.println(n);
    }
    public static void tailRecursion(int i,int n){
        // Base case
        if(i > n) return;
        System.out.println(i);
        tailRecursion(i+1, n);
        
    }
    public static void main(String[] args) {
        System.out.println("Head recursion  ");
        recursion(5);
        System.out.println("Tail Recursion");
        tailRecursion(1,5);
    }
}