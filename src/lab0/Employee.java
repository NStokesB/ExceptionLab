package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
    private static final int MIN_NAME_LENGTH = 2;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
         if (daysVacation >= 1 || daysVacation <= MAX_VACATION_DAYS) {
            // String is a magic number, should be a constant!
            throw new IllegalArgumentException("vacationDays is a required field");
        }
               
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        if(firstName == null || firstName.length() <= MIN_NAME_LENGTH) {
            // String is a magic number, should be a constant!
            throw new IllegalArgumentException("firstName must be at least " 
                    + MIN_NAME_LENGTH + " characters");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.length() <= MIN_NAME_LENGTH) {
            // String is a magic number, should be a constant!
            throw new IllegalArgumentException("lastName must be at least " 
                    + MIN_NAME_LENGTH + " characters");
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        //needs validation
        this.ssn = ssn;
    }
    
    
    
}
