package src;
import java.io.*;

public class Listdirectory {
    public static void main(String[] args)
    {
        if (args != 1)
        {
            System.out.println("Invalid Arguments!!!");
            return;
        }
        File fp = new File(args[0]);

        File[] list = fp.listFiles();
        int count = 0;
        for (File data:list)
        {
            System.out.println("Name: "+data.getName());
            System.out.println("Size: "+data.getTotalSpace();
        }

    
    }
}
