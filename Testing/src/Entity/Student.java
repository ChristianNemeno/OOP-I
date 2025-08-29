package Entity;

import Util.Wallet;

public class Student {
    private int id;
    private String name;

    private Wallet wallet;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
        this.wallet = new Wallet(100);
    }

    public void spend(double amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.wallet.deductMoney(amount);
    }



}
