import java.util.Scanner;

// Superclass Student
class Student {
    String USN;
    String name;
    int[] marks = new int[3]; // Assuming 3 subjects

    // Constructor
    public Student(String USN, String name, int[] marks) {
        this.USN = USN;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nUSN: " + USN);
        System.out.println("Name: " + name);
        displayMarks();
    }

    // Method to display marks
    public void displayMarks() {
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

// Subclass UG_Student
class UG_Student extends Student {
    int totalSemesters;

    // Constructor
    public UG_Student(String USN, String name, int[] marks, int totalSemesters) {
        super(USN, name, marks);
        this.totalSemesters = totalSemesters;
    }

    // Method to display UG student details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Semesters: " + totalSemesters);
    }
}

// Subclass PG_Student
class PG_Student extends Student {
    int totalSemesters;

    // Constructor
    public PG_Student(String USN, String name, int[] marks, int totalSemesters) {
        super(USN, name, marks);
        this.totalSemesters = totalSemesters;
    }

    // Method to display PG student details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Semesters: " + totalSemesters);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of objects to store student details
        Student[] students = new Student[3];

        Scanner scanner = new Scanner(System.in);

        // Input details for UG students
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for UG Student " + (i + 1));
            System.out.print("USN: ");
            String usn = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Total Semesters: ");
            int semesters = scanner.nextInt();
            int[] marks = new int[3];
            System.out.println("Enter marks for 3 subjects: ");
            for (int j = 0; j < 3; j++) {
                marks[j] = scanner.nextInt();
            }
            students[i] = new UG_Student(usn, name, marks, semesters);
        }

        // Input details for PG student
        System.out.println("Enter details for PG Student");
        System.out.print("USN: ");
        String usn = scanner.next();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Total Semesters: ");
        int semesters = scanner.nextInt();
        int[] marks = new int[3];
        System.out.println("Enter marks for 3 subjects: ");
        for (int j = 0; j < 3; j++) {
            marks[j] = scanner.nextInt();
        }
        students[2] = new PG_Student(usn, name, marks, semesters);

        scanner.close();

        // Display details of all students
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails of Student " + (i + 1));
            students[i].displayDetails();
        }
    }
}
/*
import java.util.*;
class students
{
String USN, Name;
int age;
double m1, m2, m3;
students(String USN, String Name, int age, double m1, double m2, double
m3)
{
this.USN=USN;
this.Name=Name;
this.age=age;
this.m1=m1;
this.m2=m2;
this.m3=m3;
}
}
class UG extends students
16
{
int Sem;
double Fee, Stipend;
String Dept;
UG(String USN, String Name, int age, double m1, double m2, double m3, int
Sem, double Fee, double Stipend, String Dept)
{
super(USN, Name,age,m1,m2, m3);
this.Sem=Sem;
this.Fee=Fee;
this.Stipend=Stipend;
this.Dept=Dept;
}
void display()
{
System.out.println("USN=" +super.USN+"\n Name="+super.Name+"\n Age="+super.age+"\n Marks in Subject1="+super.m1+"\n Marks in Subject2="+super.m2+"\n Marks in Subject3="+super.m3+"\n Sem="+Sem+"\n Fee="+Fee+"\n
Stipend="+Stipend+"\n Dept="+Dept);
}
void avg()
{
System.out.println("\n avg of three subject is =\n"+((super.m1+super.m2+super.m3)/3));
}
}
class PG extends students
{
int Sem;
double Fee, Stipend;
String Dept;
PG(String USN, String Name, int age, double m1, double m2, double m3, int
Sem, double Fee, double Stipend, String Dept)
{
super(USN, Name,age,m1,m2, m3);
this.Sem=Sem;
this.Fee=Fee;
this.Stipend=Stipend;
this.Dept=Dept;
}
void display()
{
System.out.println("USN=" +super.USN+"\n Name="+super.Name+"\n Age="+super.age+"\n Marks in Subject1="+super.m1+"\n Marks in Subject2="+super.m2+"\n Marks in Subject3="+super.m3+"\n Sem="+Sem+"\n Fee="+Fee+"\n
Stipend="+Stipend+"\n Dept="+Dept);
}
void avg()
{
System.out.println("\n avg of three subject is =\n"+((super.m1+super.m2+super.m3)/3));
}
}
class Studentdetails
{
public static void main(String args[])
{
UG student1= new UG("1MS22AI001", "Aravind", 19, 90,91,95, 3, 20000,
2000, "AI&ML");
UG student2= new UG("1MS22AI002", "Aryan", 20, 80,81,85, 3, 21000, 2500,
"AI&DS");
UG student3= new UG("1MS22AI003", "Abhishek", 21, 50,52,55, 3, 25000,
3000, "CIVIL");
17
PG student4= new PG("1MS25AI001", "Mala", 30, 90,91,95, 1, 50000, 5000,
"AI&ML");
PG student5= new PG("1MS25AI002", "Arpitha", 25, 50,51,55, 3, 70000,
3000, "AI&DS");
PG student6= new PG("1MS25AI003", "Theju", 23, 90,81,75, 4, 80000, 6000,
"Arch");
student1.display();
student1.avg();
student2.display();
student2.avg();
student3.display();
student3.avg();
student4.display();
student4.avg();
student5.display();
student5.avg();
student6.display();
student6.avg();
}
}*/