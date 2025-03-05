package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArcaneGambit {

    static Scanner sc = new Scanner(System.in);

    // ANSI Colour Codes
    private static String ANSI_RESET = "\u001B[0m";
    private static String RED = "\u001B[31m";
    private static String GREEN = "\u001B[32m";
    private static String YELLOW = "\u001B[33m";
    private static String BLUE = "\u001B[34m";
    private static String PURPLE = "\u001B[35m";
    private static String MAIN = "\u001B[36m";

    public static String[][] playableDeck = {{"Flame", "Flame", "1"}, {"Flame", "Flame", "1"}, {"Flame", "Flame", "1"}, {"Flame", "Flame", "1"}, {"Flame", "Flame", "1"}, {"Flame", "Flame", "2"}, {"Flame", "Flame", "2"}, {"Flame", "Flame", "2"}, {"Flame", "Flame", "2"}, {"Flame", "Flame", "2"},  {"Flame", "Flame", "3"}, {"Flame", "Flame", "3"}, {"Flame", "Flame", "3"}, {"Flame", "Flame", "3"}, {"Flame", "Flame", "3"},            {"Flame", "Flame", "4"}, {"Flame", "Flame", "4"}, {"Flame", "Flame", "4"}, {"Flame", "Flame", "4"}, {"Flame", "Flame", "4"},            {"Flame", "Flame", "5"}, {"Flame", "Flame", "5"}, {"Flame", "Flame", "5"}, {"Flame", "Flame", "5"}, {"Flame", "Flame", "5"},            {"Flame", "Flame", "6"}, {"Flame", "Flame", "6"}, {"Flame", "Flame", "6"}, {"Flame", "Flame", "6"}, {"Flame", "Flame", "6"},            {"Flame", "Flame", "7"}, {"Flame", "Flame", "7"}, {"Flame", "Flame", "7"}, {"Flame", "Flame", "7"}, {"Flame", "Flame", "7"},            {"Flame", "Flame", "8"}, {"Flame", "Flame", "8"}, {"Flame", "Flame", "8"}, {"Flame", "Flame", "8"}, {"Flame", "Flame", "8"},            {"Flame", "Flame", "9"}, {"Flame", "Flame", "9"}, {"Flame", "Flame", "9"}, {"Flame", "Flame", "9"}, {"Flame", "Flame", "9"},            {"Flame", "Flame", "10"}, {"Flame", "Flame", "10"}, {"Flame", "Flame", "10"}, {"Flame", "Flame", "10"}, {"Flame", "Flame", "10"},            {"Water", "Water", "1"}, {"Water", "Water", "1"}, {"Water", "Water", "1"}, {"Water", "Water", "1"}, {"Water", "Water", "1"},            {"Water", "Water", "2"}, {"Water", "Water", "2"}, {"Water", "Water", "2"}, {"Water", "Water", "2"}, {"Water", "Water", "2"},            {"Water", "Water", "3"}, {"Water", "Water", "3"}, {"Water", "Water", "3"}, {"Water", "Water", "3"}, {"Water", "Water", "3"},            {"Water", "Water", "4"}, {"Water", "Water", "4"}, {"Water", "Water", "4"}, {"Water", "Water", "4"}, {"Water", "Water", "4"},            {"Water", "Water", "5"}, {"Water", "Water", "5"}, {"Water", "Water", "5"}, {"Water", "Water", "5"}, {"Water", "Water", "5"},            {"Water", "Water", "6"}, {"Water", "Water", "6"}, {"Water", "Water", "6"}, {"Water", "Water", "6"}, {"Water", "Water", "6"},            {"Water", "Water", "7"}, {"Water", "Water", "7"}, {"Water", "Water", "7"}, {"Water", "Water", "7"}, {"Water", "Water", "7"},            {"Water", "Water", "8"}, {"Water", "Water", "8"}, {"Water", "Water", "8"}, {"Water", "Water", "8"}, {"Water", "Water", "8"},            {"Water", "Water", "9"}, {"Water", "Water", "9"}, {"Water", "Water", "9"}, {"Water", "Water", "9"}, {"Water", "Water", "9"},            {"Water", "Water", "10"}, {"Water", "Water", "10"}, {"Water", "Water", "10"}, {"Water", "Water", "10"}, {"Water", "Water", "10"},            {"Earth", "Earth", "1"}, {"Earth", "Earth", "1"}, {"Earth", "Earth", "1"}, {"Earth", "Earth", "1"}, {"Earth", "Earth", "1"},            {"Earth", "Earth", "2"}, {"Earth", "Earth", "2"}, {"Earth", "Earth", "2"}, {"Earth", "Earth", "2"}, {"Earth", "Earth", "2"},            {"Earth", "Earth", "3"}, {"Earth", "Earth", "3"}, {"Earth", "Earth", "3"}, {"Earth", "Earth", "3"}, {"Earth", "Earth", "3"},            {"Earth", "Earth", "4"}, {"Earth", "Earth", "4"}, {"Earth", "Earth", "4"}, {"Earth", "Earth", "4"}, {"Earth", "Earth", "4"},            {"Earth", "Earth", "5"}, {"Earth", "Earth", "5"}, {"Earth", "Earth", "5"}, {"Earth", "Earth", "5"}, {"Earth", "Earth", "5"},            {"Earth", "Earth", "6"}, {"Earth", "Earth", "6"}, {"Earth", "Earth", "6"}, {"Earth", "Earth", "6"}, {"Earth", "Earth", "6"},            {"Earth", "Earth", "7"}, {"Earth", "Earth", "7"}, {"Earth", "Earth", "7"}, {"Earth", "Earth", "7"}, {"Earth", "Earth", "7"},            {"Earth", "Earth", "8"}, {"Earth", "Earth", "8"}, {"Earth", "Earth", "8"}, {"Earth", "Earth", "8"}, {"Earth", "Earth", "8"},            {"Earth", "Earth", "9"}, {"Earth", "Earth", "9"}, {"Earth", "Earth", "9"}, {"Earth", "Earth", "9"}, {"Earth", "Earth", "9"},            {"Earth", "Earth", "10"}, {"Earth", "Earth", "10"}, {"Earth", "Earth", "10"}, {"Earth", "Earth", "10"}, {"Earth", "Earth", "10"},            {"Air", "Air", "1"}, {"Air", "Air", "1"}, {"Air", "Air", "1"}, {"Air", "Air", "1"}, {"Air", "Air", "1"},            {"Air", "Air", "2"}, {"Air", "Air", "2"}, {"Air", "Air", "2"}, {"Air", "Air", "2"}, {"Air", "Air", "2"},            {"Air", "Air", "3"}, {"Air", "Air", "3"}, {"Air", "Air", "3"}, {"Air", "Air", "3"}, {"Air", "Air", "3"},            {"Air", "Air", "4"}, {"Air", "Air", "4"}, {"Air", "Air", "4"}, {"Air", "Air", "4"}, {"Air", "Air", "4"},            {"Air", "Air", "5"}, {"Air", "Air", "5"}, {"Air", "Air", "5"}, {"Air", "Air", "5"}, {"Air", "Air", "5"},            {"Air", "Air", "6"}, {"Air", "Air", "6"}, {"Air", "Air", "6"}, {"Air", "Air", "6"}, {"Air", "Air", "6"},            {"Air", "Air", "7"}, {"Air", "Air", "7"}, {"Air", "Air", "7"}, {"Air", "Air", "7"}, {"Air", "Air", "7"}, {"Air", "Air", "8"}, {"Air", "Air", "8"}, {"Air", "Air", "8"}, {"Air", "Air", "8"}, {"Air", "Air", "8"}, {"Air", "Air", "9"}, {"Air", "Air", "9"}, {"Air", "Air", "9"}, {"Air", "Air", "9"}, {"Air", "Air", "9"}, {"Air", "Air", "10"}, {"Air", "Air", "10"}, {"Air", "Air", "10"}, {"Air", "Air", "10"}, {"Air", "Air", "10"}};


    // Settings
    private static int deckMinSize = 4;
    private static int deckMaxSize = 7;
    private static String difficulty = "normal";

    public static void startGame() {

        Deck playerDeck = new Deck(5);

        Scanner sc = new Scanner(System.in);

        while (true) {
            playerDeck.showHand();
            System.out.println("Please pick a card to play");
            int input = sc.nextInt();

            if (input == 0) {
                break;
            }
            else {
                playerDeck.playCard(input);
            }
        }

        sc.close();
    }

    private static void initialiseGame(String difficulty, int deckMinSize, int deckMaxSize) {
        difficulty = difficulty.toLowerCase();
        deckMinSize = 4;
        deckMaxSize = 7;

    }

    /**
     * Takes two cards and returns whether they have a type advantage.
     * @param attackerCard The attacking card. (Card Object)
     * @param defenderCard The defending card. (Card Object)
     * @return int between -1 and 1 depending on the type advantage.
     */
    private static int calculateTypeAdvantage(Card attackerCard, Card defenderCard) {

        String attackerNature = attackerCard.getCardNature();
        String defenderNature = defenderCard.getCardNature();

        if (attackerNature.equalsIgnoreCase("Flame")) {
            return switch (defenderNature) {
                case "Earth" -> 1;
                case "Water" -> -1;
                default -> 0; // Attacking card has no type advantage
            };
        } else if (attackerNature.equalsIgnoreCase("Earth")) {
            return switch (defenderNature) {
                case "Flame" -> -1;
                case "Air" -> 1;
                default -> 0; // Attacking card has no type advantage
            };
        } else if (attackerNature.equalsIgnoreCase("Air")) {
            return switch (defenderNature) {
                case "Water" -> 1;
                case "Earth" -> -1;
                default -> 0; // Attacking card has no type advantage
            };
        } else if (attackerNature.equalsIgnoreCase("Water")) {
            return switch (defenderNature) {
                case "Flame" -> 1;
                case "Air" -> -1;
                default -> 0; // Attacking card has no type advantage
            };
        }

        // Default return
        return 0;
    }

    /**
     *
     * @param attackerCard
     * @param defenderCard
     * @return
     */
    private static double calculateAttackChance(Card attackerCard, Card defenderCard) {

        int attackerPower = attackerCard.getCardPower();
        int defenderPower = defenderCard.getCardPower();
        int typeAdvantage = calculateTypeAdvantage(attackerCard, defenderCard);

        // TODO: Add proper calculation for
        switch (typeAdvantage) {
            case 1:
                if (attackerPower > defenderPower) {
                    return 1.0;
                } else {
                    return 0.6;
                }
            case 0:
                return 0;
            case -1:
                return 0;
        }
        return 0;
    }

    /**
     * Validates user input.
     */
    private static int getValidChoice() {

        int input;

        try {
            input = sc.nextInt();

            // loop until input is validated
            while (true) {
                System.out.println("In: " + input);
                if (input >= deckMinSize && input <= deckMaxSize) { // check if input is within deck range
                    return input; // return validated input
                // continue the loop
                } else {
                    System.out.println(RED + "[ERROR] Invalid Input. Please choose a number between " + MAIN + deckMinSize + RED + " and " + MAIN + deckMaxSize + RED + "." + ANSI_RESET);
                    input = sc.nextInt(); // get next input
                }
            }

        // user tried to input anything other than an Integer type
        } catch (InputMismatchException e) {
            System.out.println(RED + "[ERROR] Invalid Input. Please choose a number between " + MAIN + deckMinSize + RED + " and " + MAIN + deckMaxSize + RED + "." + ANSI_RESET);
            sc.next(); // reset input
            return getValidChoice(); // recall method
        }
    }

}
