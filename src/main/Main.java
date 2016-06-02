
package main;
import db.*;

public class Main {
    public static void main(String[] args) {
        ConnectDB db = new ConnectDB("jdbc:mysql://192.168.1.2:3306", "root", "root");
        db.openConnection();
    }
}
