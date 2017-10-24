package lab3;

/**
 *
 * @author mjmersenski
 */
public class MaximumLengthException extends IllegalArgumentException {
    //make this a subclass of an existing class by extending class, see above
    
    //insert all the constructors from superclass
    //right click and select 'insert code', select constructor and select all methods
    
    private static String errMsg = "Sorry the length of the argument is too long.";
    
    public MaximumLengthException() {
        super(errMsg);
    }

    public MaximumLengthException(String s) {
        super(errMsg);
    }

    public MaximumLengthException(String message, Throwable cause) {
        super(errMsg, cause);
    }

    public MaximumLengthException(Throwable cause) {
        super(errMsg, cause);
    }

}
