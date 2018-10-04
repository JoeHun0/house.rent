package houserent;

public abstract class Person {

    private SavingAccount savings;
    protected double cash;

    public Person(SavingAccount savings, double cash) {
        this.savings = savings;
        this.cash = cash;
    }

    public abstract void spend(double residenceCost);

    public void earn(double salary) {
        cash += salary;
    }

    public double getEquity() {
        return cash;
    }

}
