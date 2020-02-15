/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Rishit Patel
 * @date Jan. 13, 2020
 * Description: A simple Bank Account type class
 */
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    
    public void deposit(double amount){
        if(amount > 0.0){
            balance += amount;
        }
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
