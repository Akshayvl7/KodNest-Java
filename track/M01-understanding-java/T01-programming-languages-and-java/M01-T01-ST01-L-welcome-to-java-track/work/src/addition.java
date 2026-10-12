import java.util.Scanner;
public class addition{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter num1: ");
        int a = s.nextInt();
        System.out.println("enter num2: " );
        int b = s.nextInt();
        int res = a + b ;
        System.out.println("the result: " + res);
        
        s.close();
    }
}