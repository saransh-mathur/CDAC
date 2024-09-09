/*
public class Question4b {
	    public static void main(String[] args) {
	        int bytesUsed = Integer.BYTES;
	        
	        System.out.println("Number of bytes used to represent an int value: " + bytesUsed);
	    }
}
*/
/*
public class Question4c {
	
    public static void main(String[] args) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        
        System.out.println("Minimum value of int: " + minValue);
        System.out.println("Maximum value of int: " + maxValue);
    }
}
*/
/*
public class Question4d {
	
    public static void main(String[] args) {
        int number = 12345; 
        
        String numberAsString = Integer.toString(number);
        
        System.out.println("The String representation of the int value: " + numberAsString);
    }
}
*/
/*
public class Question4e {
    public static void main(String[] args) {
        String strNumber = "12345";  
        
        try {
            int intValue = Integer.parseInt(strNumber);
            
            System.out.println("The int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid integer.");
        }
    }
}
*/
/*
public class Question4f {

    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";  
        
        try {
            int intValue = Integer.parseInt(strNumber);
            
            System.out.println("The int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid integer.");
        }
    }
}
*/
/*
public class Question4g {

    public static void main(String[] args) {
        int number = 42;  // You can set this to any valid int value
        
        Integer numberWrapper = Integer.valueOf(number);
        
        System.out.println("The Integer wrapper object: " + numberWrapper);
    }
}
*/
/*
public class Question4h {
    public static void main(String[] args) {
        String strNumber = "12345";  
        
        try {
            Integer numberWrapper = Integer.valueOf(strNumber);
            
            System.out.println("The Integer wrapper object: " + numberWrapper);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid integer.");
        }
    }
}
*/
/*
public class Question4i {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        int sum = Integer.sum(a, b);
        
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
*/
/*
public class Question4j {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        int minValue = Integer.min(a, b);
        
        int maxValue = Integer.max(a, b);
        
        System.out.println("The minimum of " + a + " and " + b + " is: " + minValue);
        System.out.println("The maximum of " + a + " and " + b + " is: " + maxValue);
    }
}
*/
/*
public class Question4k {
    public static void main(String[] args) {
        int number = 7;
        
        String binaryString = Integer.toBinaryString(number);
        
        String octalString = Integer.toOctalString(number);
        
        String hexString = Integer.toHexString(number);
        
        System.out.println("Binary representation of " + number + " is: " + binaryString);
        System.out.println("Octal representation of " + number + " is: " + octalString);
        System.out.println("Hexadecimal representation of " + number + " is: " + hexString);
    }
}
*/

