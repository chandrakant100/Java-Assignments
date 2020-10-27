package src;
import java.util.*;
class Shape 
{
    double area;
    double perimeter;
    void display()
    {
        System.out.println("The Area:"+area);
        System.out.println("The perimeter:"+perimeter);
    }
}
class Rectrange extends Shape
{
    float length, breadth;
    void rectrange(Scanner sc)
    {
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
class Square extends Rectrange
{
    float length;
    void square(Scanner sc)
    {
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
class CalShape
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===RECTRANGLE===");
        Rectrange obj = new Rectrange();
        obj.rectrange(sc);
        obj.Area();
        obj.Perimeter();
        obj.display();
        
        System.out.println("===SQUARE===");
        Square obj1 = new Square();
        obj1.square(sc);
        obj1.Area();
        obj1.Perimeter();
        obj1.display();

        sc.close();
    }
}