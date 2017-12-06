package Study2017_11_03;

import java.util.Random;
import java.util.Scanner;

public class SimpleRandomGame {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int input;
		int randNum;
		int rightCount = 0;

		randNum = rand.nextInt(100);

		while (true) {
			System.out.println("정수를 입력하세요~");
			input = scan.nextInt();
			rightCount++;

			if (input > randNum) {
				System.out.println("입력값이 랜덤보다 커요~");
			} else if (input < randNum) {
				System.out.println("입력값이 랜덤보다 작아요~");
			} else {
				System.out.println("정답입니다");
				System.out.println("맞춘 횟수는 " + rightCount + " 입니다.");
				break;
			}
		} // while end
	}
}
