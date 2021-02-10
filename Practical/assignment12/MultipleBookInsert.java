package src;
import java.sql.*;
import java.util.*;

import javax.naming.NamingException;

public class MultipleBookInsert {
    void enterData(int count, Connection con) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int i = 1,value1;
        String value2,value3,value4,value5,value6;
        while(count != 0)
        {
            PreparedStatement pt = con.prepareStatement("insert into books(BID,BCategory,BName,Author,serialno,edition) values(?,?,?,?,?,?)");
            con.setAutoCommit(false);
            System.out.println("------Book "+i+" --------");
            
            System.out.println("Enter BID:");
            value1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter BCategory:");
            value2 = sc.nextLine();

            System.out.println("Enter BName:");
            value3 = sc.nextLine();

            System.out.println("Enter Author:");
            value4 = sc.nextLine();
            
            
            System.out.println("Enter Serial Number:");
            value5 = sc.nextLine();

            System.out.println("Enter Edition:");
            value6 = sc.nextLine();

            pt.setInt(1, value1);
            pt.setString(2, value2);
            pt.setString(3, value3);
            pt.setString(4, value4);
            pt.setString(5, value5);
            pt.setString(6, value6);
            
            int result = pt.executeUpdate();
            System.out.println("Books "+i+" updated successfully!!"+result);
            con.commit();
            count --;
            i++;
        }
        System.out.println("data ENtered successfully!!!");
        sc.close();
    }
    public static void main(String[] args)
    {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "System", "chandra801");
            System.out.println("Log-In to Oracle Database DONE Successfully");
            MultipleBookInsert obj = new MultipleBookInsert();

            Scanner sc = new Scanner(System.in);
            int count;
            System.out.println("Enter the number of books want to Enter: ");
            count = sc.nextInt();

            obj.enterData(count,con);
            sc.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
