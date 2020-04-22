
/**
 * @author Rishit Patel
 Date: Mar. 16, 2020
 Description: Main class file for InheritanceAndComposition
 */
public class InheritanceAndComposition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //started with code from deitel book 
        // create four-element Payable array
        CompensationModel cp = new SalariedCompensationModel(800.0);
      Payable[] payableObjects = new Payable[] {
         new Invoice("01234", "seat", 2, 375.00),
         new Invoice("56789", "tire", 4, 79.95),
         new Employee("John", "Smith", "111-11-1111", cp)
      };

      System.out.println(
         "Invoices and Employees processed polymorphically:"); 

      // generically process each element in array payableObjects
      for (Payable currentPayable : payableObjects) {
         // output currentPayable and its appropriate payment amount
         System.out.printf("%n%s %npayment due: $%,.2f%n", 
            currentPayable.toString(), // could invoke implicitly
            currentPayable.getPaymentAmount()); 
      } 
    }

}
