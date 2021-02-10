package src;
import java.sql.*;
import java.util.*;

import javax.naming.NamingException;

public class SpecificUpdate {
    public static void main(String[] args)
    {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "System", "chandra801");
            System.out.println("Log-In to Oracle Database DONE Successfully");

            Scanner sc = new Scanner(System.in);
            System.out.println("---Update a Specific book Info---");
            System.out.println("Enter ID of the book:");
            int id = sc.nextInt();

            PreparedStatement pt = con.prepareStatement("UPDATE books set serialno=?,edition=? WHERE BID=?");
            con.setAutoCommit(false);
            sc.nextLine();
            System.out.println("Enter updated serial No:");
            String sn = sc.nextLine();

            System.out.println("Enter the updated Edition:");
            String ed = sc.nextLine();
            
            pt.setString(1, sn);
            pt.setString(2, ed);
            pt.setInt(3, id);
            
            int result = pt.executeUpdate();
            con.commit();
            System.out.println("Data Entered successfully!!!"+result);
            sc.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
