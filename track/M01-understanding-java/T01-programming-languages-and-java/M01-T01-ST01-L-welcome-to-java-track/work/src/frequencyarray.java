import java.util.Scanner;
public class frequencyarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        int Frequency = 0;
        
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        int target = s.nextInt();

        for (int i = 0; i < size; i++) {
            if (target == a[i]) {
                Frequency++;
            }
        }

        System.out.println("Frequency of " + target + ": " + Frequency);
    }
}
