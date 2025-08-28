package Util;

public class Wallet {
    private double amount;

    public Wallet() {
        amount = 0;
    }

    public void askForMoney(double money) {
        if(money > 0)
            this.amount += money;

    }

}
