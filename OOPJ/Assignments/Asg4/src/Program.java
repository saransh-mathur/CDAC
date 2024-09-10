import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        while (true) {
            LoanAmortizationCalculatorutil.menuList();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
            if (choice == 1) {
                LoanAmortizationCalculator calculator = LoanAmortizationCalculatorutil.acceptRecord();
                LoanAmortizationCalculatorutil.printRecord(calculator);
            } else if (choice == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
