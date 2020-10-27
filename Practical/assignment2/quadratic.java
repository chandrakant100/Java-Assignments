package src;
import java.util.*;

class Root
{
    Root(float a,float b,float c)
    {
        double root,root1,root2;
        float d = (b * b) - (4 * a * c);

        if (a==0 && b==0)
            System.out.println ("\nRoots are not possible!!!");

        else if (a == 0)
            System.out.println("\nThe equation has one root that is :"+String.format("%.2f",(-c/b)));

        else if(d == 0)
        {
            System.out.println ("\nThe eqauation has only one root:\n");
            root = (-b+Math.sqrt(d))/ 2*a;
            System.out.println ("Root: "+root);  
        }
        else if (d > 0)
        {
            root1 = -b + Math.sqrt(d) / 2*a;
            root2 = -b - Math.sqrt(d) / 2*a;
            System.out.println("\nThe Equation has two roots:\n");
            System.out.println("\nRoot 1:"+root1);
            System.out.println("\nRoot 2:"+root2);
        }
        else
            System.out.println ("\nThe equation has two imaginary roots!!!");
    }          
}
class Quardratic
{
    public static void  main(String[] args)
    {
        System.out.println ("Eqation format:\nax^2 + bx +c");
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.println ("Enter a,b,c respectively:\n");

        System.out.println("Enter a: ");
        a = sc.nextFloat();
        System.out.println("Enter b: ");
        b = sc.nextFloat();
        System.out.println("Enter c: ");
        c = sc.nextFloat();

        Root obj = new Root(a,b,c);
        sc.close();
    }    
}

    
    

