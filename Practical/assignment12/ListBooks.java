package src;
import java.sql.*;

public class ListBooks {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "System", "chandra801");
            System.out.println("Log-In to Oracle Database DONE Successfully");

            PreparedStatement stmt = con.prepareStatement("select * from books");
            con.setAutoCommit(false);   
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
