package src;

class Cal
{
    Cal(int num)
    {
        int sum, temp1, temp2;
        temp1 = num % 10;
        temp2 = num / 10000;
        sum = temp1 + temp2;

        System.out.println("The sum of ist and last digit is "+sum); 
    }
}
class Digit
{
    public static void main(String[] args)
    {
        if(args.length == 0)
        {
            System.out.println("Invalid Arguments!!!");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int count = 0;
        while (num != 0)
        {
            count += 1;
            num /= 10;
        }

        num = Integer.parseInt(args[0]);
        if (count != 5)
        {
            System.out.println("The Entered number is not 5 digit number!!");
            return;
        }
        else
        {
            Cal obj = new Cal(num);
        }
    }
}
