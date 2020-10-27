package src;
import src.Shape;
import java.util.Scanner;

public class Circle implements Shape {
    float a;
    Scanner sc = new Scanner(System.in);
    public double area()
    {
        System.out.println("Enter Radius: ");
        a = sc.nextFloat();
        return (3.14 *a*a);
    }
    public double perimeter()
    {
        return (2*3.14*a);
    }
}