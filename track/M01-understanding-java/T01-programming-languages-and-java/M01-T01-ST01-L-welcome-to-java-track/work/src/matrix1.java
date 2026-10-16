
import java.util.Scanner;
public class matrix1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int row = s.nextInt();
        int col = s.nextInt();
        int [][] matrix = new int[row][col];
        
        for(int m = 0; m < matrix.length ; m++){
        for(int n = 0; n< matrix[m].length; n++){
            matrix[m][n] = s.nextInt();
        System.out.print(matrix[m][n] + " ");
        }
        System.out.println();
            

        }
    }
}