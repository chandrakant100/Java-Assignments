package src;
import java.util.*;

class Pattern2
{
    Pattern2(int num)
    {
        for (int i = 1; i <= num; i++)  
        {
            for (int j = num; j > i; j--)
                System.out.print(" ");
            for (int k = i; k >=1; k--)
            {
                System.out.print("1 ");
                if (k >= 3)
                {
                    for (int m = k - 1; m >= 2; m--)
                        System.out.print(k-1+" ");
                        System.out.print("1 ");
                        break;
                }
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

        Pattern2 obj = new Pattern2(num);
        sc.close();
    }
}