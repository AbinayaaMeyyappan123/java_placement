import java.util.Scanner;

public class TrafficLightSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter traffic light color (red, yellow, green): ");
        String color = scanner.nextLine();
        switch (color) {
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("GET READY");
                break;
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid color. Please enter red, yellow, or green.");
        }

        scanner.close();
    }
}


