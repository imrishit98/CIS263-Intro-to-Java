/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * @date Jan. 15, 2020
 * Description:
 */
import java.util.Scanner;
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Account firstAccount = new Account("Rishit Patel", 50.22);
        Account secondAccount = new Account("Bill Gates", -522.2);
        
        System.out.printf("The first account name is %s and the balance "
                + "is %.2f%n", firstAccount.getName(), 
                firstAccount.getBalance());
        System.out.printf("The second account name is %s and the balance "
                + "is %.2f%n", secondAccount.getName(), 
                secondAccount.getBalance());
        
        System.out.print("Enter a deposit amount: ");
        double depositAmount = cin.nextDouble();
        firstAccount.deposit(depositAmount);
        
        System.out.print("Enter a deposit amount: ");
        depositAmount = cin.nextDouble();
        secondAccount.deposit(depositAmount);
        
        System.out.printf("The first account name is %s and the balance "
                + "is %.2f%n", firstAccount.getName(), 
                firstAccount.getBalance());
        System.out.printf("The second account name is %s and the balance "
                + "is %.2f%n", secondAccount.getName(), 
                secondAccount.getBalance());
        
        System.out.println("Please enter your name: ");
        cin.skip("\n");
        String name = cin.nextLine();
        
        firstAccount.setName(name);
        System.out.printf("The account name is %s%n", firstAccount.getName());
    }
}
