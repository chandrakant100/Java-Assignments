package src;
import java.util.*;

public class MaxMin {
    void FindMaxmin(char[] ch)
    {
        char[] maxChar = new char[26], minChar = new char[26];
        int k = 0, l = 0;
        int max = 0,min = 1;
        int count = 0;
        for (int i = 0; i < ch.length; i++)
            System.out.print(ch[i]+ "");

        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++)
        {
            count = 0;
            for (int j = 0; j < ch.length; j++)
            {
                if (ch[i] == ch[j])
                    count ++;
            }
            if(max < count)
            {
                max = count;
                maxChar[k] = ch[i];
                k ++;
            }
            else if (count <= min)
            {
                min = count;
                minChar[l] = ch[i];
                l ++;
            }
        }
        
        System.out.println("Max char occurance is: ");
        for (int i = 0; i < maxChar.length; i++)
        {
            System.out.print(maxChar[i]+" ");
        }

        System.out.println("\nMin char occurance is: ");
        for (int i = 0; i < minChar.length; i++)
        {
            System.out.print(minChar[i]+" ");
        }
    }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String:");
        String st = sc.nextLine();

        char[] ch = st.toCharArray();
        MaxMin obj=new MaxMin();
        obj.FindMaxmin(ch);
    }    
}
