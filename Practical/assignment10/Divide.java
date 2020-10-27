package src;
import java.util.*;

public class Divide {
    void divide(int n, String st) throws StringIndexOutOfBoundsException
    {
        String[] ch = new String[n];
        if (st.length() % 2 != 0)
        {
            System.out.println("Cannot divide into equal parts!!!");
            return;
        }
        if ( n > st.length())
        {
            System.out.println("divide size is greater than string size!!!");
            return;
        }
        int len = (st.length()) / n;
        int temp = len;
        int k = 0;
        for ( int i = 0; i < n; i++)
        {
            ch[i] = st.substring(k,len);
            k += temp;
            len += temp;
        }
        System.out.println("After dividing: ");
        for (int i = 0; i < n ; i++)
        {
            System.out.println(ch[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String st = sc.nextLine();

        Divide obj = new Divide();
        System.out.println("Enter no.of parts want to divide: ");
        int n = 0;
        try
        {   n = sc.nextInt();}
        catch (Exception a)
        { System.out.println(a); };

        obj.divide(n,st);
    }
    
}
