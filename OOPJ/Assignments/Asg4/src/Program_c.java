import java.util.Scanner;

public class Program_c {
    public static void main(String[] args) {
        while (true) {
            CompoundInterestCalculatorUtil.menuList();
            try (Scanner sc = new Scanner(System.in)) {
				int choice = sc.nextInt();
				
				if (choice == 1) {
				    CompoundInterestCalculator calculator = CompoundInterestCalculatorUtil.acceptRecord();
				    CompoundInterestCalculatorUtil.printRecord(calculator);
				} else if (choice == 2) {
				    System.out.println("Exiting...");
				    break;
				} else {
				    System.out.println("Invalid choice. Please enter a valid option.");
				}
			}
        }
    }
}
