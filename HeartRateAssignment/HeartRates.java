import java.time.*;
/**
 * @author Rishit Patel
 * Date: Jan. 20, 2020
 * Description: HeartRates class
 */
/**
 * HeartRates class which includes person’s first name, last name and 
 * date of birth. It also includes necessary functions and methods for program.
 * @author Rishit Patel
 */
public class HeartRates {
    private String firstName;
    private String lastName;
    private int dayOfDOB;
    private int monthOfDOB;
    private int yearOfDOB;
    private int age;
    private int maxHR;
    private double targetMinHR;
    private double targetMaxHR;

    /**
     * get method
     * @return person's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set method
     * @param firstName person's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get method
     * @return person's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set method
     * @param lastName person's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * get method
     * @return day of date of birth
     */
    public int getDayOfDOB() {
        return dayOfDOB;
    }
    
    /**
     * set method
     * @param dayOfDOB day of date of birth
     */
    public void setDayOfDOB(int dayOfDOB) {
        this.dayOfDOB = dayOfDOB;
    }

    /**
     * get method
     * @return month of date of birth
     */
    public int getMonthOfDOB() {
        return monthOfDOB;
    }

    /**
     * set method
     * @param monthOfDOB month of date of birth
     */
    public void setMonthOfDOB(int monthOfDOB) {
        this.monthOfDOB = monthOfDOB;
    }

    /**
     * get method
     * @return year of date of birth
     */
    public int getYearOfDOB() {
        return yearOfDOB;
    }

    /**
     * set method
     * @param yearOfDOB year of date of birth
     */
    public void setYearOfDOB(int yearOfDOB) {
        this.yearOfDOB = yearOfDOB;
    }

    /**
     * get method
     * @return person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * set method
     * @param age person's age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get method
     * @return person's maximum heart rate
     */
    public int getMaxHR() {
        return maxHR;
    }

    /**
     * set method
     * @param maxHR person's maximum heart rate
     */
    public void setMaxHR(int maxHR) {
        this.maxHR = maxHR;
    }

    /**
     * get method
     * @return person's minimum target heart rates
     */
    public double getTargetMinHR() {
        return targetMinHR;
    }

    /**
     * set method
     * @param targetMinHR person's minimum target heart rates
     */
    public void setTargetMinHR(double targetMinHR) {
        this.targetMinHR = targetMinHR;
    }

    /**
     * get method
     * @return person's maximum target heart rates
     */
    public double getTargetMaxHR() {
        return targetMaxHR;
    }

    /**
     * set method
     * @param targetMaxHR person's maximum target heart rates
     */
    public void setTargetMaxHR(double targetMaxHR) {
        this.targetMaxHR = targetMaxHR;
    }
    
    /**
     * constructor that assigns person’s first name, last name and date of birth
     * @param fn person’s first name
     * @param ln person’s last name
     * @param mon month of date of birth
     * @param day day of date of birth
     * @param year year of date of birth
     */
    public HeartRates(String fn, String ln, int mon, int day, int year){
        firstName = fn;
        lastName = ln;
        monthOfDOB = mon;
        dayOfDOB = day;
        yearOfDOB = year;
    }
    
    /**
     * method that calculates and returns the person’s age
     * @return person's age
     */
    public int calcAge(){
        age = 0;
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(yearOfDOB, Month.of(monthOfDOB),
                dayOfDOB);
        Period p = Period.between(birthday, today);
        age = p.getYears();
        return age;
    }
    /**
     * method that calculates and returns the person’s maximum heart rate
     * @return person’s maximum heart rate
     */
    public int maxHeartRates(){
        maxHR = 220 - age;
        return maxHR;
    }
    /**
     * method that calculates and returns the person’s minimum target heart rate
     * @return person’s minimum target heart rate
     */
    public double minTargetHR(){
        targetMinHR = maxHR * 0.50;
        return targetMinHR;
    }
    /**
     * method that calculates and returns the person’s maximum target heart rate
     * @return person’s maximum target heart rate
     */
    public double maxTargetHR(){
        targetMaxHR = maxHR * 0.85;
        return targetMaxHR;
    }
}
