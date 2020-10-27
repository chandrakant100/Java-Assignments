package src;

import java.util.*;
import java.io.*;  
public class ThirdLine  {  
    public static void main(String args[]) throws Exception 
    {  
        if (args.length != 1)
        {
            System.out.println("Invalid arguments!!!");
            return;
        }
        File fp = new File(args[0]);

        Scanner sc = new Scanner(fp);
        int count = 0, i = 1;
        
        StringBuilder st;

        while (sc.hasNextLine())
        {
            if (count == 2)
            {
                st = new StringBuilder(sc.nextLine());
                System.out.println("Third line is present : "+st);
                st.reverse();
                System.out.println("After reversing : "+st);
                break;
            }
            System.out.println(i+": "+sc.nextLine());
            i ++;
            count ++;
        }
    }  
}  