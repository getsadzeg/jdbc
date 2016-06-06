

package src.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectDB {
    private Connection conn;
    private Statement st = null;
    private ResultSet rst = null;
    private final String user;
    private final String password;
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
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Connection getConn() {
        return conn;
    }
    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
     public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }
    
    public ResultSet getRst() {
        return rst;
    }

    public void setRst(ResultSet rst) {
        this.rst = rst;
    }
    
    public boolean openConnection() {
        boolean RESULT = false;
        try {
            setConn(DriverManager.getConnection(this.getUrl(), this.user, this.password));
            RESULT = true;
        }
        catch(SQLException ex) {
            System.out.println("something blew up");
            ex.printStackTrace();
        }
        return RESULT;
    }
    public boolean runStatement(String SQLstatement) {
        
        try {
             setSt(this.conn.createStatement());
             setRst(getSt().executeQuery(SQLstatement));
        }
        catch(SQLException ex) {
            System.out.println("statement running blew up");
            ex.printStackTrace();
        }
        return getRst()!=null;
    }
    public boolean closeConnection() {
        boolean RESULT = false;
        try {
            getConn().close();
            RESULT = true;
        }
        catch(SQLException ex) {
            System.out.println("something blew up while closing connection(s)");
            ex.printStackTrace();
        }
        return RESULT;
    }
    public void displayData() {
        try {
            while(rst.next()) {
                String name = rst.getString("Name");
                String surname = rst.getString("Surname");
                String ID = rst.getString("ID");
                String phoneNumber = rst.getString("phoneNumber");
                String Password = rst.getString("Password");
                System.out.println(name + " " + surname + " " + ID + " " + phoneNumber + " " + Password);
                
            }
        }
        catch(SQLException ex) {
            System.out.println("something blew up while displaying data");
            ex.printStackTrace();
        }
    }

    }
    
