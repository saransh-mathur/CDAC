import java.util.Scanner;

public class Question2 {
	
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int investmentDuration;
    private double futureValue;
    private double totalInterest;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount (in INR): ");
        this.principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        this.annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        this.numberOfCompounds = scanner.nextInt();

        System.out.print("Enter the investment duration (in years): ");
        this.investmentDuration = scanner.nextInt();

        scanner.close();
    }

    public void calculateFutureValue() {
        double rate = this.annualInterestRate / 100;
        this.futureValue = this.principal * Math.pow(1 + rate / this.numberOfCompounds, this.numberOfCompounds * this.investmentDuration);
        this.totalInterest = this.futureValue - this.principal;
    }

    public void printRecord() {
        System.out.printf("The future value of the investment is: ₹%.2f\n", this.futureValue);
        System.out.printf("The total interest earned is: ₹%.2f\n", this.totalInterest);
    }

    public static void main(String[] args) {
        Question2 calculator = new Question2();

        calculator.acceptRecord();
        calculator.calculateFutureValue();
        calculator.printRecord();
    }
}
