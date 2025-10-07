import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your current balance: ₹");
        double balance = sc.nextDouble();

      
        System.out.print("Enter withdrawal amount: ₹");
        double withdrawal = sc.nextDouble();
        if (withdrawal <= balance) {
            balance -= withdrawal;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: ₹" + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}
