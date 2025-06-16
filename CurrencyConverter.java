import java.util.Scanner;

public class CurrencyConverter {

    static double INR = 83.00;
    static double EUR = 0.93;
    static double GBP = 0.79;
    static double JPY = 157.40;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.print("Enter amount in USD: ");
        double amount = sc.nextDouble();

        System.out.println("\nConvert to:");
        System.out.println("1. Indian Rupee (INR)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. British Pound (GBP)");
        System.out.println("4. Japanese Yen (JPY)");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        convertCurrency(amount, choice);
        sc.close();
    }

    public static void convertCurrency(double amount, int choice) {
        switch (choice) {
            case 1:
                System.out.printf("%.2f USD = %.2f INR\n", amount, amount * INR);
                break;
            case 2:
                System.out.printf("%.2f USD = %.2f EUR\n", amount, amount * EUR);
                break;
            case 3:
                System.out.printf("%.2f USD = %.2f GBP\n", amount, amount * GBP);
                break;
            case 4:
                System.out.printf("%.2f USD = %.2f JPY\n", amount, amount * JPY);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}