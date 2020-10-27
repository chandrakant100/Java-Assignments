package src;

import java.util.*;
import java.io.*;  
public class LineByLine  {  
    public static void main(String args[]) throws Exception 
    {  
        if (args.length != 1)
        {
            System.out.println("Invalid arguments!!!");
            return;
        }
        File fp = new File(args[0]);

        Scanner sc = new Scanner(fp);
        int i = 1;
        while (sc.hasNextLine())
        {
            System.out.println(i+": "+sc.nextLine());
            i ++;
        }
    }  
}  