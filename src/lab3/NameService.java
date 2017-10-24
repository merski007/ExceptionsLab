package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        String lastName = null;
        
        // put your code here
        String[] lastNameArray = fullName.split(" ");
        if(lastNameArray.length != 2){
            throw new IllegalArgumentException("name format must be 'First Last' name.");
        }
        else if(lastNameArray[1].length() >= 5){
            throw new MaximumLengthException();
        }
        
        lastName = lastNameArray[1];        
        return lastName;
    }
    
}
