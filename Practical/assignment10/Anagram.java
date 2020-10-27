package src;
import java.util.*;

public class Anagram {
    boolean anagram(String s1, String s2)
    {
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(String.valueOf(ch1));
        System.out.println(String.valueOf(ch2));
        
        if (String.valueOf(ch1) == String.valueOf(ch2))
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1, s2;
        boolean check;
        
        Anagram obj = new Anagram();
        System.out.println("Enter String1: ");
        s1 = sc.nextLine();

        System.out.println("Enter String2: ");
        s2 = sc.nextLine();

        check = obj.anagram(s1,s2);
        if (check == true)
            System.out.println("The string '"+s1+"' and '"+s2+"' are Anagram");
        else
            System.out.println("The string '"+s1+"' and '"+s2+"' are not Anagram");

        sc.close();
    }
    
}
