
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 Date: Jan. 29, 2020
 Description: Main class file for Week4Arrays
 */
public class Week4Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char nums[] = {'1','/','*','j', 'h', '9'};
        
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        //testing cli arguments
        for(String s : args){
            System.out.println(s);
        }
        
    }

}
