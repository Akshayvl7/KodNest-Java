import java.util.Scanner;

public class student {
    int id;
    String name;
    String course;
    double javascore;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        student s1 = new student();

        System.out.print("Enter ID: ");
        s1.id = scanner.nextInt();

        System.out.print("Enter Name: ");
        s1.name = scanner.next();

        System.out.print("Enter Course: ");
        s1.course = scanner.next();

        System.out.print("Enter Java Score: ");
        s1.javascore = scanner.nextDouble();

        System.out.println("\nID: " + s1.id);
        System.out.println("name: " + s1.name);
        System.out.println("course: " + s1.course);
        System.out.println("javascore: " + s1.javascore);

        scanner.close();
    }
}