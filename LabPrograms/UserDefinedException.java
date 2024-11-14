
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
public class UserDefinedException {
    public static void main(String[] args)   {
        int n =100;
        int userInput = 150;
        try{
            if(userInput>n){
                throw new MyException("Input is Greather than "+n);
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
    
}
