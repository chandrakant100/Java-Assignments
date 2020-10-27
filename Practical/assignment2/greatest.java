package src;

import javax.lang.model.util.ElementScanner14;

class Greatest
{
    public static void main(String[] args)
    {
        if (args.length < 3)
        {
            System.out.println("Invalid Arguments!!!");
            return;
        }
        float num1, num2, num3;

        num1 = Float.parseFloat(args[0]);
        num2 = Float.parseFloat(args[1]);
        num3 = Float.parseFloat(args[2]);

        if (num1 > num2 && num1 > num3)
                System.out.println("The Greatest among "+num1+","+num2+" and "+num3+" is "+num1);
        
        else if (num2 > num1 && num2 > num3)
                System.out.println("The Greatest among "+num1+","+num2+" and "+num3+" is "+num2);
        else
                System.out.println("The Greatest among "+num1+","+num2+" and "+num3+" is "+num3);

    }
}