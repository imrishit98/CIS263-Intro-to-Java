/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * @date Jan. 13, 2020
 * Description:
 */
import java.util.Scanner;

public class LargeAndSmallInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int bigNum = 0;
        int smallNum = 0;
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        bigNum = num1;
        smallNum = num1;
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        if(num2 > bigNum){
            bigNum = num2;
        }
        
        if(num2 < smallNum){
            smallNum = num2;
        }
        
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        if(num3 > bigNum){
            bigNum = num3;
        }
        
        if(num3 < smallNum){
            smallNum = num3;
        }
        
        System.out.print("Enter fourth number: ");
        int num4 = input.nextInt();
        if(num4 > bigNum){
            bigNum = num4;
        }
        
        if(num4 < smallNum){
            smallNum = num4;
        }
        
        System.out.print("Enter fifth number: ");
        int num5 = input.nextInt();
        if(num5 > bigNum){
            bigNum = num5;
        }
        
        if(num5 < smallNum){
            smallNum = num5;
        }
        
        System.out.printf("Largest number: %d%n", bigNum);
        System.out.printf("Smallest number: %d%n", smallNum);
    }

}
