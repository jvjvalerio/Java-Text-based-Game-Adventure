		/*
d		 * Group Members:
		 * Julio Valerio
		 * Aidian Gellineau
		 * 
		 */

package textBasedGame;
import java.util.Scanner;

public class TextBasedGame {

	public static void main(String[] args) {
		
		// Variables necessary for game creation
		Scanner input = new Scanner(System.in);
		String firstPlayerFirstName, firstPlayerLastName, secondPlayerFirstName, secondPlayerLastName, gameMenuInput, questionAnswer;
		boolean gameOver = false;
		int firstPlayerScore = 0;
		int secondPlayerScore = 0;

		// First player welcome & interaction
		System.out.println("Welcome to our sports trivia game first player!");
		System.out.println("Please enter your first name:");
		firstPlayerFirstName = input.nextLine();
		System.out.println("Please enter your last name:");
		firstPlayerLastName = input.nextLine();
		System.out.println("Welcome " + firstPlayerFirstName + " " + firstPlayerLastName + "\n");
		
		// Game Begins for first player
	while (gameOver == false) {
		System.out.println("Please type one of the corresponding menu items to play or quit the game");
		System.out.println("Type 1 to play game or 2 to quit");
		gameMenuInput = input.nextLine();
		System.out.println("\n");
		
		if (gameMenuInput.equals("1")) {
			// Question 1
			System.out.println("Question 1: What is the most common foul in basketball?");
			System.out.println("A: Traveling");
			System.out.println("B: Shooting Foul");
			System.out.println("C: Personal Foul");
			System.out.println("D: Double foul");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("C")) {
				System.out.println("That is correct!");
				firstPlayerScore++;
				System.out.println("Current score: " + firstPlayerScore + "\n");
			} else {
				System.out.println("You are incorrect! \n");
			}
			
			// Question 2
			System.out.println("Question 2: What is the most common penalty in soccer?");
			System.out.println("A: Free kick");
			System.out.println("B: Penalty kick");
			System.out.println("C: Offisde");
			System.out.println("D: Double foul");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("B")) {
				System.out.println("That is correct!");
				firstPlayerScore++;
				System.out.println("Current score: " + firstPlayerScore + "\n");
			} else {
				System.out.println("You are incorrect! \n");
			}
			
			// Question 3
			System.out.println("Question 3: What is the most common out in baseball?");
			System.out.println("A: Strikeout");
			System.out.println("B: Fly Out");
			System.out.println("C: Ground Out");
			System.out.println("D: Pop Out");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("A")) {
				System.out.println("That is correct!");
				firstPlayerScore++;
				System.out.println("Current score: " + firstPlayerScore + "\n");
			} else {
				System.out.println("You are incorrect! \n");
			}
			
