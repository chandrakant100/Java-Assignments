package src;
import java.util.*;

public class SeperateVowelConsonants {
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
        char[] vowel = new char[26];
        char[] consonants = new char[26];

        int count = 0, k = 0, l = 0;

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
        for (int i = 0 ; i < temp.length; i++)
        {
            if (temp[i] == 'a' || temp[i] == 'A' || temp[i] == 'e' || temp[i] == 'E' || temp[i] == 'i' || temp[i] == 'I' || temp[i] == 'o' || temp[i] == 'O' || temp[i] == 'u' || temp[i] == 'U')
            {
                vowel[k] = temp[i];
                k ++;
            }
            else
            {
                consonants[l] = temp[i];
                l ++;
            }
        }
        String st = new String(vowel);
        System.out.println("Vowels in String are: "+st);

        st = new String(consonants);
        System.out.println("consonants in String are: "+st);
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string: ");
        String st = sc.nextLine();
        SeperateVowelConsonants obj = new SeperateVowelConsonants();

        char[] ch = st.toCharArray();

        obj.check(ch);
        
        sc.close();
    }
    
}
