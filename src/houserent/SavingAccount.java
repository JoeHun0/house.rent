/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houserent;

/**
 *
 * @author Diak
 */
public class SavingAccount {

    private double balance;
    private double interestRate;

    public double getBalance() {
        return balance;
    }

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;

    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void PayInterests(){
        balance = balance+(balance*interestRate);
    }

}
