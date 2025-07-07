class student{
    int rollNo;
    String name;
    float marks;
    // Default constructor
    student(){
        rollNo = 12;
        name = "Default";
        marks = 99;
    }
    // constructor
    // student Rajesh = new student();
    // Internally how it stored is
    // Rajesh.rollNo = 16
    // Rajesh.name = "Rajesh"
    // Rajesh.marks = 99.9f
    student(int rollNo, String name, float marks){
        this.rollNo = rollNo; // rollNO = rollNo equal it is an name conflict
        this.name = name;
        this.marks = marks;
    }
}

public class ClassesObjects{
    public static void main(String[] args) {
        student Rajesh; // Object decalration
        // Rajesh = new student(); // Object Initialization

        // Calling default constructor
        student defaultStudent = new student();
        System.out.println("Default value :"+defaultStudent.rollNo);
        System.out.println("Default value :"+defaultStudent.name);
        System.out.println("Default value :"+defaultStudent.marks);

        // Calling constructor 
        // Here student is an constructor basically we call default constructor
        // Rajesh = new student(); // Object Initialization
        Rajesh = new student(201, "Rajesh", 100.0f);
        System.out.println("Address of the object :"+Rajesh);
        System.out.println(Rajesh.rollNo); // Accessing class variables
        System.out.println(Rajesh.name); // DEfault value will be printed
        System.out.println(Rajesh.marks);// DEfault value will be printed
    }
}