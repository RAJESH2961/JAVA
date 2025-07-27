class PrintX_N_Times{
    public static void recursion(int x, int n){
        // Base case 
        if(n == 0) return;
        
        recursion(x, n-1);
        // Tail Recursion
        System.err.println("Recursion call time : "+(n)+" "+x);
    }

    public static void headRecursion(int i,int x, int n){
        // Base case 
        if(i > n) return;
        // Head Recursion
        headRecursion(i, x, n-1);
        System.err.println("Recursion call time : "+(n)+" "+x);
    }
    public static void headRecursion1(int x, int n){
        // Base case 
        if(n < 1) return;
        // Head Recursion
        headRecursion1(x, n-1);
        System.err.println("Recursion call time : "+(n)+" "+x);
    }
    public static void main(String[] args) {
        recursion(11, 8);
        headRecursion(1,22,8);
        headRecursion1(33,8);
    }
}