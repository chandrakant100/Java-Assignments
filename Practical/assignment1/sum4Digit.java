package src;

class Cal_4
{
    Cal_4(int num)
    {
        int sum = 0;
        while (num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of each indivisula digits are "+sum); 
    }
}
class Digits_4
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
        if (count != 4)
        {
            System.out.println("The Entered number is not 4 digit number!!");
            return;
        }
        else
        {
            Cal_4 obj = new Cal_4(num);
        }
    }
}
