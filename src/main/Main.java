

package src.main;
import java.sql.ResultSet;
import src.db.*;

public class Main {
    public static void main(String[] args) {
        ConnectDB db = new ConnectDB("jdbc:mysql://192.168.1.2:3306", "root", "root");
        System.out.println(db.openConnection());
        db.setUrl("jdbc:mysql://192.168.1.2:3306/areyoual_army");
        System.out.println(db.runStatement("SELECT Id, Name, Status, Message, Longitude, Latitude FROM soldiers"));
        
        System.out.println(db.closeConnection());
    }
}
