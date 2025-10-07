import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 300) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else {
            bill = (100 * 5) + (200 * 7) + ((units - 300) * 10);
        }
        if (bill > 2000) {
            bill += bill * 0.10; 
        }
        System.out.println("Total electricity bill: ₹" + bill);

        scanner.close();
    }
}
