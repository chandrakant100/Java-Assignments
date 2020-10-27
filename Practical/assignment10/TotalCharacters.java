package src;
import java.util.*;

public class TotalCharacters {
    int check(char[] ch)
    {
        int count = 0;

        for (int i = 0; i < ch.length; i++)
        {
            count ++;
        }
        return count;
    }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int count;
        TotalCharacters obj = new TotalCharacters();
        System.out.println("Enter any string:");
        String st = sc.nextLine();

        char[] ch = st.toCharArray();
        count = obj.check(ch);

        System.out.println("Total number of characters in String:- "+st+" are: "+count);
        sc.close();
    }    
}
