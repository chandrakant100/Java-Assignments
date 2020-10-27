package src;
import java.util.*;

public class AddMatrix {
    int[][] temp;
    AddMatrix(int[][] mat1, int[][] mat2)
    {
        temp = new int[mat1.length][mat1.length];
        int  num = mat1.length;
        for (int i = 0 ; i < num; i++)
        {
            for (int j = 0 ; j < num; j++)
            {
                temp[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }
    void display()
    {
        int num = temp.length;
        for (int i = 0 ; i < num; i++)
        {
            for (int j = 0 ; j < num; j++)
            {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total number of elements in the matrix: ");
            int num = sc.nextInt();

            int[][] mat1 = new int[num][num];
            int[][] mat2 = new int[num][num];
            
            System.out.println("Enter the elements of matrix1: ");
            for (int i = 0 ; i < num; i++)
            {
                for (int j = 0 ; j < num; j++)
                {
                    mat1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of matrix2: ");
            for (int i = 0 ; i < num; i++)
            {
                for (int j = 0 ; j < num; j++)
                {
                    mat2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Elements in matrix1: ");
            for (int i = 0 ; i < num; i++)
            {
                for (int j = 0 ; j < num; j++)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Elements in matrix2: ");
            for (int i = 0 ; i < num; i++)
            {
                for (int j = 0 ; j < num; j++)
                {
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println();
            }
            AddMatrix obj = new AddMatrix(mat1,mat2);
            System.out.println("After addition of matrix: ");
            obj.display();
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input!!"+e);
        }
    }    
}
