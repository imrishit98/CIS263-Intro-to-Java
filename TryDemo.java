/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * Date: Jan. 27, 2020
 * Description: Main class file for TryDemo
 */
public class TryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
           for(int index=0; index<6; index++){
               try{
                   System.out.println(nums[index]);
               }
               catch(IndexOutOfBoundsException ex){
                   System.out.println("danger will robinson");
                   System.out.println(ex.getMessage());
               }
           }
    }

}
