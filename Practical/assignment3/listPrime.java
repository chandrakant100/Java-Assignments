package src;
import  java.util.*;

class Prime
{
    void findPrime(int num1,int num2)
    {
        System.out.println("The Prime numbers between "+num1+" and "+num2+" are:");
        
        boolean flag=true;

        while(num1 < num2)
        {
            flag = true;
            if (num1 <= 1)
            {
                ++num1;
                continue;
            }         
           for (int j = 2 ; j<=num1/ 2 ;j++)
           {
               if (num1 % j == 0)
               {
                flag = false;
                break; 
               }
           }
           if (flag == true)
                System.out.print(num1+" ");
            num1 ++;    
        }
    }
}
class ListPrime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the the starting number and ending number respectively:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        Prime obj = new Prime();
        obj.findPrime(num1,num2);
        sc.close();
    }
}