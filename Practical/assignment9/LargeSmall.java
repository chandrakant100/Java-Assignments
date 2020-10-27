package src;
import java.util.*;

public class LargeSmall {
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
            System.out.println("The elements are:");
            for (int i = 0; i < n; i++)
            {
                System.out.print(obj[i]+" ");
            }
            System.out.println();
            
            Arrays.sort(obj);
            System.out.println("The second smallest element is: "+obj[1]);
            System.out.println("Enter third largest element is: "+obj[obj.length - 3]);
        }
        catch(Exception e)
        {
            System.err.println("Invalid Input!!");
        }
    }
}
