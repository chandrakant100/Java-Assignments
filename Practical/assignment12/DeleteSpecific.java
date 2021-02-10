package src;
import java.sql.*;
import java.util.*;

import javax.naming.NamingException;

public class DeleteSpecific {
    public static void main(String[] args)
    {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "System", "chandra801");
            System.out.println("Log-In to Oracle Database DONE Successfully");

            Scanner sc = new Scanner(System.in);
            System.out.println("---Delete a Specific book Info---");
            System.out.println("Enter ID of the book:");
            int id = sc.nextInt();

            PreparedStatement pt = con.prepareStatement("Delete from books where BID=?");
            con.setAutoCommit(false);
            pt.setInt(1, id);
            
            int result = pt.executeUpdate();
            con.commit();
            System.out.println("Data deleted successfully!!!"+result);
            sc.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
