import java.util.Scanner;

public class nameage {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
              
       // System.out.println("enter age : "  );
        int age = s.nextInt();
        //s.nextLine();
        String name = s.nextLine();
       // System.out.println("enter name : " );
        
        System.out.println(" " + age );
        System.out.println(" " + name);
        s.close();

    }
}
