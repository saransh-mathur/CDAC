/*
public class Question3b {

	    public static void main(String[] args) {
	        int bytesUsed = Short.BYTES;
	        
	        System.out.println("Number of bytes used to represent a short value: " + bytesUsed);
	    }
	}
*/

/*
public class Question3c {
    public static void main(String[] args) {
        short minValue = Short.MIN_VALUE;
        short maxValue = Short.MAX_VALUE;
        
        System.out.println("Minimum value of short: " + minValue);
        System.out.println("Maximum value of short: " + maxValue);
    }
}
*/

/*
public class Question3d {
    public static void main(String[] args) {
        short number = 12345;  // You can set this to any valid short value
        
        String numberAsString = Short.toString(number);
        
        System.out.println("The String representation of the short value: " + numberAsString);  // Output: 12345
    }
}
*/

/*
public class Question3e {
    public static void main(String[] args) {
        String strNumber = "12345";  // This should be a valid short value in string format
        
        try {
            short shortValue = Short.parseShort(strNumber);
            
            System.out.println("The short value: " + shortValue);  // Output: 12345
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid short value.");
        }
    }
}
*/

/*
public class Question3f {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";  
        
        try {
            short shortValue = Short.parseShort(strNumber);
            
            System.out.println("The short value: " + shortValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid short value.");
        }
    }
}
*/

/*
public class Question3g {
    public static void main(String[] args) {
        short number = 123;  
        
        Short numberWrapper = Short.valueOf(number);
        
        System.out.println("The Short wrapper object: " + numberWrapper);  // Output: 123
    }
}
*/

/*
public class Question3h {
    public static void main(String[] args) {
        String strNumber = "12345"; 
        
        try {
            Short numberWrapper = Short.valueOf(strNumber);
            
            System.out.println("The Short wrapper object: " + numberWrapper);  // Output: 12345
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid short value.");
        }
    }
}
*/





