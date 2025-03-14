package src;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private static String RESET = "\u001B[0m";
    private static String RED = "\u001B[31m";
    private static String GREEN = "\u001B[32m";
    private static String YELLOW = "\u001B[33m";
    private static String BLUE = "\u001B[34m";
    private static String WHITE = "\033[0;37m";   // WHITE
    private static String MAIN = "\u001B[36m";

    private int handMaxSize = 5;
    private int deckSize = 200;
    public int durability = 100;
    public int maxDurability = 100;

    public Card lastCard;

    ArrayList<Card> hand = new ArrayList<>();

    public Deck(int handMaxSize) {
        this.handMaxSize = handMaxSize;
        this.deckSize = 200;

        for (int i = 0; i < handMaxSize; i++) {
            // Try to draw card
            try {
                drawCard();
            // Ignore exception (not possible to happen in initialisation)
            } catch (Exception ignore) { }
        }

    }

    public void playCard(int cardSlot) {

        Card card = hand.get(cardSlot-1);
        lastCard = card; // set last card to the last played card
        hand.remove(cardSlot-1);
        try {
            drawCard();
        } catch (Exception e) {
            System.out.println("[!] Player hand cannot exceed " + MAIN + this.handMaxSize + RED + " in size. Card draw failed.");
        }
    }


    public void showHand() {

        int slot = 1;
        for (Card card: hand) {
            System.out.println(MAIN + "[Slot " + slot + "] " + card.toString());
            slot++; // increment slot count
        } 

    }

    public void drawCard() throws Exception {

        // check if hand already has the maximum number of cards
        if (hand.size() >= this.handMaxSize) {
            throw new Exception(RED + "[!] Player hand cannot exceed " + MAIN + this.handMaxSize + RED + " in size. Card draw failed.");
        }

        Random generator = new Random();

        while (true) {
            int randomIndex = generator.nextInt(0, this.deckSize);

            // check if index is null, continue if it is not
            if (!(ArcaneGambit.playableDeck[randomIndex] == null)) {
                Card card = new Card(
                    ArcaneGambit.playableDeck[randomIndex][0], // name of card
                    ArcaneGambit.playableDeck[randomIndex][1], // nature of card
                    Integer.parseInt(ArcaneGambit.playableDeck[randomIndex][2]) // parse string to integer for power level
                );
                // remove card from deck
                ArcaneGambit.playableDeck[randomIndex] = null;

                hand.add(card);
                break;
            }
        }
    }

    public void showAllCards() {

        System.out.println("Displaying all cards");
        for (int i = 0; i < ArcaneGambit.playableDeck.length; i++) {
            Card card = new Card(
                ArcaneGambit.playableDeck[i][0], // name of card
                ArcaneGambit.playableDeck[i][1], // nature of card
                Integer.parseInt(ArcaneGambit.playableDeck[i][2]) // parse string to integer for power level
            );
            card.displayCard();
        }

    }

}
