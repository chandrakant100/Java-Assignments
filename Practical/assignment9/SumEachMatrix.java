package src;
import java.util.*;

public class SumEachMatrix {
    int[][] temp;
    SumEachMatrix(int[][] mat)
    {
        int num1 = mat.length;
        int num2 = mat[0].length;
        temp = new int[2][];
        
        temp[0] = new int[num1];
        temp[1] = new int[num2];
        
        int k1 = 0, k2 = 0, sum1 = 0, sum2 = 0;  
        for (int i = 0 ; i < num1; i++)
        {
            for (int j = 0 ; j < num2; j++)
            {
                sum1 += mat[i][j];
                sum2 += mat[j][i];
            }
            if (k1 < num1)
            {
                temp[0][k1] = sum1;
                k1 ++;
            }
            if (k2 < num2)
            {
                temp[1][k2] = sum2;
                k2 ++;
            }
            sum1 = 0;
            sum2 = 0;
        }    
    }
    void display()
    {
        int num1 = temp[0].length;
        int num2 = temp[1].length;

        for (int i = 0; i < num1; i++)
        {
            System.out.println("\nsum of row "+i+":");
            System.out.print(temp[0][i]+" ");
        }
        for (int i = 0; i < num2; i++)
        {
            System.out.println("\nsum of column "+i+":");
            System.out.print(temp[1][i]+" ");
        }
        System.out.println();
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
            SumEachMatrix obj = new SumEachMatrix(mat1);
            obj.display();
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input!!"+e);
        }
    }    
}
