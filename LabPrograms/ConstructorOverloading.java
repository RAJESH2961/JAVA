public class ConstructorOverloading {

    void display(int a){
        System.out.println("Integer Value :");
    }

    public ConstructorOverloading(){
        System.out.println("Defalult Constructor");
    }

    public ConstructorOverloading(int a ){
        System.out.println("Paramaterized  Constructor with Integer Value :"+a);
    }

    public ConstructorOverloading(String s){
        System.out.println("Paramaterized  Constructor with String Value :"+s);
    }


    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
    }
    
}
