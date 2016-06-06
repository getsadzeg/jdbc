

package src.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectDB {
    private Connection conn;
    private String user;
    private String password;
    private String url;
    
    
    public ConnectDB(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.conn = null;
        //load mysql driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found...");
			e.printStackTrace();
		}
    }
    public void openConnection() {
        try {
            conn = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("CONNECTION SUCCESS");
        }
        catch(SQLException ex) {
            System.out.println("something blew up");
            ex.printStackTrace();
        }
    }
}
