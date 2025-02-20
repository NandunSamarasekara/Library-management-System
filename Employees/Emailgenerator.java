package Employees;

import java.util.Random;
import java.util.Scanner;

public class Emailgenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        userdetails u = new userdetails();

        // Getting the details from the user
        System.out.print("Firstname: ");
        String firstname = scanner.nextLine();
        u.set_firstname(firstname);

        System.out.print("Lastname: ");
        String lastname = scanner.nextLine();
        u.set_lastname(lastname);

        System.out.print("IDnum: ");
        String IDnum = scanner.nextLine();
        u.set_IDnum(IDnum);

        // Declaring the department for the user
        System.out.println("Department: ");
        System.out.println("1. Sales");
        System.out.println("2. Accounts");
        System.out.println("3. Management");

        int Department = scanner.nextInt();

        // Taking the department from the user
        switch (Department) {
            case 1:
                System.out.println("Your working email is: " + personaldetails(firstname, lastname, 1, "sales"));
                break;
            case 2:
                System.out.println("Your working email is: " + personaldetails(firstname, lastname, 2, "accounts"));
                break;
            case 3:
                System.out.println("Your working email is: " + personaldetails(firstname, lastname, 3, "management"));
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        System.out.println("Creating a password");
        System.out.println("-------------------");
        System.out.println("1. Suggest a password");
        System.out.println("2. Create a password");
        int option1 = scanner.nextInt();

        if (option1 == 1) {
            System.out.println("Your password is: " + passwordgenerator(IDnum));
        } else if (option1 == 2) {
            System.out.println(createpassword());
        } else {
            System.out.println("Invalid option");
        }

        System.out.println();
        System.out.println("Disclaimer: This is a testing programme");
        System.out.println("---------------------------------------");
        Runtime runtime = Runtime.getRuntime();
        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used: " + memoryUsed + " bytes");
    }

    // To generate an Email
    public static String personaldetails(String firstname, String lastname, int Department, String Departmentname) {
        Random rand = new Random();

        // Generating the random numbers for the Email
        int randomnumbers = rand.nextInt(900) + 100;

        // Generating the Email
        return firstname.toLowerCase() + randomnumbers + lastname.toLowerCase() + "." + Departmentname.toLowerCase() + "@sanders.com";
    }

    public static String passwordgenerator(String IDnum) {
        Random passran = new Random();

        // Generating numbers for the password
        String randompassword = IDnum + passran.nextInt(9000) + 1000;

        // Generating the password
        return randompassword;
    }

    public static String createpassword() {
        Scanner scanner = new Scanner(System.in);
        boolean passwordmorethan8;

        do {
            System.out.println();
            System.out.print("Enter the password: ");
            String password1 = scanner.nextLine();

            if (password1.length() > 8) {
                System.out.print("Re-Enter the password: ");
                String password2 = scanner.nextLine();

                if (password1.equals(password2)) {
                    return password2; // Passwords match, return the password
                } else {
                    System.out.println("Passwords don't match. Please try again.");
                    passwordmorethan8 = false; // Continue the loop
                }
            } else {
                System.out.println("Password should be more than 8 characters. Please try again.");
                passwordmorethan8 = false; // Continue the loop
            }
        } while (!passwordmorethan8); // Loop until a valid password is entered

        return ""; // This line is technically unreachable, but Java requires it
    }
}