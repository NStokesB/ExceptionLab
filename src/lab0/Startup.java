package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {
      
        try {    
       Employee emp = new Employee(            
             "Jim",
             "Smith",
             "333333333",23);
               
               
             String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
          
            System.out.println(fullNameInCaps);
            
         } catch (IllegalArgumentException e){
             System.out.println("Error");
         }
         
         

        
        // Think about this code. It wouldn't work if lastName was null
        
        
    }

}