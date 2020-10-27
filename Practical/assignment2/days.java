package src;
import java.util.Scanner;
class CalDays
{
    CalDays(int year, int month)
    {
        if ((year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)) && month == 2)
        {
            System.out.println("Number of days in this month(February) is 28");
        }    
        else if (month == 2)
            System.out.println("Number of days in this month(February) is 29");
        
        else if (month % 2 == 0 && month !=8)
            System.out.println("Number of days in this month is 30");
        else
            System.out.println("Number of days in this month is 31");
    }
}
class Days
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year, month;
        System.out.println("Enter the year: ");
        year = sc.nextInt();

        System.out.println("Enter the month number: ");
        month = sc.nextInt();

        if (month > 12)
        {
            System.out.println("Invalid month number!!!");
            return;
        }
        CalDays obj = new CalDays(year,month);
        sc.close();
    }
}