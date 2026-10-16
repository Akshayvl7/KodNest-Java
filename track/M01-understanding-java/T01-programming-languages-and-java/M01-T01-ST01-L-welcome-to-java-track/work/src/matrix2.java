import java.util.Scanner;
public class matrix2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows: ");
        int rows = s.nextInt();
        System.out.println("enter columns: ");
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("enter values: ");
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < cols; j++){
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Matrix:");
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int minRow = 1;
        int minTotal = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length ; i++){
            int rowtotal = 0;
            for(int j = 0 ; j < cols; j++){
                rowtotal += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + rowtotal);

            if(rowtotal < minTotal){
                minTotal = rowtotal;
                minRow = i + 1;
            }
        }

        System.out.println("Row " + minRow + " has the minimum calculated value: " + minTotal);
    }
}
