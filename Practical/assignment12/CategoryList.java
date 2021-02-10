package src;
import java.sql.*;
import java.util.*;

public class CategoryList {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "System", "chandra801");
            System.out.println("Log-In to Oracle Database DONE Successfully");
            Scanner sc = new Scanner(System.in);

            PreparedStatement stmt = con.prepareStatement("select * from books where BCategory=?");
            con.setAutoCommit(false);
            System.out.println("Enter the category of the book:");
            String cat = sc.nextLine();
            stmt.setString(1,cat);
               
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
                System.out.println();
            }
            con.commit();
            System.out.println("Displayed successfully!!!"+rs);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
