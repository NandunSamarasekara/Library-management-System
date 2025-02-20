import java.util.Arrays;
import java.util.Scanner;

public class Searchandborrow {

    public static void Search() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the book: ");
        String target = scanner.nextLine();
        
        // Call the searchBook method from DisplayingBooks.
        // This will search through all categories and print the author and category if found.
        DisplayingBooks.searchBook(target);

        main();
    }
    
    public static void main() {
    Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Do you want to borrow that book");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int option3 = scanner.nextInt();

        if (option3 == 1) {
            borrowabook.main();
        }
        else if(option3 == 2){
            System.out.println("");
        }
        else{
            System.out.println("Invalid option");
        }
    }
    
}
