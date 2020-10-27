package src;
import java.util.*;

class Nfibo
{
    Nfibo(int range)
    {
        System.out.println("The Fibonacci series is:");
        int num1 =0 , num2 =1,sum=0;
        System.out.print(num1+" "+num2+" ");
        while( range!=0 )
        {
            sum = num1 + num2;
            System.out.print(sum+" ");
            num1 = num2;
            num2 = sum;
            range --;
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