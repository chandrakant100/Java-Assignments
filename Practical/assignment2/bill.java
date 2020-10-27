package src;
import java.util.*;

class Bill
{
    Bill(int units)
    {
        float sum = 0;
        int count = 50;
        if (units >= 50)
        {
            System.out.println("Slot #1:    "+125);
            count = units -50;
            sum += 125;
            if(units >= 100 && count >0)
            { 
                System.out.println("Slot #2:    "+(100*4.5));
                sum += (100*4.5);
                count -= 100;
            }    
            if(units >= 200 && count > 0)
            { 
                System.out.println("Slot #3:    "+(count)*6.0);
                sum += (count*6.0);
                count -= 200;
            }    
            if (units >= 300 && count > 0)
            {
                System.out.println("Slot #4:    "+(count)*8.50);
                sum += (count*8.50);
                count -=300;
            }
            if (units > 300 && count > 0)
            {
                System.out.println("Slot #5:    "+(count)*10.0);
                sum += (count*10.0);
            }
            System.out.println("================================");   
            System.out.println("\nTotal Bill: "+sum);   
        }
        else
        {
            System.out.println("Slot #1:    "+125);
        }
    }
}
class Calculate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int units;
        System.out.println("Enter the total units: ");
        units = sc.nextInt();
        
        Bill obj = new Bill(units); 
        sc.close();
    }
}