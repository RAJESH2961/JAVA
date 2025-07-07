
class Employee {

    // Fields / Attributes
    int id;
    String name;
    double salary;

    // 1. Default Constructor
    Employee() {
        System.out.println("Default constructor called.");
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
    }

    // 2. Parameterized Constructor
    Employee(int id, String name, double salary) {
        System.out.println("Parameterized constructor called.");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 3. Copy Constructor
    Employee(Employee other) {
        System.out.println("Copy constructor called.");
        this.id = other.id;
        this.name = other.name;
        this.salary = other.salary;
    }

    // 4.  Constructor Chaining (Nested constructor call using this())
    Employee(int id, String name) {
        this(id, name, 25000); // Calls the parameterized constructor
        System.out.println("Constructor with id and name called.");
    }

    // Method to display employee data
    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
    }
}
public class Constructor {
    public static void main(String[] args) {
        // Using Default Constructor
        Employee emp1 = new Employee();
        emp1.displayInfo();

        System.out.println("------------------");

        // Using Parameterized Constructor
        Employee emp2 = new Employee(101, "Alice", 50000);
        emp2.displayInfo();

        System.out.println("------------------");

        // Using Copy Constructor
        Employee emp3 = new Employee(emp2);
        emp3.displayInfo();

        System.out.println("------------------");

        // Using Nested Constructor (Chaining)
        Employee emp4 = new Employee(102, "Bob");
        emp4.displayInfo();
    }
}
