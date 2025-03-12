public class IthElementSetorNot {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        // Method-1 Left Shift Operator
        if((n & (1<<i)) !=0){
            System.out.println("Set");
        }
        else{
            System.out.println("Not a Set");
        }
        // Method-2 Right Shift

        if(((n>>i)&1)==0){
            System.out.println("Un set");
        }else{
            System.out.println("set");
        }
    }
    
}
