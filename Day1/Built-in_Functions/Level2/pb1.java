package Level2;

import java.util.Scanner;
import java.util.Random;

public class pb1 {
    static int generateGuess(int low, int high) {
        return low + new Random().nextInt(high - low + 1);
    }

    static String getUserFeedback(Scanner sc, int guess) {
        System.out.println("Is your number " + guess + "? (high/low/correct):");
        return sc.nextLine().toLowerCase();
    }

    static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;

        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(sc, guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! The computer guessed your number.");
                found = true;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter high, low, or correct.");
            }
        }

        if (!found) System.out.println("Hmm... something went wrong!");
    }

    public static void main(String[] args) {
        playGame();
    }
}
