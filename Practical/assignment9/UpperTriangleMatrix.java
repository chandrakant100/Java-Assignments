package src;
import java.util.*;

public class UpperTriangleMatrix {
    void display(int[][] mat)
    {
        int num1 = mat.length;
        int num2 = mat[0].length;

        for (int i = 0 ; i < num1; i++)
        {
            for (int j = i ; j < num2; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total number of rows in the matrix: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the total number of colums in the matrix: ");
            int num2 = sc.nextInt();

            int[][] mat1 = new int[num1][num2];
            
            System.out.println("Enter the elements of matrix1: ");
            for (int i = 0 ; i < num1; i++)
            {
                for (int j = 0 ; j < num2; j++)
                {
                    mat1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Elements in matrix1: ");
            for (int i = 0 ; i < num1; i++)
            {
                for (int j = 0 ; j < num2; j++)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Upper Triangle of matrix: ");
            UpperTriangleMatrix obj = new UpperTriangleMatrix();
            obj.display(mat1);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input!!"+e);
        }
    }    
}
