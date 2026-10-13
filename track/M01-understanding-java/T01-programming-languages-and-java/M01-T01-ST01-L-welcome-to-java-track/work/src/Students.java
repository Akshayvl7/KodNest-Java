import java.util.Scanner;

public class Students {
    String name;
    String course;
    int rollno;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Students s1 = new Students();
        Students s2 = new Students();

        System.out.println("enter name s1: ");
        s1.name = scanner.nextLine();

        System.out.println("enter course s1: ");
        s1.course = scanner.next();

        System.out.println("enter roll num s1: ");
        s1.rollno = scanner.nextInt();
        scanner.nextLine(); // Clear newline buffer left by nextInt()

        System.out.println("enter name s2: ");
        s2.name = scanner.nextLine();

        System.out.println("enter course s2: ");
        s2.course = scanner.next();

        System.out.println("enter roll num s2: ");
        s2.rollno = scanner.nextInt();

        System.out.println("\n--- Student 1 Details ---");
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Roll No: " + s1.rollno);

        System.out.println("\n--- Student 2 Details ---");
        System.out.println("Name: " + s2.name);
        System.out.println("Course: " + s2.course);
        System.out.println("Roll No: " + s2.rollno);

        scanner.close();
    }
}

