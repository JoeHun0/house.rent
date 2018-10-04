package houserent;

public class HouseRent {

    public static void main(String[] args) {
        // TODO code application logic here
        SavingAccount jozsi_szamlaja = new SavingAccount(1.5);
        Residence jozsi_haza = new OwnedResidence(1000000.0,0.0);
        Person jozsi = new SavingPerson(jozsi_szamlaja,jozsi_haza,300000);
        System.out.println(jozsi.getEquity());
    }

}
