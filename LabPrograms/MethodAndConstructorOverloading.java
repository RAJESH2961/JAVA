class ConstructorDemo{
    //Constructor Overloading
    public ConstructorDemo(){
        System.out.println("Default Constructor");
    }

    public ConstructorDemo(int param){
        System.out.println("Parameterized Constructor with Integer :"+param);
    }

    public ConstructorDemo(String param ){
        System.out.println("Parameterized Constructor with String :"+param);
    }
    //Method Overloading
    void display(int data){
        System.out.println("Integer Data :"+data);
    }

    void display(double data){
        System.out.println("Double Data :"+data);
    }

}

public class MethodAndConstructorOverloading {
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(10);
        ConstructorDemo obj2 = new ConstructorDemo("Hello");

        obj.display(10);
        obj.display(10.00);
        
    }
    
}
