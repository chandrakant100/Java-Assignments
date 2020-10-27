package src;
import java.util.*;

class Vehicle
{
    int chessis;
    String EngineNo;
    String Colour;
    static String Brand;
    String Variant;
    String Model;
    static{
        Brand = "Mercedes-Benz";
    }
    Vehicle(Scanner sc) throws InputMismatchException
    {
        System.out.println("Enter your chessis:");
        chessis = sc.nextInt();
        
        System.out.println("Enter your EngineNo:");
        sc.nextLine();
        EngineNo = sc.nextLine();

        System.out.println("Enter your Colour:");
        Colour = sc.nextLine();

        System.out.println("Enter your Variant:");
        sc.nextLine();
        Variant = sc.nextLine();

        System.out.println("Enter your Model:");
        Model = sc.nextLine();
    }
    void display()
    {
        System.out.println("\n");
        System.out.println("BRAND:    "+Brand);
        System.out.println("chessis:  "+chessis);
        System.out.println("EngineNo: "+EngineNo);
        System.out.println("Colour:   "+Colour);
        System.out.println("Variant:  "+Variant);
        System.out.println("Model:    "+Model);
    }
}
class V
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Vehicle obj = new Vehicle(sc);
        obj.display();

        sc.close();
    }
}