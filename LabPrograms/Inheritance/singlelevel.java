// Base Class
class Animal {
    // Method of base class
    void eat() {
        System.out.println("Animal is eating");
    }
}
// Derived Class
class Dog extends Animal {
    // Method of derived class
    void bark() {
        System.out.println("Dog is barking");
    }
}
// Main Class
public class singlelevel {
    public static void main(String[] args) {
        // Create an object of Dog class
        Dog dog = new Dog(); 
        // Access methods from both base class and derived class
        dog.eat();  // Output: Animal is eating (inherited from Animal class)
        dog.bark(); // Output: Dog is barking (defined in Dog class)
    }
}