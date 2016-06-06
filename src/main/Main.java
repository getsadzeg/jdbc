

package src.main;
import java.sql.ResultSet;
import src.db.*;

public class Main {
    public static void main(String[] args) {
        ConnectDB db = new ConnectDB("jdbc:mysql://192.168.1.2:3306", "root", "root");
        System.out.println(db.openConnection());
        
        System.out.println(db.runStatement("SELECT Name, Surname, ID, phoneNumber, Password FROM lake.users"));
        
        db.displayData(); //displayed successfully
        
        System.out.println(db.closeConnection());
        
        
    }
}
