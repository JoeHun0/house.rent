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
public class OwnedResidence implements Residence {

    private double totalValue;
    private double loan;

    public OwnedResidence(double totalValue, double loan) {
        if (loan <= 0) {
            this.loan = loan;
        }//else{
            //throw new exception("Nem jó ötlet");
       // }
        this.totalValue = totalValue;

    }

    @Override
    public void pay(int cost) {
    loan+=cost;
    }

    @Override
    public double getValue() {
        return loan+totalValue;
    }
 public double hasLoan (){
     return loan;
 }
}
