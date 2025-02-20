import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Premium {
    public static void main(String[] args) {
    Queue<Integer> premiumaccs = new LinkedList<>();

    Scanner scanner = new Scanner(System.in);    
        System.out.println("Sanders library premium package");
        String decision; 
        
        for (int i = 0; i < 10; i++) {
            premiumaccs.offer(i);
        }

        do {
            Accountcreation();
            System.out.println(" ");
            premiumaccs.poll();
            System.out.println(premiumaccs.size() + " accounts has left");
            System.out.print("Do you want to create a new account: ");
            decision = scanner.nextLine();
        } while (decision.equals("yes"));
    }

    public static void Accountcreation() {
    Scanner scanner = new Scanner(System.in);
    

            System.out.print("First name: ");
            String firstname = scanner.nextLine();
    
            System.out.print("Last name: ");
            String lastname = scanner.nextLine();
    
            System.out.print("National Identity Card Number: ");
            String IDnum = scanner.nextLine();
    
            // You can include verification logic here (currently commented out)
            
            //if (IDnum.equals()) {
                System.out.println("Your account has been verified");
                System.out.println(" ");
                System.out.println("Your Email is: " + Passwordcreation(firstname, lastname) + ".premium" + "@sanders.com");
                
            //}
            //else {
            //  System.out.println("Account has not verified");
            //}    
        
    }

    public static String Passwordcreation(String firstname, String lastname) {

        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        Random rand = new Random();
        int randomNumber = rand.nextInt(9000) + 1000;

        String password = firstname + lastname + randomNumber;

        return password;
        
    }
}
