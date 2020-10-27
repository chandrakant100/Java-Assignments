package src;
import java.util.*;

class Strong
{
     int fact(int temp)
     {
         int facto=1;
        
         if (temp == 1 || temp ==0)
            return facto;

        while( temp!=1 )
        {
            facto *=temp;
            temp--;
        }
        return facto;
     }
     void findStrong(int num)
     {
        int temp=num,sum =0;
        int temp2;
        while (temp!= 0)
        {
            temp2 = temp % 10;
            sum += fact(temp2);
            temp /= 10;
        }
        if (sum == num)
            System.out.println("The number "+num+" is a strong number.");
        else
            System.out.println("The number "+num+" is not a strong number!!!");

     }
}
class NumStrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the number: ");
        num = sc.nextInt();

        Strong obj = new Strong();
        obj.findStrong(num);
        sc.close();
    }
}