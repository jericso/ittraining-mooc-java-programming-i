
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
        int eurosSum = this.euros + addition.euros;
        int centsSum = this.cents + addition.cents;

        if (centsSum > 99) {
            eurosSum += 1;
            centsSum -= 100;
        }

        return new Money(eurosSum, centsSum);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        int eurosDifference = this.euros - decreaser.euros;
        int centsDifference = this.cents - decreaser.cents;

        if (centsDifference < 0) {
            eurosDifference -= 1;
            centsDifference += 100;
        }

        Money newMoney = new Money(eurosDifference, centsDifference);
        Money zeroMoney = new Money(0, 0);

        if (newMoney.lessThan(zeroMoney)) {
            return zeroMoney;
        } else {
            return newMoney;
        }
    }
}
