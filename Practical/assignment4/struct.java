package src;
import java.util.*;

class StructLoop
{
    StructLoop(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            for (int j = num; j > i; j--)
                System.out.print(" ");
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int m = 2;m <= i; m++)
            {
                System.out.print(m);
            }
            System.out.print("\n");
        }
        for (int i = num-1; i >=1; i--)
        {
            for (int j = num-1; j >= i; j--)
                System.out.print(" ");
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int m = 2;m <= i ; m++)
            {
                System.out.print(m);
            }
            System.out.print("\n");
        }    
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the range:");
        num = sc.nextInt();

        StructLoop obj = new StructLoop(num);
        sc.close();
    }
}