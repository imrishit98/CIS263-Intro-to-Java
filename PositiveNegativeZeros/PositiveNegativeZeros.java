/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * @date Jan. 13, 2020
 * Description: Find positive,negative, and zeros.
 */
import java.util.Scanner;
public class PositiveNegativeZeros {

    /**
     * a program that prompts for five numbers and determines and prints 
     * the number of negative numbers input, the number of positive numbers 
     * input and the number of zeros input.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positives = 0,negatives = 0,zeros = 0;
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        if(num1 > 0){
            positives++;
        }
        if(num1 < 0){
            negatives++;
        }
        if(num1 == 0){
            zeros++;
        }
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        if(num2 > 0){
            positives++;
        }
        if(num2 < 0){
            negatives++;
        }
        if(num2 == 0){
            zeros++;
        }
        
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();
        if(num3 > 0){
            positives++;
        }
        if(num3 < 0){
            negatives++;
        }
        if(num3 == 0){
            zeros++;
        }
        
        System.out.print("Enter fourth number: ");
        double num4 = input.nextDouble();
        if(num4 > 0){
            positives++;
        }
        if(num4 < 0){
            negatives++;
        }
        if(num4 == 0){
            zeros++;
        }
        
        System.out.print("Enter fifth number: ");
        double num5 = input.nextDouble();
        if(num5 > 0){
            positives++;
        }
        if(num5 < 0){
            negatives++;
        }
        if(num5 == 0){
            zeros++;
        }
        
        System.out.printf("Total positive numbers: %d%n", positives);
        System.out.printf("Total negative numbers: %d%n", negatives);
        System.out.printf("Total zeros: %d%n", zeros);
        
    }

}
