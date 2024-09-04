import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your weight(kg):");
        double w = s.nextDouble();
        System.out.printf("\n%s", "Enter you height(cm):");
        double h = s.nextDouble();
        h = h / 100;

        double BMI = w / (h * h);

        String b;

        if (BMI < 18.5) {
            System.out.println("less than 18.5");
            b = "Underweight";
        } else if ((BMI) >= 18.5 || (BMI) <= 24.9) {
            System.out.println("between 18.5 and 24.9");
            b = "Normal";
        } else if (BMI >= 25 || BMI <= 29.9) {
            System.out.println("between 25 and 29.9");
            b = "Overweight";
        } else {
            System.out.println("greater than 30");
            b = "Obese";
        }

        System.out.println("Your BMI is:" + BMI + "(" + b + ")");

    }

}