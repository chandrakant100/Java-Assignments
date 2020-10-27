package src;
import java.util.*;

public class MulMatrix {
    int[][] temp;
    MulMatrix(int[][] mat1, int[][] mat2)
    {
        temp = new int[mat1.length][mat1.length];
        int  num1 = mat1.length;
        int  num2 = mat1[0].length;
        int  num3 = mat2.length;
        int  num4 = mat2[0].length;

        int sum  = 0, k = 0;
        for (int m = 0; m < num1; m++)
        {
            for (int i = 0 ; i < num1; i++)
            {
                for (int j = 0 ; j < num3; j++)
                {
                    sum += mat1[m][j] * mat2[j][i];
                }
                if (k == num4)
                    k = 0;
                temp[m][k] = sum;
                k++;
                sum = 0;        
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
            System.out.println("Enter the total number of elements in the row of ist matrix: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the total number of elements in the column of first matrix: ");
            int num2 = sc.nextInt();

            System.out.println("Enter the total number of elements in the row of 2nd matrix: ");
            int num3 = sc.nextInt();
            System.out.println("Enter the total number of elements in the column of 2nd matrix: ");
            int num4 = sc.nextInt();

            if (num2 != num3)
            {
                System.out.println("Matrix multiplication is not possible!!!");
                return;
            }
            int[][] mat1 = new int[num1][num2];
            int[][] mat2 = new int[num3][num4];
            
            System.out.println("Enter the elements of matrix1: ");
            for (int i = 0 ; i < num1; i++)
            {
                for (int j = 0 ; j < num2; j++)
                {
                    mat1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of matrix2: ");
            for (int i = 0 ; i < num3; i++)
            {
                for (int j = 0 ; j < num4; j++)
                {
                    mat2[i][j] = sc.nextInt();
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
            System.out.println("Elements in matrix2: ");
            for (int i = 0 ; i < num3; i++)
            {
                for (int j = 0 ; j < num4; j++)
                {
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println();
            }
            MulMatrix obj = new MulMatrix(mat1,mat2);
            System.out.println("After Multiplication of matrix: ");
            obj.display();
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input!!"+e);
        }
    }    
}
