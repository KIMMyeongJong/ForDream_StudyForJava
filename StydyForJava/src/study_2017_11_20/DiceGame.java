package study_2017_11_20;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int[] dice = { 0, 0, 0, 0, 0, 0 };
		int diceNum;

		System.out.println("주사위를 몇번 던질까요?");
		int throwDice = scan.nextInt();

		for (int i = 0; i < throwDice; i++) {
			diceNum = rand.nextInt(6);
			dice[diceNum]++;
		} // for end
		System.out.println("======================");
		System.out.println("면      빈도");
		System.out.println("======================");

		for (int i = 0; i < dice.length; i++) {
			System.out.println(i + 1 + "      " + dice[i]);
		} // print dice for end
	}// main method end

}// class end
