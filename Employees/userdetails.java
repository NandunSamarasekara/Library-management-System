package Employees;

public class userdetails{
    private String firstname;
    private String lastname;
    private String IDnum;

    //Setting up the first name
    public void set_firstname(String firstname){
        this.firstname = firstname;
    }

    public String get_name(){
        return firstname;
    }

    //Setting up the lastname
    public void set_lastname(String lastname){
        this.lastname = lastname;
    }

    public String getlastname(){
        return lastname;
    }

    public void set_IDnum(String lastname){
        this.IDnum = IDnum;
    }

    public String getIDnum(){
        return IDnum;
    }
}