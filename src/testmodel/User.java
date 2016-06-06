package src.testmodel;



public class User {
    
    private String Name;
    private String Surname;
    private String ID;
    private String phoneNumber;
    private String Password;
    private String randomName;

    public User() {

    }

    public User(String Name, String Surname, String ID, String phoneNumber, String Password) {
        this.Name = Name;
        this.Surname = Surname;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
