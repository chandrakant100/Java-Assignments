package src;
import java.util.*;
abstract class Shape 
{
    double area;
    double perimeter;
    abstract void Area();
    abstract void Perimeter();
    void display()
    {
        System.out.println("The Area:"+area);
        System.out.println("The perimeter:"+perimeter);
    }
}
class Rectrange extends Shape
{
    float length, breadth;
    Rectrange()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Length: ");
        length = sc.nextFloat();

        System.out.println("Enter the Breadth: ");
        breadth = sc.nextFloat();
    }
    void Area()
    {
        area = length * breadth;
    }
    void Perimeter()
    {
        perimeter = 2 * (length + breadth);
    }
}
class Square extends Shape
{
    float length;
    Square()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Lenght: ");
        length = sc.nextFloat();
    }
    void Area()
    {
        area = length * length;
    }
    void Perimeter()
    {
        perimeter = 4 * length;
    }
}
class Circle extends Shape
{
    float radius;
    Circle()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        radius = sc.nextFloat();
    }
    void Area()
    {
        area = 3.14 * radius * radius;
    }
    void Perimeter()
    {
        perimeter = 2 * 3.14 * radius;
    }
}
class CalShape
{
    public static void main(String[] args)
    {
        System.out.println("===RECTRANGLE===");
        Shape obj = new Rectrange();
        obj.Area();
        obj.Perimeter();
        obj.display();
        
        System.out.println("===SQUARE===");
        obj = new Square();
        obj.Area();
        obj.Perimeter();
        obj.display();

        System.out.println("===SQUARE===");
        obj = new Circle();
        obj.Area();
        obj.Perimeter();
        obj.display();
    }
}
