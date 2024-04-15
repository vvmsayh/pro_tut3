import java.util.ArrayList;
public class User {
    public String Name;
    public String lname;
    public String email;
    public String Password;
    private Boolean isGuest;
    public User(String Name, String lname, String email, String Password) {
        this.Name = Name;
        this.lname = lname;
        this.email = email;
        this.Password=Password;
        this.isGuest =false;

    }
    public User(String email){
        this.email=email;
        this.isGuest=true;
    }
    public void User_Guest(String Name,String lname, String Password){
        this.Name =Name;
        this.lname = lname;
        this.Password=Password;
        this.isGuest=false;
    }
}