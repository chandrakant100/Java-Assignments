import src.Circle;
import src.Square;
import src.Rectrangle;

class CalShape {
    public static void main(String[] args)
    {
        System.out.println("======Circle======");
        Circle obj = new Circle();
        System.out.println("Area = "+obj.area());
        System.out.println("Perimeter = "+obj.perimeter());

        System.out.println("======Square======");
        Square obj2 = new Square();
        System.out.println("Area = "+obj2.area());
        System.out.println("Perimeter = "+obj2.perimeter());

        System.out.println("======Rectrangle======");
        Rectrangle obj3 = new Rectrangle();
        System.out.println("Area = "+obj3.area());
        System.out.println("Perimeter = "+obj3.perimeter());    
    }
}