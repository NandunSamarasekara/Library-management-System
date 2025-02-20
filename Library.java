import java.util.Scanner;
import java.util.Stack;


public class Library {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    boolean running = true;
    long starttime = System.currentTimeMillis();
    long startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

    while (running) {  
        System.out.println("Sanders Library System");
        System.out.println("----------------------");
        System.out.println("1. Registration");
        System.out.println("2. Displaying books");
        System.out.println("3. Search & Borrow");
        System.out.println("4. Return a book");
        System.out.println("5. Events and Programs");
        System.out.println("6. Admin Panel");
        System.out.println("7. Quitting the programme");

        System.out.println();

    System.out.print("Select an option: ");
    int option1 = scanner.nextInt();

    

    switch (option1) {
        case 1:
        Registration Registration = new Registration();
            Registration.registerUser();
        break;
        case 2:
            DisplayingBooks.categories();
        break;
        case 3:
            Searchandborrow.Search();
        break;
        case 4:
            Returnabook.returning();   
        break;
        case 5:
            EventsandPrograms.events();
        break;
        case 6:
            Adminpanel.admins();
        break;
        case 7:
            System.out.println("Quiting the programme");
            running = false;
        break;
        default:
        System.out.println("Invalid option");
            break;
            
    }
    System.out.println("");

    
    
    }
    long endTime = System.currentTimeMillis();
    long endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    System.out.println("Time consumed: "+((endTime - starttime)/1000) + " seconds");
    System.out.println();
    System.out.println("The memory consumed: "+ ((startMemory - endMemory)/1024) + " kilobytes");

    }

    
}
