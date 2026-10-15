import java.util.Scanner;

public class s1s2 {
    // Class blueprint (attributes)
    int rollno;
    String name;
    int score;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Creating objects of class s1s2
        s1s2 s1 = new s1s2();
        s1s2 s2 = new s1s2();

        // Taking inputs directly into object fields
        s1.rollno = s.nextInt();
        s1.name = s.next();
        s1.score = s.nextInt();

        s2.rollno = s.nextInt();
        s2.name = s.next();
        s2.score = s.nextInt();

        int newscore = s.nextInt();

        System.out.println("before update : ");
        System.out.println(" " + s1.rollno + " " + s1.name + " " + s1.score);
        System.out.println(" " + s2.rollno + " " + s2.name + " " + s2.score);

        System.out.println("after update: ");
        s1.score = newscore;
        System.out.println(" " + s1.rollno + " " + s1.name + " " + s1.score);
        System.out.println(" " + s2.rollno + " " + s2.name + " " + s2.score);

        s.close();
    }
}
