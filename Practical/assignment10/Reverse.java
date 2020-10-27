package src;
import java.util.*;

public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String st = sc.nextLine();
        StringBuilder st1 = new StringBuilder(st);

        System.out.println("Before Reversing: "+st);
         st1 = st1.reverse();
        
        System.out.println("After Reversing: "+st1);       
    }
    
}
