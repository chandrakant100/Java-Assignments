package src;

import java.util.*;

class Bank 
{
    final float rateofinterest = 6;
    String name;
}
class SBI extends Bank
{
    final long accNo;
    SBI(Scanner sc)
    {
        System.out.println("Welcome to SBI.........");
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your Account number: ");
        accNo = sc.nextLong();
    }
    void display()
    {
        System.out.println("\nThanks for choosing SBI....");
        System.out.println("Your Account number: "+accNo);
        System.out.println("Your Name: "+name);
        System.out.println("Rate of interst: "+rateofinterest);
    }
}
class ICICI extends Bank
{
    final  long accNo;
    ICICI(Scanner sc)
    {
        System.out.println("Welcome to ICICI.........");
        System.out.print("Enter your name: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Enter your Account number: ");
        accNo = sc.nextLong();
        sc.close();
    }
    void display()
    {
        System.out.println("\nThanks for choosing ICICI....");
        System.out.println("Your Account number: "+accNo);
        System.out.println("Your Name: "+name);
        System.out.println("Rate of interst: "+rateofinterest);
    }
}
class InfoBank
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        SBI obj1 = new SBI(sc);
        ICICI obj2 = new ICICI(sc);
        obj1.display();
        obj2.display();
    }
}