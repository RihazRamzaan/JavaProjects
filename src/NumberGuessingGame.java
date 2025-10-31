import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess;
        int attempt = 0;
        int min=1;
        int max=100;

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d - %d\n", min, max);

        int random = rand.nextInt(min, max + 1);
        System.out.print("Enter a guess: ");

        do {
            guess = input.nextInt();
            attempt++;

            if (guess > random) {
                System.out.println(" Your guess is higher than the actual number.");
            } else if (guess < random) {
                System.out.println(" Your guess is lower than the actual number.");
            } else {
                System.out.println("Your guess is correct! Hooray!");
                System.out.println(" Number of attempts: " + attempt);
            }
        }
        while (guess != random);











        input.close();
    }
}