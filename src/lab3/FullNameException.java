package lab3;

/**
 *
 * @author mjmersenski
 */
public class FullNameException extends IllegalArgumentException {
    //make this a subclass of an existing class by extending class, see above
    
    //insert all the constructors from superclass
    //right click and select 'insert code', select constructor and select all methods
    
    private static String errMsg = "Please provide a first name and a last name.";
    
    public FullNameException() {
        super(errMsg);
    }

    public FullNameException(String s) {
        super(errMsg);
    }

    public FullNameException(String message, Throwable cause) {
        super(errMsg, cause);
    }

    public FullNameException(Throwable cause) {
        super(errMsg, cause);
    }

}
