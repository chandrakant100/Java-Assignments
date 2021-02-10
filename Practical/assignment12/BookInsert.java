package src;
import java.sql.*;

public class BookInsert {
    public static void  main(String[] args)
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "System", "chandra801");
            System.out.println("Log-In to Oracle Database DONE Successfully");

            Statement stmt = con.createStatement();

            String sqlcmd = "insert into Books(BID,BCategory,BName,author,serialNo,edition) values('1','CS','UNIX','Eric S. Raymond','2417','3rd')";
            con.setAutoCommit(false);
            int affect = stmt.executeUpdate(sqlcmd);
            con.commit();
            System.out.println("Successful!! -> "+affect);
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
