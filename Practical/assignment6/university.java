package src;
import java.util.*;

class Address
{
    int pin;
    String address;
    Address()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===University Address details ===");
        System.out.println("Enter University pin: ");
        pin = sc.nextInt();
        System.out.println("Enter University Address: ");
        sc.nextLine();
        address = sc.nextLine();
    }
}
class University 
{
    String uname;
    Address uadd;
    int noDep;
    String vcname;
    String NaacGrade;

    void input(Address Add)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===University details ===");
        System.out.println("Enter University Name: ");
        uname = sc.nextLine();

        uadd = Add;

        System.out.println("Enter DepartmentNO: ");
        noDep = sc.nextInt();

        System.out.println("Enter vcName: ");
        sc.nextLine();
        vcname = sc.nextLine();

        System.out.println("Enter NAAC GRADE: ");
        NaacGrade = sc.nextLine();
    }
    void display()
    {
        System.out.println("University Name: "+uname);
        System.out.println("University pin: "+uadd.pin+"\nUniversity Address: "+uadd.address);
        System.out.println("No. of departments: "+noDep);
        System.out.println("VC Name: "+vcname);
        System.out.println("NAAC Grade: "+NaacGrade);
    }
}
class Student extends University
{
    String name;
    long registrationNo;
    Student()
    {
        System.out.println("===Student details ===");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter registration number: ");
        registrationNo = sc.nextInt();
    }
    void display()
    {
        System.out.println("Student name: "+name);
        System.out.println("Student Registration NO: "+registrationNo);
    }
}
class Teacher extends University
{
    String name;
    long TeacherId;
    Teacher()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Teachers details ===");
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your ID: ");
        TeacherId = sc.nextLong();
    }
    void display()
    {
        System.out.println("Teacher name: "+name);
        System.out.println("teacher ID: "+TeacherId);
    }
}
class InfoUniversity
{
    public static void main(String[] args)
    {
        Address Add = new Address();
        University obj = new University();
        obj.input(Add);

        System.out.println("=======University details===============");
        obj.display();
        System.out.println("========================================");
        
        obj = new Student();
        System.out.println("=======Student details===============");
        obj.display();
        System.out.println("========================================");
        
        obj = new Teacher();
        System.out.println("=======Teacher details===============");
        obj.display();
        System.out.println("========================================");
    }
}
