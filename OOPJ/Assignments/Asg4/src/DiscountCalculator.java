
import java.util.Scanner;

public class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price of the item (in ₹): ");
        originalPrice = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountRate = sc.nextDouble();
    }

    public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
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
    	DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.acceptRecord();
        discountCalculator.calculateDiscount();
        discountCalculator.printRecord();
    }
}
