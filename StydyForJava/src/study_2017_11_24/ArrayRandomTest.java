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
				} // 학생 과목 점수 랜덤 출력, 과목 점수 다 더하는 for end
				System.out.println(i + 1 + "반 " + (j + 1) + "번 학생 총점은 " + sum + " 평균은 " + sum / 5);
			} // 학생 번호 for end
			System.out.println();
		} // 학생 반 for end
	}// main method end

}// class end
