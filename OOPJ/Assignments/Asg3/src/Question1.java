	import java.util.Scanner;
public class Question1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the principal amount (loan amount) in INR: ");
	        double principal = scanner.nextDouble();
	        
	        System.out.print("Enter the annual interest rate (in percentage): ");
	        double annualInterestRate = scanner.nextDouble();
	        
	        System.out.print("Enter the loan term (in years): ");
	        int loanTermYears = scanner.nextInt();
	        
	        scanner.close();
	        
	        double monthlyInterestRate = annualInterestRate / 100 / 12;
	        
	        int numberOfMonths = loanTermYears * 12;
	        
	        double monthlyPayment = calculateMonthlyPayment(principal, monthlyInterestRate, numberOfMonths);
	        
	        double totalAmountPaid = monthlyPayment * numberOfMonths;
	        
	        System.out.printf("The monthly payment for the mortgage is: ₹%.2f\n", monthlyPayment);
	        System.out.printf("The total amount paid over the life of the loan is: ₹%.2f\n", totalAmountPaid);
	    }
	    
	
	    public static double calculateMonthlyPayment(double principal, double monthlyInterestRate, int numberOfMonths) {
	        if (monthlyInterestRate == 0) {
	            return principal / numberOfMonths;
	        }
	        double numerator = monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths);
	        double denominator = Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1;
	        return principal * (numerator / denominator);
	    }


}
