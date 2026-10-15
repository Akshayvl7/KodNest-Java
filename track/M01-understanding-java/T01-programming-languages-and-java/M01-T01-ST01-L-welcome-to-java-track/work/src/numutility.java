import java.util.Scanner;
public class numutility {
    int getvalue(int number) {
        return number;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        numutility num = new numutility();
        System.out.println(num.getvalue(number));
        s.close();
    }
}