import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter total shopping amount (₹): ");
        double amount = scanner.nextDouble();

        double discount = 0;

        
        if (amount > 5000) {
            discount = amount * 0.20;
        } else if (amount > 2000) {
            discount = amount * 0.10;
        }

        double finalAmount = amount - discount;

      
        System.out.println("Discount applied: ₹" + discount);
        System.out.println("Amount to be paid after discount: ₹" + finalAmount);

        scanner.close();
    }
}
