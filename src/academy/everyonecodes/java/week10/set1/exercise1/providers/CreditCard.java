package academy.everyonecodes.java.week10.set1.exercise1.providers;

public abstract class CreditCard {
    private String cardName;

    public CreditCard(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }
    public abstract boolean isValid(String cardNumber);
}
