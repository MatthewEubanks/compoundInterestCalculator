
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Compound interest calculator
        try (Scanner scanner = new Scanner(System.in)) {

            double principal;
            double rate;
            int timesCompounded;
            int years;
            double amount;

            System.out.print("Enter the principal amount: ");
            principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (in %): ");
            rate = scanner.nextDouble() / 100;

            System.out.print("Enter the number of times that interest is compounded per year: ");
            timesCompounded = scanner.nextInt();
            System.out.print("Enter the number of years the money is invested for: ");
            years = scanner.nextInt();
            amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);

            System.out.printf("The amount after %d years is: $%.2f\n", years, amount);
            System.out.printf("The interest earned is: $%.2f\n", amount - principal);

        }
    }
}
