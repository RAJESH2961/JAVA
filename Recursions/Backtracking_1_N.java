public class Backtracking_1_N {
    // 1 2 3 4 5 
    void print(int i , int n){
        if(i < 1 ){
            return;
        }
        print(i-1 , n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        Backtracking_1_N obj = new Backtracking_1_N();
        obj.print(5,5);
        
    }
    
}
