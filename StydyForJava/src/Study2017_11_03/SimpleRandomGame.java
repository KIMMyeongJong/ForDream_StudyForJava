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
		boolean whileControl = true;

		randNum = rand.nextInt(100);

		while (whileControl) {
			System.out.println("������ �Է��ϼ���~");
			input = scan.nextInt();

			if (input > randNum) {
				System.out.println("�Է°��� �������� Ŀ��~");
				rightCount++;
			} else if (input < randNum) {
				System.out.println("�Է°��� �������� �۾ƿ�~");
				rightCount++;
			} else {
				System.out.println("�����Դϴ�");
				System.out.println("���� Ƚ���� " + rightCount + "�Դϴ�.");
				whileControl = false;
			}
		} // while end

	}

}
