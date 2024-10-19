public class Functional_Recursion_Sum_Of_Natural {

    int print(int i ){
        if(i < 1){
            return 0;
        }
        return i + print(i-1);
    }

    public static void main(String[] args) {
        Functional_Recursion_Sum_Of_Natural obj = new Functional_Recursion_Sum_Of_Natural();
        System.out.println(obj.print(5));
    }
    
}
