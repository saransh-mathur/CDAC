
public class Question8 {

	    public static void main(String[] args) {
	        byte byteValue = 10;
	        short shortValue = 100;
	        int intValue = 1000;
	        long longValue = 10000L;
	        float floatValue = 10.5f;
	        double doubleValue = 20.99;
	        char charValue = 'A';
	        boolean booleanValue = true;
	        
	        System.out.println("Byte toString: " + Byte.toString(byteValue));
	        System.out.println("Short toString: " + Short.toString(shortValue));
	        System.out.println("Integer toString: " + Integer.toString(intValue));
	        System.out.println("Long toString: " + Long.toString(longValue));
	        System.out.println("Float toString: " + Float.toString(floatValue));
	        System.out.println("Double toString: " + Double.toString(doubleValue));
	        System.out.println("Character toString: " + Character.toString(charValue));
	        System.out.println("Boolean toString: " + Boolean.toString(booleanValue));
	        
	        System.out.println("Byte valueOf: " + String.valueOf(byteValue));
	        System.out.println("Short valueOf: " + String.valueOf(shortValue));
	        System.out.println("Integer valueOf: " + String.valueOf(intValue));
	        System.out.println("Long valueOf: " + String.valueOf(longValue));
	        System.out.println("Float valueOf: " + String.valueOf(floatValue));
	        System.out.println("Double valueOf: " + String.valueOf(doubleValue));
	        System.out.println("Character valueOf: " + String.valueOf(charValue));
	        System.out.println("Boolean valueOf: " + String.valueOf(booleanValue));
	    }

}
