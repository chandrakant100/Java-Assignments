package src;
import java.util.*;

public class VowelConsonants {
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
               if (isduplicate(ch[j],temp,count) == false)
                {
                  temp[count] = ch[j];
                    count ++;
                }
            }                
        }
        int vowel = 0, cons = 0;
        for (int i = 0; i < count; i++)
        {
            temp[i] = Character.toLowerCase(temp[i]);

            if ((temp[i] == 'a') || (temp[i] == 'e') || (temp[i] == 'i') || (temp[i] == 'o') || (temp[i] == 'u'))
            {
                vowel ++;
            }
            else
            {
                cons ++;
            }
        }
        System.out.println("No. of vowels are "+vowel+" and consonants are "+cons);
    }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        VowelConsonants obj = new VowelConsonants();
        System.out.println("Enter any string");
        String st = sc.nextLine();
        char[] ch = st.toCharArray();

        obj.check(ch);
        sc.close();

    }
}
