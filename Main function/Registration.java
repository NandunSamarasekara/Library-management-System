import java.util.Scanner;

public class Registration {

    public static void registerUser(){
    Userdetailslist UserIdslist = new Userdetailslist();
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("First name: ");
    String firstname = scanner.nextLine();

    System.out.print("Last name: ");
    String lastname = scanner.nextLine();

    System.out.print("ID number: ");
    String IDnum = scanner.nextLine();

    Userdetailslist.firstname(firstname);
    Userdetailslist.lastname(lastname);
    Userdetailslist.IDs(IDnum);

    //Include firstname, lastname, IDnum into a database. IDnum is the primary key
    scanner.close();
    System.out.println("You've all set successfully");

    }
}
