import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows: ");
        int a = s.nextInt();
        System.out.println("enter columns: ");
        int b = s.nextInt();
        int[][] matrix = new int[a][b];
        for (a = 0; a < matrix.length; a++) {
            for (b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = s.nextInt();
            System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}