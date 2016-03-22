package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
     private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     * 
     * 
     */
    
     public String extractFirstName(String fullName) throws NameValueIncorrectException {
         if (fullName == null || "".equals(fullName)){
            throw new NameValueIncorrectException();
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[FIRST_NAME_IDX];
    }
    
    public String extractLastName(String fullName)  throws NameValueIncorrectException {
        if (fullName == null || "".equals(fullName)){
            throw new NameValueIncorrectException();
        }
        String[] nameParts = fullName.split(" ");
        if (nameParts.length < 2){
            throw new NameValueIncorrectException();
        }
        return nameParts[LAST_NAME_IDX];
    }
    
    
    
    public int getNameLength(String name) throws NameValueIncorrectException {
        if (name == null || "".equals(name)){
            throw new NameValueIncorrectException();
        }
        return name.length();
    }
    
}
