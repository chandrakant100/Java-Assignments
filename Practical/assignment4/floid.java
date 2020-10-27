package src;
import java.util.*;

class Floid
{
    Floid(int num)
    {
        int m = 1;
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1 ; j <= i; j++)
                {
                    System.out.print(m+" ");
                    m++;
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

        Floid obj = new Floid(num);
        sc.close();
    }
}