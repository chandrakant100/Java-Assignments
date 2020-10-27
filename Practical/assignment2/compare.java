package src;
import java.util.*;

class Check
{
    Check(float num1, float num2)
    {
        float temp1,temp2;
        temp1 = num1;
        temp2 = num2;

        if ( (int)num1 == (int)num2)
        {
            temp1 = temp1 * 1000;
            temp2 = temp2 * 1000;

            if (temp1 == temp2)
                System.out.println("These two numbers are same upto 3 decimal numbers");
            else
            System.out.println("These two numbers are not same upto 3 decimal numbers!!!");
        }
        else
            System.out.println("They are not same numbers!!");
    }
}
class  Compare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float num1,num2;

        System.out.println("Enter the ist number: ");
        num1 = sc.nextFloat();
        System.out.println("Enter the 2nd number: ");
        num2 = sc.nextFloat();

        Check obj = new Check(num1,num2);
        sc.close();
    }
}