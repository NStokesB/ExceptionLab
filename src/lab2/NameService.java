package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
     private static final int FIRST_NAME_IDX = 0;
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        if (fullName.isEmpty() || fullName == null) {
            throw new IllegalArgumentException("Your full name cannot be empty.");
        }
        String[] nameParts = fullName.split(" ");
        if (nameParts.length > 2 || nameParts.length < 2) {
            throw new IllegalArgumentException("Incorrect Format, First name Last name");
        }
       

        return nameParts[nameParts.length - 1];
    }

     public String extractFirstName(String fullName) throws IllegalArgumentException {
         if (fullName.isEmpty() || fullName == null){
            throw new IllegalArgumentException();
        }         
        String[] nameParts = fullName.split(" ");
        if (nameParts.length > 2 || nameParts.length < 2){
            throw new IllegalArgumentException();
        } 
        return nameParts[FIRST_NAME_IDX];
    }
    }

