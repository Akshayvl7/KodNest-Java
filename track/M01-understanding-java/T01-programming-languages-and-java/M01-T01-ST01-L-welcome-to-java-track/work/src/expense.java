import java.util.Scanner;
public class expense {
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        System.out.println("enter income: ");
        int income = s.nextInt();
        System.out.println("enter rent: ");
        int rent = s.nextInt();
        System.out.println("food: ");
        int food = s.nextInt();
        System.out.println("travel: " );
        int travel = s.nextInt();
        int xpense = food + travel + rent ;
        int balance = income - xpense;
        System.out.println("expense: " + xpense);
        System.out.println("balance: " + balance);
        
    }
    
}
