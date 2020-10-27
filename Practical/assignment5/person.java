package src;
import java.util.*;

class Person
{
    int ID;
    String name;
    char gender;
    String bloodGrp;
    String nationality;
    Person(Scanner sc) throws InputMismatchException
    {
        System.out.println("Enter your ID:");
        ID = sc.nextInt();
        
        System.out.println("Enter your Name:");
        sc.nextLine();
        name = sc.nextLine();

        System.out.println("Enter your Gender:");
        gender = sc.next().charAt(0);

        System.out.println("Enter your BloodGrp:");
        sc.nextLine();
        bloodGrp = sc.nextLine();

        System.out.println("Enter your nationality:");
        nationality = sc.nextLine();
    }
    void display()
    {
        System.out.println("\n");
        System.out.println("ID:             "+ID);
        System.out.println("Name:           "+name);
        System.out.println("Gender:         "+gender);
        System.out.println("BloodGroup:     "+bloodGrp);
        System.out.println("Nationality:    "+nationality);
    }
}
class P
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Person obj = new Person(sc);
        obj.display();

        sc.close();
    }
}