package src;
import src.Shape;
import java.util.Scanner;

public class Square implements Shape {
    float a;
    Scanner sc = new Scanner(System.in);
    public double area()
    {
        System.out.println("Enter side: ");
        a = sc.nextFloat();
        return (a*a);
    }
    public double perimeter()
    {
        return (4*a);
    }
}