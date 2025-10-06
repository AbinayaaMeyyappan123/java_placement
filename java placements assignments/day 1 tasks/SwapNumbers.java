import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter second number (y): ");
        int y = sc.nextInt();

        System.out.println("\nBefore swap: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap (using temp): x = " + x + ", y = " + y);
        System.out.println("\nSwap without temporary variable demonstration");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("Before: p = " + p + ", q = " + q);

        p = p + q;
        q = p - q;
        p = p - q;

        System.out.println("After (without temp): p = " + p + ", q = " + q);

        sc.close();
    }
}
