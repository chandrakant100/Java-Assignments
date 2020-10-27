import java.util.InputMismatchException;
import java.util.Scanner;

public class RightRotate {
    void Rrotate(int x,int num,int[] ar)
    {
        int temp;
        for (int i = 0; i < x; i++)
            {
                temp = ar[num-1];
                for (int j = num-1; j > 0; j--)
                {
                    ar[j] = ar[j-1]; 
                }
                ar[0] = temp;
            }
    }
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int num, x;
            RightRotate obj = new RightRotate();

            System.out.println("Enter the total number of elements:");
            num = sc.nextInt();

            int ar[] = new int[num];
            System.out.println("Enter the elements:");

            for (int i = 0; i < ar.length; i++)
            {
                ar[i] = sc.nextInt(); 
            }
            
            System.out.println("Enter the total number of rotations:");
            x = sc.nextInt();

            System.out.println("Before rotation:");
            for (int i = 0; i < ar.length; i++)
            {
                System.out.print(ar[i]+" "); 
            }
            //System.out.println();
            obj.Rrotate(x,num,ar);
            System.out.println("\nAfter rotations:");
            for (int i = 0; i < ar.length; i++)
            {
                System.out.print(ar[i]+" "); 
            }
            System.out.println();
            sc.close();
        }
        catch(InputMismatchException e)
        {
            System.out.print("Enter integer value!!"+e.getMessage());
        }     
    }
}
