package src;

public class Card {

    private static String RESET = "\u001B[0m";
    private static String RED = "\u001B[31m";
    private static String GREEN = "\u001B[32m";
    private static String YELLOW = "\u001B[33m";
    private static String BLUE = "\u001B[34m";
    private static String WHITE = "\033[0;37m";   // WHITE

    private String cardName;
    private String nature;
    private int cardPower = 0;
    private String colour = "";

    public Card(String cardName, String nature, int cardPower) {
        this.cardName = cardName;
        this.nature = nature;
        this.cardPower = cardPower;

        switch (nature) {
            case "Flame":
                this.colour = RED;
                break;
            case "Water":
                this.colour = BLUE;
                break;
            case "Earth":
                this.colour = GREEN;
                break;
            case "Air":
                this.colour = WHITE;
                break;
        }
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardNature() {
        return nature;
    }

    public int getCardPower() {
        return cardPower;
    }

    public String getCardColour() {
        return colour;
    }

    @Override
    public String toString() {
        return this.colour + this.cardPower + " | " + this.cardName + RESET;
    }

    public void displayCard() {
        System.out.println(this.colour + this.cardPower + " | " + this.cardName + RESET);
    }

    public String getCardPowerAsString() {
        return Integer.toString(cardPower);
    }
}
