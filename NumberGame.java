package javaprojects;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int guess;
        int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly: " + numberToGuess);
            }
        } while (guess != numberToGuess);

        scanner.close();
}
}
