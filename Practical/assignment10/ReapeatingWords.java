package src;
import java.util.*;

public class ReapeatingWords {
    String checkWords(String st)
    {
        String[] words = st.split(" ");
        int count = 0,max = 0;
        String mostReapeatingWord = "\0";

        for (int i = 0; i < words.length; i++)
        {
            for (int j = i+1; j < words.length; j++)
            {
                if (words[i].compareTo(words[j]) == 0)
                {
                    count ++;
                }
            }
            if (max < count)
            {
                max = count;
                mostReapeatingWord = words[i];
            }
            count = 0;
        }
        return mostReapeatingWord;
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       ReapeatingWords obj = new ReapeatingWords();
       System.out.println("Enter any string: ");
       String st = sc.nextLine();
    
       System.out.println("The String is: "+st);

       String Rword = obj.checkWords(st);
       if (Rword == "\0")
       {
           System.out.println("There is no reapeating words!!");
       }
       else
       {
        System.out.println("Most repeating word is: "+Rword);
       }
        
       sc.close();         
    }    
}
