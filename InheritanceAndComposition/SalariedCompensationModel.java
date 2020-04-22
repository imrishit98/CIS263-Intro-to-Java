/**
 * @author Rishit Patel
 * Date: Mar. 17, 2020
 * Description: SalariedCompensationModel class
 */
public class SalariedCompensationModel implements CompensationModel {
    private double weeklySalary;

    public SalariedCompensationModel(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("SalariedCompensationModel");
    }
    
    
    
    public double earnings(){
        return weeklySalary;
    }
}
