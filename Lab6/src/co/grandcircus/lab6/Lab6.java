package co.grandcircus.lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner userInput = new Scanner(System.in);

		System.out.println("Hello mate! I'd like to play a dice game with you." + "\n");

		System.out.println("I will soon prompt you to input the number of sides your pair of dice have..." + "\n");

		System.out.println(
				"I will then roll a pair of dice based off of the number of sides that you have provided me. Ready to Play? Good."
						+ "\n");

		System.out.println("Now, go ahead and let us know just how many sides should each die have:");
		dieSides = userInput.nextInt();
		userInput.nextLine();

		System.out.println("Okay, cool... Are you ready for me to roll the dice, mate? (y/n):");
		wannaPlay = userInput.next();
		userInput.nextLine();
		diceRollerApp(rand, userInput);

		System.out.println("Thanks for playing, mate! I hope that you won a ton of money!");
		userInput.close();

	}

	static int randNum1, randNum2, dieSides;
	static String wannaPlay;

	public static void diceRollerApp(Random rand, Scanner userInput) {
		do {
			randNum1 = rand.nextInt(dieSides) + 1;
			randNum2 = rand.nextInt(dieSides) + 1;

			System.out.println("Your roll came out to be:\n" + randNum1 + "\n" + randNum2);

			System.out.println("How about another roll, mate? (y/n):");
			wannaPlay = userInput.next();
			userInput.nextLine();

		} while (wannaPlay.equalsIgnoreCase("y"));
	}
}
