package study_2017_11_24;

import java.util.Random;

public class ArrayRandomTest {

	public static void main(String[] args) {
		Random rand = new Random();

		int[][][] randArr = new int[3][8][5];
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8; j++) {
				sum = 0;
				for (int k = 0; k < 5; k++) {
					randArr[i][j][k] = rand.nextInt(100);
					sum = sum + randArr[i][j][k];
				} // �л� ���� ���� ���� ���, ���� ���� �� ���ϴ� for end
				System.out.println(i + 1 + "�� " + (j + 1) + "�� �л� ������ " + sum + " ����� " + sum / 5);
			} // �л� ��ȣ for end
			System.out.println();
		} // �л� �� for end
	}// main method end

}// class end
