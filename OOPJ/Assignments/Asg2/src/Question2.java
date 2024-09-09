/*
public class Question2b {
	    public static void main(String[] args) {
	        int bytesUsed = Byte.BYTES;
	        
	        System.out.println("Number of bytes used to represent a byte value: " + bytesUsed);
	    }
	}
*/

/*
public class Question2c {
    public static void main(String[] args) {
        int bytesUsed = Byte.BYTES;
        
        System.out.println("Number of bytes used to represent a byte value: " + bytesUsed);
    }
}
*/

/*
public class Question2d {
    public static void main(String[] args) {
        byte number = 123;  
        
        String numberString = Byte.toString(number);
        
        System.out.println("The byte value as a String: " + numberString);  // Output: "123"
    }
}
*/

/*
public class Question2e {
    public static void main(String[] args) {
        String strNumber = "127"; 
        
        byte byteValue = Byte.parseByte(strNumber);
        
        System.out.println("The String value as a byte: " + byteValue);  // Output: 127
    }
}
*/

/*
public class Question2f {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        
        try {
            byte byteValue = Byte.parseByte(strNumber);
            
            System.out.println("The String value as a byte: " + byteValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid byte value.");
        }
    }
}
*/

/*
public class Question2g {
    public static void main(String[] args) {
        byte number = 10; 
        
        Byte numberWrapper = Byte.valueOf(number);
        
        System.out.println("The Byte wrapper object: " + numberWrapper);  // Output: 10
    }
}
*/

/*
public class Question2h {
    public static void main(String[] args) {
        String strNumber = "300";  // This value is out of the valid byte range
        
        try {
            Byte numberWrapper = Byte.valueOf(strNumber);
            System.out.println("The Byte wrapper object: " + numberWrapper);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid byte value.");
        }
    }
}

*/


