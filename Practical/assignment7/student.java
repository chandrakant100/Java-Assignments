package src;
import java.util.Scanner;

interface Marks
{
    double getpercentage();
}
class A implements Marks
{
    float sub1;
    float sub2;    
    float sub3;
    A()
    {
        System.out.println("====Student 1============");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of sub1: ");
        sub1 = sc.nextFloat();
        System.out.println("Enter the marks of sub2: ");
        sub2 = sc.nextFloat();
        System.out.println("Enter the marks of sub3: ");
        sub3 = sc.nextFloat();        
    }
    public double  getpercentage()
    {
        return ((sub1 + sub2 + sub3) * (1/3.0));
    }
}
class B implements Marks
{
    float sub1;
    float sub2;
    float sub3;
    float sub4;    
    B()
    {
        System.out.println("====Student 2============");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of sub1: ");
        sub1 = sc.nextFloat();
        System.out.println("Enter the marks of sub2: ");
        sub2 = sc.nextFloat();
        System.out.println("Enter the marks of sub3: ");
        sub3 = sc.nextFloat();
        System.out.println("Enter the marks of sub4: ");
        sub4 = sc.nextFloat();
    }
    public double getpercentage()
    {
        return ((sub1 + sub2 + sub3) * (1/4.0));
    }
}
class Student
{
    public static void main(String[] args)
    {
        double per1, per2;
        
        A obj1 = new A();
        B obj2 = new B();
        
        per1 = obj1.getpercentage();
        per2 = obj2.getpercentage();
        System.out.println("================================");
        System.out.println("The percentage of Student 1 is "+String.format("%.2f",per1)+" and Student 2 is "+String.format("%.2f",per2));
    }
}
