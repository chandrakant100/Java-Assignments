package src;

import java.sql.*;
public class AuthorEdi {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "System", "chandra801");
            System.out.println("Log-In to Oracle Database DONE Successfully");

            Statement stmt = con.createStatement();
            con.setAutoCommit(false);
            String cmd = "create table books(BID int,BCategory varchar(255),BName varchar(255),author varchar(255),serialNo varchar(255),edition varchar(255))";
            
            ResultSet affect = stmt.executeQuery(cmd);
            con.commit();
            System.out.println("Successfull - >"+affect);
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
