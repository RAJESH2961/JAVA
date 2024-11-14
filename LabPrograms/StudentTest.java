import java.util.Scanner;
class Student {
String hallTicket, name, department;
public Student(String hallTicket, String name, String department) {
this.hallTicket = hallTicket;
this.name = name;
this.department = department;
}
public void display() {
System.out.println("Hall Ticket: " + hallTicket);
System.out.println("Name: " + name);
System.out.println("Department: " + department);
}
}

public class StudentTest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of students: ");
int n = sc.nextInt();
Student[] students = new Student[n];
for (int i = 0; i < n; i++) {
System.out.print("Enter Hall Ticket: ");
String hallTicket = sc.next();
System.out.print("Enter Name: ");
String name = sc.next();
System.out.print("Enter Department: ");
String department = sc.next();
students[i] = new Student(hallTicket, name, department);
}
System.out.println("\nDisplaying student details:");
for (Student s : students) {
s.display();
}
}
}