package houserent;

public abstract class Person {

    protected SavingAccount savings;
    protected Residence residence;
    protected double cash;

    public Person(SavingAccount savings, Residence residence, double cash) {
        this.savings = savings;
        this.residence = residence;
        this.cash = cash;
    }



    public abstract void spend(double residenceCost);

    public void earn(double salary) {
        cash += salary;
    }

    public double getEquity() {
        return cash+residence.getValue()+savings.getBalance();
    }

}
