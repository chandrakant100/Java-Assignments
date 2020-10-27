package src;
import java.util.*;

class Countfibo
{
    Countfibo(int range,int num)
    {
        int num1 =0 , num2 =1,sum=0,i=0;
        System.out.print(num1+" "+num2+" ");

        while( i < range )
        {
            sum = num1 + num2;
            System.out.print(sum+" ");
            if (sum == num)
            {
                System.out.println("\nNumber found at position "+(i+3)+" the number is "+sum);
                break;
            }
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}
class NthFibbo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int range,num;
        System.out.println("Enter the range of the fibonacci series:");
        range = sc.nextInt();
        System.out.println("Enter the number want to search:");
        num = sc.nextInt();

        Countfibo obj =new Countfibo(range,num);

    }

}