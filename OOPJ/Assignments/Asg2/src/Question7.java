/*
public class Question7b {

	    public static void main(String[] args) {
	        int bytes = Double.BYTES;
	        
	        System.out.println("The number of bytes used to represent a double value is: " + bytes);
	    }

}
*/
/*
public class Question7c {
    public static void main(String[] args) {
        double minValue = Double.MIN_VALUE;
        
        double maxValue = Double.MAX_VALUE;
        
        System.out.println("The minimum value of a double is: " + minValue);
        System.out.println("The maximum value of a double is: " + maxValue);
    }
}
*/
/*
public class Question7d {
    public static void main(String[] args) {
        double number = 123.456;
        
        String strNumber = Double.toString(number);
        
        System.out.println("The string representation of the double value is: " + strNumber);
    }
}
*/
/*
public class Question7e {
    public static void main(String[] args) {
        String strNumber = "123.456";
        
        double number = Double.parseDouble(strNumber);
        
        System.out.println("The double value is: " + number);
    }
}
*/
/*
public class Question7rf {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        
        try
        {
            double number = Double.parseDouble(strNumber);
            
            System.out.println("The double value is: " + number);
        } catch (NumberFormatException e) 
        {
            System.out.println("Error: The String \"" + strNumber + "\" is not a valid double value.");
        }
    }
}
*/
/*
public class Question7g {
    public static void main(String[] args) {
        double number = 123.456;
        
        Double wrapperNumber = Double.valueOf(number);
        
        System.out.println("The Double object is: " + wrapperNumber);
    }
}
*/
/*
public class Question7h {
    public static void main(String[] args) {
        String strNumber = "456.789";
        
        Double wrapperNumber = Double.valueOf(strNumber);
        
        System.out.println("The Double object is: " + wrapperNumber);
    }
}
*/
/*
public class Question7i {
    public static void main(String[] args) {
        double num1 = 112.3;
        double num2 = 984.5;
        
        double sum = Double.sum(num1, num2);
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
*/
/*
public class Question7j {
    public static void main(String[] args) {
        double num1 = 112.2;
        double num2 = 556.6;
        
        double minValue = Double.min(num1, num2);
        
        double maxValue = Double.max(num1, num2);
        
        System.out.println("The minimum value between " + num1 + " and " + num2 + " is: " + minValue);
        System.out.println("The maximum value between " + num1 + " and " + num2 + " is: " + maxValue);
    }
}
*/
/*
public class Question7k {
    public static void main(String[] args) {
        double number = -25.0;
        
        double result = Math.sqrt(number);
        
        System.out.println("The square root of " + number + " is: " + result);
    }
}
*/
/*
public class Question7l{
    public static void main(String[] args) {
        double num1 = 0.0;
        double num2 = 0.0;
        
        double result = num1 / num2;
        
        System.out.println("The result of dividing " + num1 + " by " + num2 + " is: " + result);
    }
}
*/
