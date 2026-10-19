import java.util.Scanner;

public class employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        double salary = s.nextDouble();

        employee e = new employee();
        e.setDetails(name, salary);
        e.displayDetails();

        s.close();
    }
}
