import java.util.Scanner;
public class calculator {
    int add(int a, int b) {
        int res = a + b;
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        calculator c = new calculator();
        System.out.println(c.add(a, b));
        s.close();
    }
}
