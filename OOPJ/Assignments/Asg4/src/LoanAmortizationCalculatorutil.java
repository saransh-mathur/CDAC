import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoanAmortizationCalculatorutil {

    public static LoanAmortizationCalculator acceptRecord() {
        try (Scanner sc = new Scanner(System.in)) {
			BigDecimal principal = BigDecimal.ZERO;
			BigDecimal annualInterestRate = BigDecimal.ZERO;
			int loanTerm = 0;
			
			try {
			    System.out.print("Enter the loan amount (Principal) in ?: ");
			    principal = sc.nextBigDecimal();
			    
			    System.out.print("Enter the annual interest rate (in %): ");
			    annualInterestRate = sc.nextBigDecimal();
			    
			    System.out.print("Enter the loan term (in years): ");
			    loanTerm = sc.nextInt();
			    
			} catch (InputMismatchException e) {
			    System.out.println("Invalid input. Please enter numeric values.");
			    System.exit(1);
			}

			return new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
		}
    }

    public static void printRecord(LoanAmortizationCalculator calculator) {
        System.out.println(calculator);
        BigDecimal monthlyPayment = calculator.calculateMonthlyPayment();
        BigDecimal totalAmountPaid = calculator.calculateTotalAmountPaid();
        
        System.out.printf("Monthly Payment: ?%.2f%n", monthlyPayment);
        System.out.printf("Total Amount Paid Over the Life of the Loan: ?%.2f%n", totalAmountPaid);
    }

    public static void menuList() {
        System.out.println("Mortgage Loan Calculator Menu:");
        System.out.println("1. Enter loan details");
        System.out.println("2. Exit");
    }
}
