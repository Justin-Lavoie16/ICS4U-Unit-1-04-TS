/*
* This is the dice roll game.
*
* @author  Justin Lavoie
* @version 1.0
* @since   2024-02-27
*/

import java.util.Scanner;
/**
 * This is a guessing game.
 */

final class DiceGame {

    /**
     * This is the max number of the dice.
     */
    public static final double MAX_NUMBER = 6;
    /**
     * This is the min number the dice needs to roll.
     */
    public static final double MIN_NUMBER = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called.
    *
    * @throws IllegalStateException when called.
    *
    */

    private DiceGame() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used.
    */

    public static void main(final String[] args) {

        final double generatedNumber = (int) (Math.random() * MAX_NUMBER
                        + MIN_NUMBER);
        double counter = 1;

        while (true) {
            try {
                final Scanner firstInput = new Scanner(System.in);
                System.out.print("Guess a number between 1 and 6:  ");
                final double userGuess = firstInput.nextDouble();

                if (userGuess > MAX_NUMBER || userGuess < MIN_NUMBER) {
                    System.out.println("Invalid Input ");
                } else {
                    if (userGuess == generatedNumber) {
                        System.out.println("You Guessed Correct!");
                        System.out.println("It took you " + counter + " tries");
                        break;
                    } else if (userGuess < generatedNumber) {
                        System.out.println("You guessed too low.");
                        System.out.println("Guess again. ");
                    } else if (userGuess > generatedNumber) {
                        System.out.println("You guessed too high.");
                        System.out.println("Guess again.");
                    }
                    counter = counter + 1;
                }
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Invalid Input");
                break;
            }
        }
        System.out.println("\nDone.");
    }
}

