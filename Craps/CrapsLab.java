/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * Date: Feb. 3, 2020
 * Description: Main class file for CrapsLab
 */
// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.
import java.security.SecureRandom;
import static java.util.Arrays.deepToString;

public class CrapsLab {
   // create secure random number generator for use in method rollDice
   private static final SecureRandom randomNumbers = new SecureRandom();

   // enum type with constants that represent the game status
   private enum Status {
       CONTINUE, WON, LOST
   }; 
   
   private static final int LOST = 0;
   private static final int WON = 1;
   private static final int GAMES = 100000;
   
   
   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;      
   private static final int SEVEN = 7;     
   private static final int YO_LEVEN = 11; 
   private static final int BOX_CARS = 12; 
   private static int results[][] = new int [2][22];
   
   private static int winsCount, loseCount;

   // plays one game of craps
   public static void main(String[] args) {
      for(int i=0; i < GAMES; i++){
      int rollCounter = 1;
      
      int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus; // can contain CONTINUE, WON or LOST

      int sumOfDice = rollDice(); // first roll of the dice

      // determine game status and point based on first roll 
      switch (sumOfDice) {
         case SEVEN: // win with 7 on first roll    
         case YO_LEVEN: // win with 11 on first roll
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // lose with 2 on first roll
         case TREY: // lose with 3 on first roll      
         case BOX_CARS: // lose with 12 on first roll 
            gameStatus = Status.LOST;
            break;
         default: // did not win or lose, so remember point  
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice; // remember the point       
            //System.out.printf("Point is %d%n", myPoint);
            break; 
      }

      // while game is not complete
      while (gameStatus == Status.CONTINUE) {// not WON or LOST
         rollCounter++;
         sumOfDice = rollDice(); // roll dice again

         // determine game status
         if (sumOfDice == myPoint) { // win by making point
            gameStatus = Status.WON;
         } 
         else { 
            if (sumOfDice == SEVEN) { // lose by rolling 7 before point
               gameStatus = Status.LOST;
            } 
         } 
      } 
      
      // display won or lost message
//      if (gameStatus == Status.WON) {
//         System.out.println("Player wins");
//         
//      } 
//      else {
//         System.out.println("Player loses");
//      }
      recordResult(rollCounter, gameStatus, results);
      } 
       showResults();
   } 

   // roll dice, calculate sum and display results
   public static int rollDice() {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      // display results of this roll
      //System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

      return sum; 
   }
   
   /**
    * Record in the results array
    * @param rollNum
    * @param result 
    */
   static void recordResult(int rollNum, Status result, int[][] outcomes) {
       if(rollNum > 21){
           rollNum = 21;
       }
       if(result == Status.WON){
           outcomes[WON][rollNum]++;
           winsCount++;
       }
       else{
          outcomes[LOST][rollNum]++;
          loseCount++;
       }
   }
   
   static void showResults(){
       //System.out.println(deepToString(results));
       System.out.println("Roll          WON          LOST");
       for(int counter = 1; counter < results[WON].length; counter++){
           System.out.printf( "%02d       %8d      %8d%n" ,
                   counter, results[WON][counter], results[LOST][counter]);
       }
       System.out.println("-----------------------------------------");
       System.out.println("        WON:" + winsCount + "    LOST:" + loseCount);
       System.out.println("Win Percentage: " + (double)winsCount / GAMES * 100 + "%");
   }
} 

