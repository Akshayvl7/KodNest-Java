import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of elements in array: " );
        int size = s.nextInt();
        int[] a = new int[size];
        System.out.println("enter the elements of array: ");
        for (int i = 0 ; i < size ; i++){
            a[i] = s.nextInt();
            System.out.println(a[i]);
        }
        System.out.println("enter the number to be searched: ");
        int target = s.nextInt();
        for (int i = 0; i < size; i++){
            if(target == a[i]){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");

    }
    
}
