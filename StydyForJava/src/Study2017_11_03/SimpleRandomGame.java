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
			System.out.println("������ �Է��ϼ���~");
			input = scan.nextInt();
			rightCount++;

			if (input > randNum) {
				System.out.println("�Է°��� �������� Ŀ��~");
			} else if (input < randNum) {
				System.out.println("�Է°��� �������� �۾ƿ�~");
			} else {
				System.out.println("�����Դϴ�");
				System.out.println("���� Ƚ���� " + rightCount + " �Դϴ�.");
				break;
			}
		} // while end
	}
}
