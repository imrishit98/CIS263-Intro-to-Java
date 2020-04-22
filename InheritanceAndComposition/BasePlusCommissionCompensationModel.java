/**
 * @author Rishit Patel
 * Date: Mar. 16, 2020
 * Description: BasePlusCommissionCompensationModel class
 */
public class BasePlusCommissionCompensationModel implements CompensationModel{
    
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage
   private double baseSalary; // base salary per week
   
   /**
    * earnings method that return baseSalary + grossSales * commissionRate
    * @return baseSalary + grossSales * commissionRate
    */
   public double earnings(){
       return baseSalary + grossSales * commissionRate;
   }

}
