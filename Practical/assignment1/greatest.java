package src;
class Greatest
{
    Greatest(float num1,float num2,float num3)
    {
        if (num1 == num2 && num2 == num3 && num1 == num3)
            {
                System.out.println("All the numbers are equal!!!");
            }
            else if (num1 > num2 && num1 > num3)
            {
                System.out.println("Greatest among "+num1+","+num2+" and "+num3+" is "+String.format("%.2f",num1));
            }
            else if (num2 > num1 && num2 > num3)
            {
                System.out.println("Greatest among "+num1+","+num2+" and "+num3+" is "+String.format("%.2f",num2));
            }
            else
            {
                System.out.println("Greatest among "+num1+","+num2+" and "+num3+" is "+String.format("%.2f",num3));
            }
    }            
}
class Check
{
    public static void main(String[] args)
    {
        if (args.length != 3)
        {
            System.out.println("Invalid Arguments!!!");
            return;
        }

        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);
        float num3 = Float.parseFloat(args[2]);

        Greatest obj = new Greatest(num1,num2,num3);
    }
}