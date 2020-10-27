package src;
import java.util.*;

public class Transpose {
    int[][] temp;
    Transpose(int[][] mat1)
    {
        temp = new int[mat1.length][mat1[0].length];
        int  num1 = mat1.length;
        int  num2 = mat1[0].length;
        for (int i = 0 ; i < num1; i++)
        {
            for (int j = 0 ; j < num2; j++)
            {
                temp[j][i] = mat1[i][j];
            }
        }
    }
    void display()
    {
        int num1 = temp.length;
        int num2 = temp[0].length;

        for (int i = 0 ; i < num1; i++)
        {
            for (int j = 0 ; j < num2; j++)
            {
                System.out.print(temp[i][j]+" ");
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
            Transpose obj = new Transpose(mat1);
            System.out.println("After Transposing of matrix: ");
            obj.display();
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input!!"+e);
        }
    }    
}
