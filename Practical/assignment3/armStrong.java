package src;
import java.util.*;

class AStrong
{
    int count(int num)
    {
        int count = 0;
        while(num!=0)
        {
            count ++;
            num /= 10;
        }
       return count; 
    }
     void findAStrong(int num)
     {
        int temp=num,sum =0;
        int temp2;
    
        int count = count(num);
        while (temp!= 0)
        {
            temp2 = temp % 10;
            sum += Math.pow(temp2,count);
            temp /= 10;
        }
        if (sum == num)
            System.out.println("The number "+num+" is an armstrong number.");
        else
            System.out.println("The number "+num+" is not an armstrong number!!!");

     }
}
class AStrongNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the number: ");
        num = sc.nextInt();

        AStrong obj = new AStrong();
        obj.findAStrong(num);
        sc.close();
    }
}