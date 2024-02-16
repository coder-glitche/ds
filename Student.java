package details;

public class Student {
    String name, dept, grade1, grade2, grade3, usn;
    double sgpa, cgpa;

    public Student(String n, String u, String d, String g1, String g2, String g3, double s) {
        name = n;
        usn = u;
        dept = d;
        grade1 = g1;
        grade2 = g2;
        grade3 = g3;
        sgpa = s;
    }

    public void show() {
        System.out.println("student " + name + " with usn:" + usn + " of department " + dept);
        System.out.println("the grades are " + grade1 + "," + grade2 + "," + grade3);
    }
}
