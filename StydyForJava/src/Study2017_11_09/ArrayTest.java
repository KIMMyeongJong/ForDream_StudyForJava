package Study2017_11_09;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		ArrayTest test = new ArrayTest();

		test.arrayTest();
		test.scoreArray();
	}// main method end

	void arrayTest() {
		int[] arrayTest = new int[10];// ���̰� 10�� �迭�� ����

		for (int i = 0; i <= 9; i++) {
			arrayTest[i] = i;
			System.out.println(arrayTest[i]);
		} // end for
	}// end void

	void scoreArray() {
		Scanner scan = new Scanner(System.in);
		int[] inputScore = new int[5];
		int sum = 0;
		int i = 0;

		for (i = 0; i < 5; i++) {
			System.out.println("���� �Է�");
			inputScore[i] = scan.nextInt();
			sum = sum + inputScore[i];
		}//end for
		System.out.println("�� ������ : " + sum + "��� ������ : " + sum / i);
	}//end void
}// class end
