package com.roshambo;

import java.util.Scanner;

import com.rockpaperscissors.Opponent1;
import com.rockpaperscissors.Opponent10;
import com.rockpaperscissors.Opponent2;
import com.rockpaperscissors.Opponent3;
import com.rockpaperscissors.Opponent4;
import com.rockpaperscissors.Opponent5;
import com.rockpaperscissors.Opponent6;
import com.rockpaperscissors.Opponent7;
import com.rockpaperscissors.Opponent8;
import com.rockpaperscissors.Opponent9;
import com.validation.Validation;

public class Arena {
	
	static boolean stillPlaying = true;
	static boolean userFailed = false;
	static Scanner sc = new Scanner(System.in);
	static int userThrow;
	static int opponentThrow;
	static int opponentChoice = 0;
	static int throwChoice = 0;
	static int userThrow1;
	static int oppChoice;


	public static void main(String[] args) {

		

		while (stillPlaying) {

			playGame();

		}

	}

	public static boolean playGame() {

		Opponent1 opp1 = new Opponent1();
		Opponent2 opp2 = new Opponent2();
		Opponent3 opp3 = new Opponent3();
		Opponent4 opp4 = new Opponent4();
		Opponent5 opp5 = new Opponent5();
		Opponent6 opp6 = new Opponent6();
		Opponent7 opp7 = new Opponent7();
		Opponent8 opp8 = new Opponent8();
		Opponent9 opp9 = new Opponent9();
		Opponent10 opp10 = new Opponent10();
		
		
		
		System.out.println("Welcome to the game! Please enter your name: ");
		String userName = sc.nextLine();

		do {
			
			System.out.println("Hello " + userName + "! Please choose your opponent: (1-10)");
			String numChosen = sc.nextLine();
			
			opponentChoice = Integer.parseInt(numChosen);
			userFailed = Validation.oppNumber(numChosen);
			
			
			

		} while (userFailed);

		System.out.println("Please enter your throw (Rock (1), Paper(2), Scissors(3), Lizard(4) or Spock(5)");

		String numChosen = sc.nextLine();
		int throwChoice = Integer.parseInt(numChosen);
		userFailed = Validation.userThrow(throwChoice);
		int userThrow = (throwChoice -1);
		

		if (opponentChoice == 1) {
			opponentThrow = opp1.handy();

		} else if (opponentChoice == 2) {
			opponentThrow = opp2.handy();

		} else if (opponentChoice == 3) {
			opponentThrow = opp3.handy();

		} else if (opponentChoice == 4) {
			opponentThrow = opp4.handy();

		} else if (opponentChoice == 5) {
			opponentThrow = opp5.handy();

		} else if (opponentChoice == 6) {
			opponentThrow = opp6.handy();

		} else if (opponentChoice == 7) {
			opponentThrow = opp7.handy();

		} else if (opponentChoice == 8) {
			opponentThrow = opp8.handy();

		} else if (opponentChoice == 9) {
			opponentThrow = opp9.handy();

		} else if (opponentChoice == 10) {
			opponentThrow = opp10.handy();

		}
		
		
		

		String[][] answers = new String[5][5];

		answers[0][0] = "You threw Rock, your opponent threw Rock. You Tie.";
		answers[0][1] = "You threw Rock, your opponent threw Paper. You Lose.";
		answers[0][2] = "You threw Rock, your opponent threw Scissors. You Win.";
		answers[0][3] = "You threw Rock, your opponent threw Lizard. You Win.";
		answers[0][4] = "You threw Rock, your opponent threw Spock. You Lose.";
		answers[1][0] = "You threw Paper, your opponent threw Rock. You Win.";
		answers[1][1] = "You threw Paper, your opponent threw Paper. You Tie.";
		answers[1][2] = "You threw Paper, your opponent threw Scissors. You Lose.";
		answers[1][3] = "You threw Paper, your opponent threw Lizard. You Lose.";
		answers[1][4] = "You threw Paper, your opponent threw Spock. You Win.";
		answers[2][0] = "You threw Scissors, your opponent threw Rock. You Lose.";
		answers[2][1] = "You threw Scissors, your opponent threw Paper. You Win.";
		answers[2][2] = "You threw Scissors, your opponent threw Scissors. You Tie.";
		answers[2][3] = "You threw Scissors, your opponent threw Lizard. You Win.";
		answers[2][4] = "You threw Scissors, your opponent threw Spock. You Lose.";
		answers[3][0] = "You threw Lizard, your opponent threw Rock. You Lose.";
		answers[3][1] = "You threw Lizard, your opponent threw Paper. You Win.";
		answers[3][2] = "You threw Lizard, your opponent threw Scissors. You Lose.";
		answers[3][3] = "You threw Lizard, your opponent threw Lizard. You Tie.";
		answers[3][4] = "You threw Lizard, your opponent threw Spock. You Win.";
		answers[4][0] = "You threw Spock, your opponent threw Rock. You Win.";
		answers[4][1] = "You threw Spock, your opponent threw Paper. You Lose.";
		answers[4][2] = "You threw Spock, your opponent threw Scissors. You Win.";
		answers[4][3] = "You threw Spock, your opponent threw Lizard. You Lose.";
		answers[4][4] = "You threw Spock, your opponent threw Spock. You Tie.";

		if ((userThrow == 0) && (opponentThrow == 0)) {
			System.out.println(answers[0][0]);
		} else if ((userThrow == 0) && (opponentThrow == 1)) {
			System.out.println(answers[0][1]);
		} else if ((userThrow == 0) && (opponentThrow == 2)) {
			System.out.println(answers[0][2]);
		} else if ((userThrow == 0) && (opponentThrow == 3)) {
			System.out.println(answers[0][3]);
		} else if ((userThrow == 0) && (opponentThrow == 4)) {
			System.out.println(answers[0][4]);
		} else if ((userThrow == 1) && (opponentThrow == 0)) {
			System.out.println(answers[1][0]);
		} else if ((userThrow == 1) && (opponentThrow == 1)) {
			System.out.println(answers[1][1]);
		} else if ((userThrow == 1) && (opponentThrow == 2)) {
			System.out.println(answers[1][2]);
		} else if ((userThrow == 1) && (opponentThrow == 3)) {
			System.out.println(answers[1][3]);
		} else if ((userThrow == 1) && (opponentThrow == 4)) {
			System.out.println(answers[1][4]);
		} else if ((userThrow == 2) && (opponentThrow == 0)) {
			System.out.println(answers[2][0]);
		} else if ((userThrow == 2) && (opponentThrow == 1)) {
			System.out.println(answers[2][1]);
		} else if ((userThrow == 2) && (opponentThrow == 2)) {
			System.out.println(answers[2][2]);
		} else if ((userThrow == 2) && (opponentThrow == 3)) {
			System.out.println(answers[2][3]);
		} else if ((userThrow == 2) && (opponentThrow == 4)) {
			System.out.println(answers[2][4]);
		} else if ((userThrow == 0) && (opponentThrow == 0)) {
			System.out.println(answers[3][0]);
		} else if ((userThrow == 3) && (opponentThrow == 1)) {
			System.out.println(answers[3][1]);
		} else if ((userThrow == 3) && (opponentThrow == 2)) {
			System.out.println(answers[3][2]);
		} else if ((userThrow == 3) && (opponentThrow == 3)) {
			System.out.println(answers[3][3]);
		} else if ((userThrow == 3) && (opponentThrow == 4)) {
			System.out.println(answers[3][4]);
		} else if ((userThrow == 4) && (opponentThrow == 0)) {
			System.out.println(answers[4][0]);
		} else if ((userThrow == 4) && (opponentThrow == 1)) {
			System.out.println(answers[4][1]);
		} else if ((userThrow == 4) && (opponentThrow == 2)) {
			System.out.println(answers[4][2]);
		} else if ((userThrow == 4) && (opponentThrow == 3)) {
			System.out.println(answers[4][3]);
		} else if ((userThrow == 4) && (opponentThrow == 4)) {
			System.out.println(answers[4][4]);
		}

		return stillPlaying;

	}

	public static int getUserThrow() {
		return userThrow;
	}

	public static void setUserThrow(int userThrow) {
		Arena.userThrow = userThrow;
	}

	public static int getOpponentThrow() {
		return opponentThrow;
	}

	public static void setOpponentThrow(int opponentThrow) {
		Arena.opponentThrow = opponentThrow;
	}
	
	
}
