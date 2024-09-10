import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompoundInterestCalculatorUtil {

    public static CompoundInterestCalculator acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal principal = BigDecimal.ZERO;
        BigDecimal annualInterestRate = BigDecimal.ZERO;
        int numberOfCompounds = 0;
        int years = 0;
        
        try {
            System.out.print("Enter the initial investment amount (Principal) in ₹: ");
            principal = scanner.nextBigDecimal();
            
            System.out.print("Enter the annual interest rate (in %): ");
            annualInterestRate = scanner.nextBigDecimal();
            
            System.out.print("Enter the number of times the interest is compounded per year: ");
            numberOfCompounds = scanner.nextInt();
            
            System.out.print("Enter the investment duration (in years): ");
            years = scanner.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            System.exit(1);
        }

        return new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
    }

    public static void printRecord(CompoundInterestCalculator calculator) {
        System.out.println(calculator);
        BigDecimal futureValue = calculator.calculateFutureValue();
        BigDecimal totalInterestEarned = calculator.calculateTotalInterestEarned();
        
        System.out.printf("Future Value: ₹%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterestEarned);
    }

    public static void menuList() {
        System.out.println("Compound Interest Calculator Menu:");
        System.out.println("1. Enter investment details");
        System.out.println("2. Exit");
    }
}
