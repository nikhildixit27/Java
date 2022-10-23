/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Debt {
    private double balance;
    private double intrestRate;

    public Debt(double initialBalance, double initialInsertRate) {
        this.balance = initialBalance;
        this.intrestRate = initialInsertRate;
    }
    
    public void printBalance(){
        System.out.println(this.balance);
    }
    
    public void waitOneYear(){
//        this.balance *=intrestRate;
        this.balance =this.balance*intrestRate;
    }
}
