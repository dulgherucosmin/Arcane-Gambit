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

    private static int deckMinSize = 4;
    private static int deckMaxSize = 7;

    public static void startGame() {

        while (true) {
            int choice = getValidChoice();
            System.out.println(choice);
        }

    }

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
