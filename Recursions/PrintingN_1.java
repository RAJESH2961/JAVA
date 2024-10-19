public class PrintingN_1{
    //5 4 3 2 1
    // n = 5;
    void print(int i , int n){
        if(i < 1 ){
            return;
        }
        System.out.println(i);
        print(i-1 , n);

    }
    public static void main(String[] args) {
        PrintingN_1 obj = new PrintingN_1();
        obj.print(5,5);
        
    }
}