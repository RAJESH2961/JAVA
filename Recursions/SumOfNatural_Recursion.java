public class SumOfNatural_Recursion {
void print(int i , int sum ){
    if (i < 1){
        System.out.println(sum);
        return;
    }
    print(i-1 , sum+i);
}

    public static void main(String[] args) {
        SumOfNatural_Recursion obj = new SumOfNatural_Recursion();
        obj.print(5 , 0);
    }
    
}