			// Question 4
			System.out.println("Question 4: What is the most common serve in tennis?");
			System.out.println("A: Flat Serve");
			System.out.println("B: Kick Serve");
			System.out.println("C: Slice Serve");
			System.out.println("D: Topspin serve");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("A")) {
				System.out.println("That is correct!");
				firstPlayerScore++;
				System.out.println("Current score: " + firstPlayerScore + "\n");
			} else {
				System.out.println("You are incorrect! \n");
			}
			
			// Question 5
			System.out.println("Question 5: What is the most common shot in golf?");
			System.out.println("A: Drive");
			System.out.println("B: Iron Shot");
			System.out.println("C: Wedge Shot");
			System.out.println("D: Putt");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("A")) {
				System.out.println("That is correct!");
				firstPlayerScore++;
				System.out.println("Current score: " + firstPlayerScore + "\n");
				System.out.println("You've finished the game! Your final score is: " + firstPlayerScore + "\n");
				System.out.println("Lets give second player a chance shall we? \n");
			} else {
				System.out.println("You are incorrect! \n");
				System.out.println("Current score: " + firstPlayerScore);
				System.out.println("You've finished the game! Your final score is: " + firstPlayerScore + "\n");
				System.out.println("Lets give second player a chance shall we? \n");
			}
			
		} else if (gameMenuInput.equalsIgnoreCase("2")) {
			System.out.println("First player has quit the game. \n");
			gameOver = true;
		} else {
			System.out.println("Invalid input. Please enter 1 or 2. \n");
		}
	
	// Second Player welcome & interaction
	gameOver = false;
	System.out.println("Welcome to our sports trivia game second player!");
	System.out.println("Please enter your first name:");
	secondPlayerFirstName = input.nextLine();
	System.out.println("Please enter your last name:");
	secondPlayerLastName = input.nextLine();
	System.out.println("Welcome " + secondPlayerFirstName + " " + secondPlayerLastName + "\n");
	
	// Game begins for second player
	while (gameOver == false) {
		System.out.println("Please type the corresponding menu item to play or quit the game");
		System.out.println("Type 1 to play game or 2 to quit");
		gameMenuInput = input.nextLine();
		System.out.println("\n");
		
		if (gameMenuInput.equals("1")) {
			gameOver = false;
			// Question 1
			System.out.println("Question 1: What is the most common foul in basketball?");
			System.out.println("A: Traveling");
			System.out.println("B: Shooting Foul");
			System.out.println("C: Personal Foul");
			System.out.println("D: Double foul");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("C")) {
				System.out.println("That is correct!");
				secondPlayerScore++;
				System.out.println("Current score: " + secondPlayerScore + "\n");
			} else {
				System.out.println("You are incorrect! \n");
			}
			
			// Question 2
			System.out.println("Question 2: What is the most common penalty in soccer?");
			System.out.println("A: Free kick");
			System.out.println("B: Penalty kick");
			System.out.println("C: Offisde");
			System.out.println("D: Double foul");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("B")) {
				System.out.println("That is correct!");
				secondPlayerScore++;
				System.out.println("Current score: " + secondPlayerScore + "\n");
			} else {
				System.out.println("You are incorrect! \n");
			}
			
			// Question 3
			System.out.println("Question 3: What is the most common out in baseball?");
			System.out.println("A: Strikeout");
			System.out.println("B: Fly Out");
			System.out.println("C: Ground Out");
			System.out.println("D: Pop Out");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("A")) {
				System.out.println("That is correct!");
				secondPlayerScore++;
				System.out.println("Current score: " + secondPlayerScore + "\n");
			} else {
				System.out.println("You are incorrect! \n");
			}
			
			// Question 4
			System.out.println("Question 4: What is the most common serve in tennis?");
			System.out.println("A: Flat Serve");
			System.out.println("B: Kick Serve");
			System.out.println("C: Slice Serve");
			System.out.println("D: Topspin serve");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("A")) {
				System.out.println("That is correct!");
				secondPlayerScore++;
				System.out.println("Current score: " + secondPlayerScore + "\n");
			} else {
				System.out.println("You are incorrect! \n");
			}
			
			// Question 5
			System.out.println("Question 5: What is the most common shot in golf?");
			System.out.println("A: Drive");
			System.out.println("B: Iron Shot");
			System.out.println("C: Wedge Shot");
			System.out.println("D: Putt");
			questionAnswer = input.nextLine();
			
			if (questionAnswer.equalsIgnoreCase("A")) {
				// If second player answers CORRECTLY the following block of code is executed and increments the second player score by 1
				System.out.println("That is correct!");
				secondPlayerScore++;
				System.out.println("Current score: " + secondPlayerScore + "\n");
				System.out.println("You've finished the game! Your final score is: " + secondPlayerScore + "\n");
				System.out.println("Total Score: " + secondPlayerScore + "\n");
				System.out.println("GAME OVER");
				System.out.println("*************** \n");
				System.out.println("Total Score is: ");
				System.out.println("First Player: " + firstPlayerFirstName + " " + firstPlayerLastName + " Score: " + firstPlayerScore);
				System.out.println("Second Player: " + secondPlayerFirstName + " " + secondPlayerLastName + " Score: " + secondPlayerScore + "\n");
				
				// Begins score comparison and declares the winner
				if (firstPlayerScore > secondPlayerScore) {
					System.out.println(firstPlayerFirstName + " " + firstPlayerLastName + " is the winner!");
					gameOver = true;
				} else if (firstPlayerScore < secondPlayerScore) {
					System.out.println(secondPlayerFirstName + " " + secondPlayerLastName + " is the winner!");
					gameOver = true;
				} else {
					System.out.println("Its a tie!");
					gameOver = true;
				}
			} else {
				// If second player answers INCORRECTLY the following block of code is executed and does NOT increment the second players score
				System.out.println("You are incorrect! \n");
				System.out.println("Current score: " + secondPlayerScore + "\n");
				System.out.println("You've finished the game! Your final score is: " + secondPlayerScore + "\n");
				System.out.println("Total Score: " + secondPlayerScore + "\n");
				System.out.println("GAME OVER");
				System.out.println("***************** \n");
				System.out.println("Total Score is: ");
				System.out.println("First Player: " + firstPlayerFirstName + " " + firstPlayerLastName + " Score: " + firstPlayerScore);
				System.out.println("Second Player: " + secondPlayerFirstName + " " + secondPlayerLastName + " Score: " + secondPlayerScore + "\n");
				
				// Begins score comparison and names the winner
				if (firstPlayerScore > secondPlayerScore) {
					System.out.println(firstPlayerFirstName + " " + firstPlayerLastName + " is the winner!");
					gameOver = true;
				} else if (firstPlayerScore < secondPlayerScore) {
					System.out.println(secondPlayerFirstName + " " + secondPlayerLastName + " is the winner!");
					gameOver = true;
				} else {
					System.out.println("Its a tie! \n");
					gameOver = true;
					break;
				}
			}
			
		} else if (gameMenuInput.equals("2")) {
			System.out.println("Second player has quit the game.");
			gameOver = true;
		} else {
			System.out.println("Invalid input. Please enter 1 or 2. \n");
		}
	  }
		input.close();
	}
  }
}