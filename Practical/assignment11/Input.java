import java.io.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args)
    {
    try {
        FileOutputStream obj = new FileOutputStream("demo.txt");
        BufferedOutputStream obj2 = new BufferedOutputStream(obj);
        int ch;

        while ((ch = System.in.read()) != -1)
            obj2.write((char)ch);
        
        obj.flush();
        obj2.close();
        obj.close();

    } catch (Exception e) {
        System.err.println(e);
    }
}    
}
