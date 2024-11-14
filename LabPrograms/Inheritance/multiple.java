// interface father{
//     void swimming(){
//         System.out.println("My Father taught me swimming");
//     }
// }

// interface mother{
//     void cooking(){
//         System.out.println("My mother taught me how to cook");
//     }
// }

// class child implements father,mother{

// }
// class multiple{
//     public static void main(String[] args) {
//         child c1 = new child();
//         c1.cooking();
//         c1.swimming();
//     }
// }

// Interface for father with a default method
interface Father {
    default void swimming() {
        System.out.println("My Father taught me swimming");
    }
}

// Interface for mother with a default method
interface Mother {
    default void cooking() {
        System.out.println("My mother taught me how to cook");
    }
}

// Class child implements both Father and Mother interfaces
class Child implements Father, Mother {

}

// Main class to test the Child class
public class multiple {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.cooking(); // Calls the cooking method from Mother
        c1.swimming(); // Calls the swimming method from Father
    }
}
