package Study2017_11_03;

import java.util.Random;
import java.util.Scanner;

public final class RandomClassTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int randNum = rand.nextInt(100);
		int sum = 0;
		int input;
		System.out.println("�����Է�");
		input = scan.nextInt();
		for (int i = 0; i <= input; i++) {
			sum = randNum + sum;
		}
		System.out.println(sum);
	}
}
