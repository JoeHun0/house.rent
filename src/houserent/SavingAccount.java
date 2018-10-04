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

    private int balance;

    public int getBalance() {
        return balance;
    }
    private double interestRate;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;

    }

    public void deposit(int amount) {
        balance += amount;
    }

}
