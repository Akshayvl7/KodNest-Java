import java.util.Scanner;

public class Paraconst {
    String name;
    double price;

    // Parameterized Constructor
    Paraconst(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1. Take user input first
        String name = s.next();
        double price = s.nextDouble();

        // 2. Pass values into the parameterized constructor
        Paraconst p = new Paraconst(name, price);

        // 3. Call display to view the initialized values
        p.display();

        s.close();
    }
}
