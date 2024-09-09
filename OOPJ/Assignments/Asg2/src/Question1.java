/*
public class Question1b {

    public static void main(String[] args) {
        boolean status = true;
        
        String statusString = Boolean.toString(status);
        
        System.out.println(statusString);  // Output: "true"
    }
}
*/

/*
public class Question1c {
    public static void main(String[] args) {
        String strStatus = "true";

        boolean status = Boolean.parseBoolean(strStatus);
  
        System.out.println(status);  // Output: true
    }
}
*/

/*
public class Question1d {
    public static void main(String[] args) {
        String strStatus = "1";  // You can also use "0" to test the other case

        boolean status;
        if ("1".equals(strStatus)) {
            status = true;
        } else if ("0".equals(strStatus)) {
            status = false;
        } else {
            throw new IllegalArgumentException("Invalid string value for boolean conversion: " + strStatus);
        }
        System.out.println(status);  // Output will be true for "1" and false for "0"
    }
}
*/

/*
public class Question1e {
    public static void main(String[] args) {
        boolean status = true;
        
        Boolean statusWrapper = Boolean.valueOf(status);
        
        System.out.println(statusWrapper);  // Output: true
    }
}
*/

/*
public class Question1f {
    public static void main(String[] args) {
        String strStatus = "true";
        
        Boolean statusWrapper = Boolean.valueOf(strStatus);
        
        System.out.println(statusWrapper);  // Output: true
    }
}
*/

/*
 
 */


