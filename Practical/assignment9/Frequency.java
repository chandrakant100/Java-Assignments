import java.util.InputMismatchException;
import java.util.Scanner;

public class Frequency {
    int frequency(int value,int[] arr,int size)
    {
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (value == arr[i])
                count ++;
        }
        return count;
    }
 public static void main(String[] args)
 {
    try{
        int num, checkFrequency;
        Frequency obj = new Frequency();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        num = sc.nextInt();

        int ar[] = new int[num];
        
        System.out.println("Enter Elements: ");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        
        System.out.println("Elements: ");
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i]+" ");
        }

        System.out.println();
        
        for (int i = 0; i < ar.length; i++)
        {
            checkFrequency = obj.frequency(ar[i],ar,ar.length);
            System.out.println("Frequency of "+ar[i]+" is "+checkFrequency);
        }
        sc.close();
    }
    catch(InputMismatchException e)
    {
        System.out.println("Enter Integer number!!"+e.getMessage());
    }    
 }   
}
