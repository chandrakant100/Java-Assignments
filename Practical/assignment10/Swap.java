package src;
import java.util.*;

public class Swap {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String1: ");
        String st1 = sc.nextLine();

        System.out.println("Enter String2: ");
        String st2 = sc.nextLine();

        System.out.println("Before swap:\nst1: "+st1+"\nst2: "+st2);
        st1 = st1 + st2;
        st2 = st1.substring(0,st1.length() - st2.length());
        st1 = st1.substring(st2.length());

        System.out.println("After swap:\nst1: "+st1+"\nst2: "+st2);
    }
}
