
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        double meal = 2.50;// an affordable meal costs 2.50 euros
        if(payment >= meal){
            this.money = this.money + meal;// increase the amount of cash by the price of an affordable mean and return the change
            this.affordableMeals++;
            return payment-meal;
            
        }        
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public double eatHeartily(double payment) {
        double hearty = 4.30;   // a hearty meal costs 4.30 euros
        if(payment >= hearty){
            this.money += hearty;
            this.heartyMeals++;
            return payment - hearty;
        }// increase the amount of cash by the price of a hearty mean and return the change
        return payment;// if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        
    }
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        if(card.balance() >= 2.50){
            this.affordableMeals++;
            card.takeMoney(2.50);
            return true;
        }
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() >= 4.30){
            this.heartyMeals++;
            card.takeMoney(4.30);
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
        card.addMoney(sum);// ...
        this.money += sum;
        }
    }
    
                               


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
