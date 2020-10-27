package src;
import java.io.*;

class Gcd
{
    void findGcd(int num1, int num2)
    {
        int gcd = 0;
        for (int i=1; i< num1 || i< num2;i++)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                gcd = i;
            }
        }
        System.out.println("Gcd of "+num1+" and "+num2+" is "+gcd);
    }
}
class NumGcd
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int num1, num2;
        System.out.println("---To find the gcd of two numbers----");
        System.out.println("Enter the ist number: ");
        num1 = Integer.parseInt(sc.readLine());

        System.out.println("Enter the 2nd number: ");
        num2 = Integer.parseInt(sc.readLine());

        Gcd obj = new Gcd();
        obj.findGcd(num1,num2);
    }
}