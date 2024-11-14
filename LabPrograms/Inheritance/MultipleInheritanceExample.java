// Interface A with a method declaration
interface A {
    void methodA();
}

// Interface B with another method declaration
interface B {
    void methodB();
}

// Class C implements both interfaces A and B
class C implements A, B {
    // Provide implementation for methodA
    public void methodA() {
        System.out.println("Method from Interface A");
    }
    
    // Provide implementation for methodB
    public void methodB() {
        System.out.println("Method from Interface B");
    }
}

// Main class to test multiple inheritance through interfaces
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();  // Calls methodA from Interface A
        obj.methodB();  // Calls methodB from Interface B
    }
}
