package study_2017_11_20;

import java.util.Scanner;

public class SequentialSerch {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int input;
		int[] intArray = { 10, 20, 30, 60, 70, 90, 100 };
		int[] intArray2 = { 10, 50, 40, 30, 20, 40, 20, 10 };
		int notFound1 = 0;
		int notFound2 = 0;

		System.out.println("ã�����ϴ� ���� �Է����ּ���");
		input = scan.nextInt();
		
		for (int i = 0; i < intArray.length; i++) {
			if (input == intArray[i]) {
				System.out.println("ù��° �迭������" + i + "��° �ε����� ã�� ���Դϴ�");
				break;
			}else {
				notFound2 = notFound2 + 1;
			}//if end
		} // intArray for end
		if (notFound2 >= intArray.length) {
			System.out.println("ù��° �迭������ ã�� ���� �����ϴ�");
		}

		for (int i = 0; i < intArray2.length; i++) {
			if (input == intArray2[i]) {
				System.out.print("�ι�° �迭������ " + i);
				System.out.println("��° �ε����� ã�� ���Դϴ�");
			} else {
				notFound1 = notFound1 + 1;
			} // else end
		} // intArray2 for end
		if (notFound1 >= intArray2.length) {
			System.out.println("�ι�° �迭������ ã�� ���� �����ϴ�");
		}
	}
}
