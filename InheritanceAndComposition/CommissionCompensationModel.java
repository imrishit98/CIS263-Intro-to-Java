/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * Date: Mar. 16, 2020
 * Description: CommissionCompensationModel class
 */
public class CommissionCompensationModel  implements CompensationModel{
    
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage
   
   
  /**
   * earnings method that return grossSales * commissionRate
   * @return grossSales * commissionRate
   */
   public double earnings(){
       return grossSales * commissionRate;
   }

}
