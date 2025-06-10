
/**
 * computes the transpose of a matrix
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class MatrixTranspose
{
    
    /**
     *
     * @param  matrix  : a 2D array representing a matrix
     * @return    the transpose of the matrix
     */
    public static int[][] transposeFinder(int[][] matrix)
    {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        
        return transposeMatrix;
    }
    
    public static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            for( int k : matrix[i]){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        System.out.println("-----Transpose of a Matrix-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows ::");
        int row = sc.nextInt();
        
        System.out.print("Enter number of columns ::");
        int col = sc.nextInt();
        
        int[][] matrix = new int[row][col];
        
        for(int i = 0 ; i < row ; i++){
            System.out.print("Enter elements of row "+(i+1)+" (separated by spaces)::");
            for (int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        System.out.println("Given Matrix");
        printMatrix(matrix);
        
        int[][] transpose = transposeFinder(matrix);
        
        System.out.println("\n Transpose Matrix");
        printMatrix(transpose);
    }
}
