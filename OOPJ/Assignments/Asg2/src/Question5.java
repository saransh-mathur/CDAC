/*
public class Question5b {
	    public static void main(String[] args) {
	        int bytes = Long.BYTES;
	        
	        System.out.println("The number of bytes used to represent a long value is: " + bytes);
	    }
}
*/
/*
public class Question5c {
    public static void main(String[] args) {
        // Find the minimum value of a long using Long.MIN_VALUE
        long minValue = Long.MIN_VALUE;
        
        // Find the maximum value of a long using Long.MAX_VALUE
        long maxValue = Long.MAX_VALUE;
        
        // Print the results
        System.out.println("The minimum value of a long is: " + minValue);
        System.out.println("The maximum value of a long is: " + maxValue);
    }
}
*/
/*
public class Question5d {
    public static void main(String[] args) {
        long number = 1234567890L;  
        
        String numberString = Long.toString(number);
        
        System.out.println("The String representation of the long value " + number + " is: " + numberString);
    }
}
*/
/*
public class Question5e {
    public static void main(String[] args) {
        String strNumber = "1234567890";  
        
        try {
            long number = Long.parseLong(strNumber);
            
            // Print the result
            System.out.println("The long value of the string \"" + strNumber + "\" is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid long.");
        }
    }
}
*/
/*
public class Question5g {
    public static void main(String[] args) {
        long number = 123456789L;  // You can set this to any valid long value
        
        Long longObject = Long.valueOf(number);
        
        System.out.println("The Long object corresponding to the long value " + number + " is: " + longObject);
    }
}

*/
/*
public class Question5h {
    public static void main(String[] args) {
        String strNumber = "9876543210";  
        
        try {
            Long longObject = Long.valueOf(strNumber);
            
            System.out.println("The Long object corresponding to the string \"" + strNumber + "\" is: " + longObject);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid long.");
        }
    }
}
*/
/*
public class Question5i {
    public static void main(String[] args) {
        long num1 = 1123;
        long num2 = 9845;
        
        long sum = Long.sum(num1, num2);
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
*/
/*
public class Question5j {
    public static void main(String[] args) {
        long num1 = 1122;
        long num2 = 5566;
        
        long minValue = Long.min(num1, num2);
        
        long maxValue = Long.max(num1, num2);
        
        System.out.println("The minimum value between " + num1 + " and " + num2 + " is: " + minValue);
        System.out.println("The maximum value between " + num1 + " and " + num2 + " is: " + maxValue);
    }
}
*/
/*
public class Question5k {
    public static void main(String[] args) {
        // Declare a long variable with the value 7
        long number = 7;
        
        // Convert the long value to binary string using Long.toBinaryString
        String binaryString = Long.toBinaryString(number);
        
        // Convert the long value to octal string using Long.toOctalString
        String octalString = Long.toOctalString(number);
        
        // Convert the long value to hexadecimal string using Long.toHexString
        String hexString = Long.toHexString(number);
        
        // Print the results
        System.out.println("The binary representation of " + number + " is: " + binaryString);
        System.out.println("The octal representation of " + number + " is: " + octalString);
        System.out.println("The hexadecimal representation of " + number + " is: " + hexString);
    }
}
*/




