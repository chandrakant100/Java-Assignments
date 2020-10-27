package src;
import java.util.Scanner;

public class Rectrangle implements Shape {
    float a,b;
    Scanner sc = new Scanner(System.in);
    public double area()
    {

        System.out.println("Enter length: ");
        a = sc.nextFloat();

        System.out.println("Enter breadth: ");
        b = sc.nextFloat();
        return (a*b);
    }
    public double perimeter()
    {
        return 2 *(a+b);
    }
}