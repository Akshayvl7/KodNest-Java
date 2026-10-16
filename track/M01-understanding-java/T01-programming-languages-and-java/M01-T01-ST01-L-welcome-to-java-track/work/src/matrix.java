import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows: ");
        int a = s.nextInt();
        System.out.println("enter columns: ");
        int b = s.nextInt();
        int[][] matrix = new int[a][b];

        System.out.println("enter values: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Matrix representation:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}