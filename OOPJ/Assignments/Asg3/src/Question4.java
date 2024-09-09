import java.util.Scanner;

public class Question4 {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original price of the item (in ₹): ");
        originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountRate = scanner.nextDouble();
    }

    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    public void printRecord() {
        System.out.printf("Discount Amount: ₹%.2f%n", discountAmount);
        System.out.printf("Final Price: ₹%.2f%n", finalPrice);
    }

    public static void main(String[] args) {
        Question4 discountCalculator = new Question4();
        discountCalculator.acceptRecord();
        discountCalculator.calculateDiscount();
        discountCalculator.printRecord();
    }
}
