
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * Date: Feb. 3, 2020
 * Description: Main class file for WorkingWithArrays
 */
public class WorkingWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int one[] = {1,2,3};
        int two[] = {1,2,3};
//      int three[] = {4,5,6};
        int four[];
        
        System.out.println("one == two: " + (one == two));
        System.out.println("Arrays.equals(one,two): " + Arrays.equals(one,two));
        four = one;
        System.out.println("one == four: " + (one == four));
        System.out.println("Arrays.equals(one,four): " + Arrays.equals(one,four));
    }

}
