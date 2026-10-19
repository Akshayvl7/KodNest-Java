import java.util.Scanner;

public class Student2 {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student name:" + name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Student2 s = new Student2();
        s.setName(name);
        s.displayName();

        scanner.close();
    }
}
