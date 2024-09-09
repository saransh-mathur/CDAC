/*
public class Question6b {

	    public static void main(String[] args) {
	        System.out.println("The number of bytes used to represent a float value is: " + Float.BYTES);
	    }
	}

}
*/

/*
public class Question6c {
    public static void main(String[] args) {
        float minValue = Float.MIN_VALUE;
        
        float maxValue = Float.MAX_VALUE;
        
        System.out.println("The minimum positive non-zero value of float is: " + minValue);
        System.out.println("The maximum value of float is: " + maxValue);
    }
}
*/
/*
public class Question6d {
    public static void main(String[] args) {
        float number = 123.45f;  
        
        String floatString = Float.toString(number);
        
        System.out.println("The String representation of the float value " + number + " is: " + floatString);
    }
}
*/
/*
public class Question6e {
    public static void main(String[] args) {
        String strNumber = "456.78";  
        
        try {
            float floatValue = Float.parseFloat(strNumber);
            
            System.out.println("The float value corresponding to the string \"" + strNumber + "\" is: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid float.");
        }
    }
}
*/

/*
public class Question6f {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        
        try {
            float floatValue = Float.parseFloat(strNumber);
            
            System.out.println("The float value corresponding to the string \"" + strNumber + "\" is: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid float.");
        }
    }
}
*/
/*
public class Question6g{
    public static void main(String[] args) {
        float number = 123.45f;  
        
        Float floatObject = Float.valueOf(number);
        
        System.out.println("The Float object corresponding to the float value " + number + " is: " + floatObject);
    }
}
*/
/*
public class Question6h {
    public static void main(String[] args) {
        String strNumber = "456.78";  
        
        try {
            Float floatObject = Float.valueOf(strNumber);
            
            // Print the result
            System.out.println("The Float object corresponding to the string \"" + strNumber + "\" is: " + floatObject);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid float.");
        }
    }
}
*/
/*
public class Question6i {
    public static void main(String[] args) {
        float num1 = 112.3f;
        float num2 = 984.5f;
        
        float sum = Float.sum(num1, num2);
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
*/
/*public class Question6j {
    public static void main(String[] args) {
        float num1 = 112.2f;
        float num2 = 556.6f;
        
        float minValue = Float.min(num1, num2);
        
        float maxValue = Float.max(num1, num2);
        
        System.out.println("The minimum value between " + num1 + " and " + num2 + " is: " + minValue);
        System.out.println("The maximum value between " + num1 + " and " + num2 + " is: " + maxValue);
    }
}
*/
/*
public class Question6k {
    public static void main(String[] args) {
        float number = -25.0f;
        
        double sqrtValue = Math.sqrt((double) number);
        
        System.out.println("The square root of " + number + " is: " + sqrtValue);
    }
}
*/
/*
public class Question6l {
    public static void main(String[] args) {
        float num1 = 0.0f;
        float num2 = 0.0f;
        
        float result = num1 / num2;
        
        System.out.println("The result of dividing " + num1 + " by " + num2 + " is: " + result);
    }
}
*/
