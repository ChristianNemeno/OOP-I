package Util;

public class Wallet {
    private double amount;

    public Wallet(double amount) {
        this.amount = amount;
    }

    public void addMoney(double money) {
        if(money > 0)
            this.amount += money;

    }
    public void deductMoney(double money) {
        if(money > 0)
            this.amount -= money;
    }

    public double getAmount() {
        return amount;
    }
}
