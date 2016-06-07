

package src.main;
import src.db.ConnectDB;

public class Main {
    public static void main(String[] args) {
        ConnectDB db = new ConnectDB("jdbc:mysql://107.170.50.225:3306/lake", "root", "lapptech100#");
        System.out.println(db.openConnection());
        
        System.out.println(db.runStatement("SELECT Name, Surname, ID, phoneNumber, Password FROM users"));
        System.out.println(db.runUpdate("INSERT into users (Name, Surname) values('Tornike', 'Shavidze')"));


        db.displayData(); //displayed successfully
        
        System.out.println(db.closeConnection());
        
        
    }
}
