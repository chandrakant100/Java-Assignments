import java.sql.*;

public class MakeTable {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "System", "chandra801");
            System.out.println("Log-In to Oracle Database DONE Successfully");

            Statement stmt = con.createPStatement();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
