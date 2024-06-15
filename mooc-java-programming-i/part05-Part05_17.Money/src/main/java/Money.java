
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        // create a new Money object htat has the correct worht
        Money newMoney = new Money(newEuros, newCents);

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        // returns false if both objects have the same reference
        if(this == compared) {
            return false;
        }

        // first compare the euro parts
        if(this.euros < compared.euros) {
            return true;
        }

        if(this.euros > compared.euros) {
            return false;
        }

        // if the euro parts are the same, compare the cent parts
        if(this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    // returns a new money object worth (this - decreaser)
    // if the difference would be negative, the worth of the created money object is set to 0
    public Money minus(Money decreaser) {
        // checks if this < decreaser
        if(this.euros < decreaser.euros) {
            return new Money(0, 0);
        }

        if(this.cents < decreaser.cents && this.euros == decreaser.euros) {
            return new Money(0, 0);
        }

        // evaluate the subtraction
        int newCents = this.cents - decreaser.cents;
        int newEuros = this.euros;
        if(newCents < 0) {
            newCents = newCents + 100;
            newEuros--;
        }
        newEuros = newEuros - decreaser.euros;
        Money result = new Money(newEuros, newCents);
        return result;
    }


}
