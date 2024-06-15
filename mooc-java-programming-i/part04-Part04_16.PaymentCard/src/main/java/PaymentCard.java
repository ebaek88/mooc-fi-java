// implementing a class for a payment card used at a cafeteria
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if(this.balance >= 2.60)
            this.balance -= 2.60;
    }

    public void eatHeartily() {
        if(this.balance >= 4.60)
            this.balance -= 4.60;
    }

    public void addMoney(double amount) {
        // if someone attempts to top up with negative amount,
        // the value on the card will not change
        if(amount < 0)
            return;
        // the card's balance should not exceed 150.
        // If the amount to be topped up exceeds this limit,
        // the balance should become exactly 150 euros.
        if( this.balance + amount > 150)
            this.balance = 150;
        else
            this.balance += amount;
    }


}
