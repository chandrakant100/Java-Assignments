package src;
import java.util.*;

import javax.lang.model.element.Element;

public class Duplicate { 
    void check(int[] obj)
    {
        int size = obj.length;
        int count = 0,k = 0;
        int[] evaluate = new int[size];

        for (int i = 0; i < size; i++)
        {
            for (int j = i+1; j < size; j++)
            {
                if (obj[i] == obj[j])
                {
                    count ++;
                }    
            }
            if (count == 0)
            {
                evaluate[k] = obj[i];
                k++;
            }
            count = 0;
        }
        if (k == obj.length)
        {
            System.out.println("There is no duplicate Elements!!!");
            return;
        }
        System.out.println("After removing the duplicate elements are: ");
        obj = evaluate;
        for (int i = 0; i < k; i++)
        {
            System.out.print(obj[i]+" ");
        }
        System.out.println();  
    }
    public static void main(String[] args)
    {
        try 
        {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Enter the number of elements:");
            n = sc.nextInt();
            int[] obj = new int[n];

            Duplicate ob = new Duplicate();

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
            ob.check(obj);
        }
        catch(Exception e)
        {
            System.err.println("Invalid Input!!");
        }
    }    
}
