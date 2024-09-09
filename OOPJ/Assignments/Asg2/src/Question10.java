
public class Question10 {

	    public static void main(String[] args) 
	    {
	        if (args.length != 3) {
	            System.out.println("Usage: java CommandLineCalculator <num1> <operator> <num2>");
	            return;
	        }

	        try {
	            int num1 = Integer.parseInt(args[0]);
	            int num2 = Integer.parseInt(args[2]);
	            String operator = args[1];

	            double result;
	            switch (operator) {
	                case "+":
	                    result = num1 + num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case "-":
	                    result = num1 - num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case "*":
	                    result = num1 * num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case "/":
	                    if (num2 == 0) {
	                        System.out.println("Error: Division by zero is not allowed.");
	                    } else {
	                        result = (double) num1 / num2;
	                        System.out.println("Result: " + result);
	                    }
	                    break;
	                default:
	                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
	                    break;
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Please provide valid integers for num1 and num2.");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        }
	 }

}
