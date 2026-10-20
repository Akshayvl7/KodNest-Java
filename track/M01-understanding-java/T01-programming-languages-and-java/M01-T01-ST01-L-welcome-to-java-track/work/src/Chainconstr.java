import java.util.Scanner;

class Chainconstr {
    String name;
    int age;

    Chainconstr() {
        this("unknown", 0);
    }

    Chainconstr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        int age = s.nextInt();

        Chainconstr defaultc1 = new Chainconstr();
        Chainconstr c2 = new Chainconstr(name, age);
        defaultc1.display();
        c2.display();

        s.close();
    }
}

