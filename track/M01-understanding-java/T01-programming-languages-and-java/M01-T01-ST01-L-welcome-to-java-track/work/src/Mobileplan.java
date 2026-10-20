import java.util.Scanner;

public class Mobileplan {
    String planName;
    int price; 

    // Parameterized constructor
    Mobileplan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    // Zero-parameter (default) constructor
    Mobileplan() {
        this.planName = "Basic";
        this.price = 199;
    }

    void display() {
        System.out.println(planName + " " + price);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String planName = s.next();
        int price = s.nextInt();

        Mobileplan m1 = new Mobileplan();
        Mobileplan m2 = new Mobileplan(planName, price);    
        m1.display();
        m2.display();

        s.close();
    }
}
