import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = c.nextInt();

        //System.out.print("Enter number problems solved: ");
        

        int total = 0;
        for (int i = 1; i <= days; i++) {
            int problems = c.nextInt();
            total += problems;            
        }
        System.out.println("Total problems solved: " + total);

        if (total >= 20) {
            System.out.println("Strong process");
        } else if (total >= 10) {
            System.out.println("average process");
        } else {
            System.out.println("weak process");
        }

        c.close();
    }
}
