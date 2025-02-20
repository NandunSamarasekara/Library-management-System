import java.util.Stack;
import java.util.Scanner;

public class borrowabook{
    public static void main(){
    Scanner scanner  = new Scanner(System.in);
    Stack<String> alreadyborrowedbooks = new Stack<>();
    
    System.out.print("Name of the user: ");
    String username = scanner.nextLine();

    System.out.print("User ID: ");
    String userID = scanner.nextLine();



    //When the user enters the name and the ID, the system searches the ID in the database and search further to the previously borrowed books
    //IF there are no books. the searched book is added to the queue and the book is remove from the arraylist. 
    //Else the system should display the already borrowed book stack
    

    
    }
}