package Utilities;

import java.sql.DriverManager;

public class manageDB extends commonOps{
    public static void openDBConnection(String dbUrl, String user, String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, user, pass);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error occurred while connecting to DB, see details: " + e);
        }
    }

    public static void closeDBConnection(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error occurred while disconnecting from DB, see details: " + e);
        }
    }
}
