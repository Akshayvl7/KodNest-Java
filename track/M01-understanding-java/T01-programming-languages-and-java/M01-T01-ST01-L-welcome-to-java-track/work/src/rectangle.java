import java.util.Scanner;
public class rectangle {
    int calculateArea(int l, int b) {
        int area = l * b;
        return area;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();
        rectangle r = new rectangle();
        int area = r.calculateArea(l, b);
        System.out.println("Area: " + area);
        s.close();
    }
}