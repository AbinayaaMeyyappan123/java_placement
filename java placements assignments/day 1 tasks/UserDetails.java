import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your contact number: ");
        String contact = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        System.out.println("\nUser Details");
        System.out.println("Name    : " + name);
        System.out.println("Contact : " + contact);
        System.out.println("Email   : " + email);
        System.out.println("Password: " + password); 
        sc.close();
    }
}
