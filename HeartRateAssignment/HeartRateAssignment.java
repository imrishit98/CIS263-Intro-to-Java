import java.util.Scanner;
/**
 * @author Rishit Patel
 * Date: Jan. 20, 2020
 * Description: main class for Heart Rate assignment
 */
/**
 * HeartRateAssignment class that prompts for the person’s information, 
 * instantiates an object of class HeartRates and prints the information 
 * from that object including the person’s first name, last name and 
 * date of birth then calculates and prints the person’s age in (years), 
 * maximum heart rate and target-heart-rate range
 * @author Rishit Patel
 */
public class HeartRateAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int monDOB,dayDOB,yearDOB;
        String fn,ln;
        Scanner cin = new Scanner(System.in);
        String line;
        String[] lineArray;
        System.out.println("Please enter your first name: ");
        fn = cin.nextLine();
        System.out.println("Please enter your last name: ");
        ln = cin.nextLine();
        /**
         * It asks for person's birth date in MM-DD-YYYY format as String 
         * and then splits the values with "-" and coverts it into integers.
         */
        System.out.println("Please enter your Date Of Birth(MM-DD-YYYY): ");
        line = cin.nextLine();
        lineArray = line.split("-");
        monDOB =Integer.parseInt(lineArray[0]);
        dayDOB =Integer.parseInt(lineArray[1]);
        yearDOB =Integer.parseInt(lineArray[2]);
        HeartRates test = new HeartRates(fn, ln, monDOB, dayDOB, yearDOB);
        System.out.println(test.getFirstName() + " " + test.getLastName() + 
                " You're " + test.calcAge() + " years old.");
        System.out.println("Your maximum heart rate in beats per minute is: " +
                test.maxHeartRates() + "\nYour target heart rate range"
                        + " is between " + test.minTargetHR() + 
                " and " + test.maxTargetHR());
    }

}
