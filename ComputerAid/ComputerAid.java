
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * Date: Jan. 28, 2020
 * Description: Main class file for ComputerAid
 */
public class ComputerAid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        //Scanner cin = new Scanner(System.in);
        //SecureRandom randomNums1 = new SecureRandom();
        MultiplicationHelp mp = new MultiplicationHelp();
            mp.showMenu();
            mp.askDifficulty();
            mp.askQuestion();
            for(mp.i=0; mp.i<10; mp.i++){
                mp.runLoop();
            }
            mp.showResult();
        }
    }


