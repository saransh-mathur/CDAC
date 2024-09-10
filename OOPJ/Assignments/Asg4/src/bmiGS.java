	import java.util.Scanner;

	public class bmiGS {
	    private double weight;
	    private double height;
	    private double bmi;
	    private String category;

	    public void acceptRecord() {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter weight (in kilograms): ");
				weight = sc.nextDouble();
				System.out.print("Enter height (in meters): ");
				height = sc.nextDouble();
			}
	    }

	    public void calculateBMI() {
	        if (height > 0) {
	            bmi = weight / (height * height);
	        } else {
	            System.out.println("Height must be greater than 0.");
	            bmi = 0;
	        }
	    }

	    public void classifyBMI() {
	        if (bmi < 18.5) {
	            category = "Underweight";
	        } else if (bmi < 24.9) {
	            category = "Normal weight";
	        } else if (bmi < 29.9) {
	            category = "Overweight";
	        } else {
	            category = "Obese";
	        }
	    }

	    public void printRecord() {
	        System.out.printf("BMI: %.2f%n", bmi);
	        System.out.println("Category: " + category);
	    }

	    public static void main(String[] args) {
	        bmiGS bmiTracker = new bmiGS();
	        bmiTracker.acceptRecord();
	        bmiTracker.calculateBMI();
	        bmiTracker.classifyBMI();
	        bmiTracker.printRecord();
	    }
	}
