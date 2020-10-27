package src;
import java.util.*;

class Nfibo
{
    Nfibo(int range)
    {
        System.out.println("The Fibonacci series is:");
        int num1, num2,sum=0;
        for (int i = 0; i < range; i++)
        {
            num1 = 0;
            num2 = 1;
            System.out.print(num1+" ");
            if ( i > 0)
                 System.out.print(num2+" ");
            for (int j = 1; j < i; j++)
            {
                sum = num1 + num2;
                System.out.print(sum+" ");
                num1 = num2;
                num2 = sum;  
            }
            System.out.print("\n");    
        }
    }
}
class Fibbo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int range;
        System.out.println("Enter the range of the fibonacci series:");
        range = sc.nextInt();

        Nfibo obj =new Nfibo(range);

    }

}