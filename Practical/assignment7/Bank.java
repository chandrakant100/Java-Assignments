package src;
import java.util.Scanner;

abstract class Bank {
    abstract void getRateofInterest();
    abstract void getBalance();
}
class SBI extends Bank {
    float ri;
    double balance;
    Scanner sc = new Scanner(System.in);
    void getRateofInterest()
    {
        System.out.println("Enter the rate of interest: ");
        ri = sc.nextFloat();
    }
    void getBalance()
    {
        System.out.println("Enter the balance: ");
        balance = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Rate of interest: "+ri);
        System.out.println("Balance :"+balance);
    }
}
class PNB extends Bank {
    float ri;
    double balance;
    Scanner sc = new Scanner(System.in);
    void getRateofInterest()
    {
        System.out.println("Enter the rate of interest: ");
        ri = sc.nextFloat();
    }
    void getBalance()
    {
        System.out.println("Enter the balance: ");
        balance = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Rate of interest: "+ri);
        System.out.println("Balance :"+balance);
    }
}
class BOI extends Bank {
    float ri;
    double balance;
    Scanner sc = new Scanner(System.in);
    void getRateofInterest()
    {
        System.out.println("Enter the rate of interest: ");
        ri = sc.nextFloat();
    }
    void getBalance()
    {
         
        System.out.println("Enter the balance: ");
        balance = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Rate of interest: "+ri);
        System.out.println("Balance :"+balance);
    }
}
class IOB extends Bank {
    float ri;
    double balance;
    Scanner sc = new Scanner(System.in);
    void getRateofInterest()
    {
        System.out.println("Enter the rate of interest: ");
        ri = sc.nextFloat();
    }
    void getBalance()
    {
        System.out.println("Enter the balance: ");
        balance = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Rate of interest: "+ri);
        System.out.println("Balance :"+balance);
    }
}
class UCO extends Bank {
    float ri;
    double balance;
    Scanner sc = new Scanner(System.in);
    void getRateofInterest()
    {
        System.out.println("Enterthe rate of interest: ");
        ri = sc.nextFloat();
    }
    void getBalance()
    {
        System.out.println("Enter the balance: ");
        balance = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Rate of interest: "+ri);
        System.out.println("Balance :"+balance);
    }
}
class bank{
    public static void main(String[] args)
    {
        System.out.println("======SBI======");
        SBI obj = new SBI();
        obj.getRateofInterest();
        obj.getBalance();
        System.out.println("======DATA======");
        obj.display();

        System.out.println("======PNB======");
        PNB obj1 = new PNB();
        obj1.getRateofInterest();
        obj1.getBalance();
        System.out.println("======DATA======");
        obj1.display();
        
        System.out.println("======BOI======");
        BOI obj2 = new BOI();
        obj2.getRateofInterest();
        obj2.getBalance();
        System.out.println("======DATA======");
        obj2.display();

        System.out.println("======IOB======");
        IOB obj3 = new IOB();
        obj3.getRateofInterest();
        obj3.getBalance();
        System.out.println("======DATA======");
        obj3.display();

        System.out.println("======UCO======");
        UCO obj4 = new UCO();
        obj4.getRateofInterest();
        obj4.getBalance();
        System.out.println("======DATA======");
        obj4.display();
    }
}
