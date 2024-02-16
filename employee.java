import java.util.Scanner;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[3];
        
        // Input employee details
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();  // Consume newline
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter employee age: ");
            int age = sc.nextInt();
            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();
            e[i] = new Employee(id, name, age, salary);
        }
        
        // Sort employees by age
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (e[i].age > e[j].age) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }

        // Display employee details in order of age
        System.out.println("Employee details in order of age:");
        for (int i = 0; i < 3; i++) {
            System.out.println("ID: " + e[i].id + ", Name: " + e[i].name
                    + ", Age: " + e[i].age + ", Salary: " + e[i].salary);
        }
    }
}
