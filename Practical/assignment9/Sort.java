package src;
import java.util.*;

public class Sort {
    public static void main(String[] args)
    {
        try 
        {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Enter the number of elements:");
            n = sc.nextInt();
            int[] obj = new int[n];

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++)
            {
                obj[i] = sc.nextInt();
            }
            Arrays.sort(obj);
            System.out.println("After Sorting:");
            for (int i = 0; i < n; i++)
            {
                System.out.print(obj[i]+" ");
            }
        }
        catch(Exception e)
        {
            System.err.println("Invalid Input!!");
        }
    }
}
