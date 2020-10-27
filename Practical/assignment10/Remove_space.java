package src;
import java.util.*;

public class Remove_space {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any string:");
        String st = sc.nextLine();

        char[] ch = st.toCharArray();
        char[] temp = new char[st.length()];

        System.out.println("Before removing spaces: "+st);
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] != ' ')
            {
                temp[i] = ch[i];
            }
        }

        st = new String(temp);

        System.out.println("After removing spaces: "+st);
    }
}
