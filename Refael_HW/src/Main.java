import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their monthly salary
        System.out.print("Enter your monthly salary: ");
        double salary = scanner.nextDouble();

        // Calculate and display the tax
        double tax = taxCalculator.calculateTax(salary);
        System.out.printf("The tax for a salary of %.2f NIS is: %.2f NIS\n", salary, tax);

        scanner.close();
    }
}
