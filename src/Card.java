package src;

public class Card {

    private String cardName;
    private int cardPower = 0;

    public Card(String cardName, int cardPower) {
        this.cardName = cardName;
        this.cardPower = cardPower;
    }

    public String getCardName() {
        return cardName;
    }

    public int getCardPower() {
        return cardPower;
    }

    public String getCardPowerString() {
        return Integer.toString(cardPower);
    }
}
