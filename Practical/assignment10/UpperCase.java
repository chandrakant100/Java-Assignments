package src;
import java.util.*;

public class UpperCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any string:");
        String st = sc.nextLine();

        char[] ch = st.toCharArray();

        int value;
        System.out.println("Before conversion: "+st);
        for (int i = 0; i < ch.length; i++)
        {
            value = (int)ch[i];
            if ( (value >= 97) && (value <= 122))
            {
                ch[i] = (char)(value - 32);
            }
        }

        st = new String(ch);

        System.out.println("After converting from lower case to upper case: "+st);
    }
}
