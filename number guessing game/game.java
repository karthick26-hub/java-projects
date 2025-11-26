
import java.util.Random;
import java.util.Scanner;
class game {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println(" Welcome to Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too High! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("congrulations You guessed it in " + attempts + " attempts.");
            }
        }
    }
}
