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
public class SpendingPerson extends Person {

    public SpendingPerson(SavingAccount savings, Residence residence, double cash) {
        super(savings, residence, cash);
    }

    @Override
    public void spend(double residenceCost) {
        if((cash-residenceCost)/2 >= 50000){
            savings.deposit(10000);
        }
    }
    
}
