package src;
import java.util.*;

public class Pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any string:");
        String st = sc.nextLine();

        char[] ch = st.toCharArray();

        int val = ch.length, flag = 0;
        for (int i = 0,j = val - 1; i < val/2 &&j > val/2; i ++,j--)
        {
            if (ch[i] != ch[j])
            {
                flag = 1;
                break;
            }
        }
        st = new String(ch);
        if (flag == 0)
        {
            System.out.println("The String is pallindrome!!");
        }
        else{
            System.out.println("The String is not pallindrome!!");
        }
    }
    
}
