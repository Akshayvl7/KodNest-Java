import java.util.Scanner;

public class matrix3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows: ");
        int rows = s.nextInt();
        System.out.println("enter columns: ");
        int cols = s.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("enter values: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // Print Matrix Representation
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Find the least (minimum) element in the matrix
        int minElement = arr[0][0];
        int minRow = 0;
        int minCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < minElement) {
                    minElement = arr[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("Least element in the matrix: " + minElement);
        System.out.println("Found at row: " + (minRow + 1) + ", column: " + (minCol + 1));
        
        s.close();
    }
}
