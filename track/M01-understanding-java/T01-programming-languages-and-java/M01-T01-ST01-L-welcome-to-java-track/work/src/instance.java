import java.util.Scanner;

class Student{
    int mark;

    void showMarks(int bonus){
        int finalmark = 0;
        finalmark = mark + bonus;
        System.out.println(mark);
        System.out.println(finalmark);
    }
}
public class instance{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        s1.mark = s.nextInt();
        int bonus = s.nextInt();
        s1.showMarks(bonus);

    }
}