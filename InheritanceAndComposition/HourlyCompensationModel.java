/**
 * @author Rishit Patel
 * Date: Mar. 17, 2020
 * Description: HourlyCompensationModel class
 */
public abstract class HourlyCompensationModel implements CompensationModel {
    private double wage; // wage per hour
    private double hours; // hours worked for week
    
    @Override
    public String toString() {
        return String.format("HourlyCompensationModel");
    }
    
    public double earnings() {                                          
      if (hours <= 40) { // no overtime                           
         return wage * hours;                                
      }                                                                
      else {                                                           
         return 40 * wage + (hours - 40) * wage * 1.5;  
      }                                                                
   }
}
