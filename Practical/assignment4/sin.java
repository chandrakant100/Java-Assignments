package src;
import java.util.*;

class Sin
{
    Sin(Scanner sc)
    {
        int num;
        
        System.out.println("Enter the angle in degree:");
        num = sc.nextInt();

        double rad = Math.toRadians(num);
        double value = Math.sin(rad);       
	    System.out.println("sin( "+num+" ) = "+String.format("%.2f", value));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Sin obj = new Sin(sc);
        sc.close();
    }
}