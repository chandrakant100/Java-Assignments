package src;
import java.util.*;

public class OddEvenFrequency {
    void display(int[][] mat)
    {
        int num1 = mat.length;
        int num2 = mat[0].length;
        int count1 = 0, count2 = 0;
        for (int i = 0 ; i < num1; i++)
        {
            for (int j = 0 ; j < num2; j++)
            {
                if (mat[i][j] % 2 == 0)
                    count1 ++;
                else
                    count2 ++;    
            }
        }
        System.out.println("Frequency of Even NO: "+count1+" and Odd NO: "+count2);
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
            OddEvenFrequency obj = new OddEvenFrequency();
            obj.display(mat1);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input!!"+e);
        }
    }    
}
