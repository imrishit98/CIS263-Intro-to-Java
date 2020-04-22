/**
 * @author Rishit Patel
 * Date: Mar. 16, 2020
 * Description: Employee class
 */
public class Employee implements Payable {
    private final String firstName;                        
    private final String lastName;                         
    private final String socialSecurityNumber;
    private CompensationModel model;
    
    public Employee(String firstName, String lastName, 
      String socialSecurityNumber,CompensationModel model) {      

      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.model = model;
   }
    /**
     * toString method for Employee class
     * @return firstName,lastName,socialSecurityNumber
     */
    @Override
    public String toString() {
        return String.format( "%s%nEmployee Name: %s %s%nEmployee SIN: %s",
                model.toString(),firstName,lastName,socialSecurityNumber);
    }
    
    /**
     * getPaymentAmount method that returns earnings() from CompensationModel
     * @return model.earnings()
     */
    public double getPaymentAmount(){
        return model.earnings();
    }
}
