import java.util.*;

class students {
    String USN, Name;
    int age;
    double m1, m2, m3;

    students(String USN, String Name, int age, double m1, double m2, double m3) {
        this.USN = USN;
        this.Name = Name;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class UG extends students {
    int Sem;
    double Fee, Stipend;
    String Dept;

    UG(String USN, String Name, int age, double m1, double m2, double m3, int Sem, double Fee, double Stipend,
            String Dept) {
        super(USN, Name, age, m1, m2, m3);
        this.Sem = Sem;
        this.Fee = Fee;
        this.Stipend = Stipend;
        this.Dept = Dept;
    }

    void display() {
        System.out.println("USN=" + super.USN + "\n Name=" + super.Name + "\n Age=" + super.age + "\n Marks in Subject1="
                + super.m1 + "\n Marks in Subject2=" + super.m2 + "\n Marks in Subject3=" + super.m3 + "\n Sem=" + Sem
                + "\n Fee=" + Fee + "\n Stipend=" + Stipend + "\n Dept=" + Dept);
    }

    void avg() {
        System.out.println("\n avg of three subject is =\n" + ((super.m1 + super.m2 + super.m3) / 3));
    }
}

class PG extends students {
    int Sem;
    double Fee, Stipend;
    String Dept;

    PG(String USN, String Name, int age, double m1, double m2, double m3, int Sem, double Fee, double Stipend,
            String Dept) {
        super(USN, Name, age, m1, m2, m3);
        this.Sem = Sem;
        this.Fee = Fee;
        this.Stipend = Stipend;
        this.Dept = Dept;
    }

    void display() {
        System.out.println("USN=" + super.USN + "\n Name=" + super.Name + "\n Age=" + super.age + "\n Marks in Subject1="
                + super.m1 + "\n Marks in Subject2=" + super.m2 + "\n Marks in Subject3=" + super.m3 + "\n Sem=" + Sem
                + "\n Fee=" + Fee + "\n Stipend=" + Stipend + "\n Dept=" + Dept);
    }

    void avg() {
        System.out.println("\n avg of three subject is =\n" + ((super.m1 + super.m2 + super.m3) / 3));
    }
}

public class ug_pg_student {
    public static void main(String args[]) {
        UG student1 = new UG("1MS22AI001", "Aravind", 19, 90, 91, 95, 3, 20000, 2000, "AI&ML");
        UG student2 = new UG("1MS22AI002", "Aryan", 20, 80, 81, 85, 3, 21000, 2500, "AI&DS");
        UG student3 = new UG("1MS22AI003", "Abhishek", 21, 50, 52, 55, 3, 25000, 3000, "CIVIL");
        PG student4 = new PG("1MS25AI001", "Mala", 30, 90, 91, 95, 1, 50000, 5000, "AI&ML");
        PG student5 = new PG("1MS25AI002", "Arpitha", 25, 50, 51, 55, 3, 70000, 3000, "AI&DS");
        PG student6 = new PG("1MS25AI003", "Theju", 23, 90, 81, 75, 4, 80000, 6000, "Arch");

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
}
