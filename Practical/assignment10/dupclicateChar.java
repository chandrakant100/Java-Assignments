package src;
import java.util.*;

class DupclicateChar {
    boolean isduplicate(char val, char[] temp, int count)
    {
        for (int i = 0; i < count; i++)
        {
            if (temp[i] == val)
                return true;
        }
        return false;
    }
    void check(char[] ch)
    {
        char[] temp = new char[26];
        int count = 0;

        for (int i = 0; i < ch.length; i++)
        {
            for (int j = i+1; j < ch.length; j++)
            {
                if (ch[i] == ch[j])
                {   
                    if (isduplicate(ch[j],temp,count) == false)
                    {
                        temp[count] = ch[j];
                        count ++;
                    }
                }
            }    
        }
        System.out.println("DUplicate characters are:");
        for (int i = 0; i < count; i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        DupclicateChar obj = new DupclicateChar();
        System.out.println("Enter any string:");
        String st = sc.nextLine();

        char[] ch = st.toCharArray();
        obj.check(ch);
        sc.close();
    }
}
