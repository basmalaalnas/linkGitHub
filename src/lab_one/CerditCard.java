package lab_one;

public class CerditCard {
    private double balance;
    private double limit_credit;

    public CerditCard(double limit_credit) {
        this.limit_credit = limit_credit;
        this.balance = 0.0;
    }

    //R-1.11
    public void up_limit (double new_limit){
        this.limit_credit = new_limit;
    }
    //R-1.12
    public void  payment (double amount){
        if (amount > 0){
            balance -= amount;
        }

    }
    public void  purchase(double amount){
            balance += amount;
    }


    //R-1.13
    public static void main(String[] args) {
        CerditCard[] wallet = new CerditCard[3];
        wallet[0] = new CerditCard(5050);
        wallet[1] = new CerditCard(802);
        wallet[2] = new CerditCard(500);

        for (int val = 1; val <= 16; val++) {
            wallet[2].purchase(100);
            wallet[1].purchase(50);


        }

        for (CerditCard Card:wallet
             ) {
            System.out.println("balance: "+Card.balance);

        }



        }

}
