class Arithmetic {
    double add(int a, int b){
        return a+b;
    }
    double sub(int a, int b){
        return a-b;
    }
}
class Multiplication extends Arithmetic{
    double mul(int a, int b){
        return a*b;
    }
}

class Division extends Arithmetic{
    double div(int a, int b){
        if(a!=0){
            return a/b;
        }
        else{
            System.out.println("Cant Divide a NUmber By Zero");
            return Double.NaN;
        }
    }
}

public class HierachialInheritance {
    public static void main(String[] args) {
        Division obj = new Division();
        Multiplication obj1 = new Multiplication();
        System.out.println("Addition Of Two Numbers is : "+obj.add(10,20));
        System.out.println("Subtraction Of Two Numbers is : "+obj.sub(10,20));
        System.out.println("Multiplication Of Two Numbers is : "+obj1.mul(10,20));
        System.out.println("Division Of Two Numbers is : "+obj.div(10,20));
        
    }
    
}
