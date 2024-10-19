public class PrintingNumbers{
//printing NUmbers form 1-n
    void printing(int i , int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        printing(i+1, n);

    }
    public static void main(String[] args) {
        PrintingNumbers obj = new PrintingNumbers();
        obj.printing(1,5);
        
    }
}