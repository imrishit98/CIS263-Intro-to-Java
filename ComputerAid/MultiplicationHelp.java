
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * Date: Jan. 28, 2020
 * Description: MultiplicationHelp class
 */
public class MultiplicationHelp {
    private static final SecureRandom randomNums = new SecureRandom();
    Scanner cin = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("0.#");
    
    private double ranNum1, ranNum2, rightAns, userAns;
    private int ranNumRight, ranNumWrong, ranChoice;
    private int rightCount = 0, menuChoice;
    private short difficulty = 0;
    public int i;
    
    /**
     * showMenu() function to show menu
     */
    public void showMenu(){
        System.out.println("** Computer-Assisted Instruction **\n");
        System.out.println("Please choose an option:\n");
        System.out.println("1.Addition problems only\n");
        System.out.println("2.Subtraction problems only\n");
        System.out.println("3.Multiplication problems only\n");
        System.out.println("4.Division problems only\n");
        System.out.println("5.Random mixture of all these types");
        menuChoice = cin.nextInt();
    }
    /**
     * askDifficulty() function to ask for difficulty
     */
    public void askDifficulty(){
        System.out.println("Please choose difficulty level between 1 and 5:");
        difficulty = cin.nextShort();
    }
    /**
     * generateNums() function to generate random numbers according to difficulty
     */
    public void generateNums(){
        if(difficulty == 1){
            ranNum1 = 1 + randomNums.nextInt(9);
            ranNum2 = 1 + randomNums.nextInt(9);
            if(menuChoice == 4 && ranNum1 < ranNum2){
                double temp;
                temp = ranNum1;
                ranNum1 = ranNum2;
                ranNum2 = temp;
            }
        }
        else if(difficulty == 2){
            ranNum1 = 1 + randomNums.nextInt(20);
            ranNum2 = 1 + randomNums.nextInt(9);
        }
        else if(difficulty == 3){
            ranNum1 = 10 + randomNums.nextInt(30);
            ranNum2 = 10 + randomNums.nextInt(20);
        }
        else if(difficulty == 4){
            ranNum1 = 20 + randomNums.nextInt(50);
            ranNum2 = 10 + randomNums.nextInt(50);
        }
        else if(difficulty == 5){
            ranNum1 = 20 + randomNums.nextInt(80);
            ranNum2 = 10 + randomNums.nextInt(90);
        }
    }
    /**
     * askQuestion() function to ask questions
     */
    public void askQuestion(){
        generateNums();
        if(menuChoice == 5){
            ranChoice = 1;
        }
        if(ranChoice == 1){
            menuChoice = 1 + randomNums.nextInt(4);
        }
        switch (menuChoice) {
            case 1:
                System.out.println("How much is " + format.format(ranNum1) + 
                        " plus " + format.format(ranNum2) + "?");
                break;
            case 2:
                System.out.println("How much is " + format.format(ranNum1) +
                        " minus " + format.format(ranNum2) + "?");
                break;
            case 3:
                System.out.println("How much is " + format.format(ranNum1) +
                        " times " + format.format(ranNum2) + "?");
                break;
            case 4:
                System.out.println("How much is " + format.format(ranNum1) +
                        " divided by " + format.format(ranNum2) + "?");
                break;
        }
    }
    /**
     * rightAns() function to calculate right answer
     */
    public void rightAns(){
        switch (menuChoice) {
            case 1:
                rightAns = ranNum1 + ranNum2;
                Math.round(rightAns);
                break;
            case 2:
                rightAns = ranNum1 - ranNum2;
                Math.round(rightAns);
                break;
            case 3:
                rightAns = ranNum1 * ranNum2;
                Math.round(rightAns);
                break;
            case 4:
                rightAns = ranNum1 / ranNum2;
                rightAns = Math.round(rightAns * 100.0) / 100.0;
                break;
        }
    }
    /**
     * runLoop() function that runs 10 times in main method
     */
    public void runLoop(){
        rightAns();
        userAns = cin.nextDouble();
            if(userAns != rightAns){
                showWrongMsg();  
            }
            else if(userAns == rightAns){
                showRightMsg();
                if(i < 9){
                  askQuestion();  
                }
            }
    } 
    
    /**
     * showRightMsg() function that prints random message for every right answer
     */
    public void showRightMsg(){
        ranNumRight = 1 + randomNums.nextInt(4);
        rightCount++;
            switch(ranNumRight){
                case 1:
                System.out.println("Very good!");
                break;
                case 2:
                System.out.println("Excellent!"); 
                break;
                case 3:
                System.out.println("Nice work!");
                break;
                case 4:
                System.out.println("Keep up the good work!");
                break;
    }
    }
    
    /**
     * showWrongMsg() function that prints random message for every wrong answer
     */
    public void showWrongMsg(){
        ranNumWrong = 1 + randomNums.nextInt(4);
            switch(ranNumWrong){
                case 1:
                System.out.println("No. Please try again.");
                break;
                case 2:
                System.out.println("Wrong. Try once more."); 
                break;
                case 3:
                System.out.println("Don’t give up!");
                break;
                case 4:
                System.out.println("No. Keep trying.");
                break;
            }
    }
    
    /**
     * showResult() function to show message after 10 questions answered
     */
    public void showResult(){
            if(((100 * rightCount) / 10) < 75){
               System.out.println("Please ask your teacher for extra help.\n");
            }
            else{
               System.out.println("Congratulations, you are ready to go to"
                       + " the next level!\n"); 
            }
    }
}
