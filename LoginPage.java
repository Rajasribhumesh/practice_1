import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        // Hardcoded username and password
        String validUsername = "admin";
        String validPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login Page ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
   
