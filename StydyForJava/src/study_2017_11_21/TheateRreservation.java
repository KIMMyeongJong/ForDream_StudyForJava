package study_2017_11_21;

import java.util.Scanner;

public class TheateRreservation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] sitArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] selectArr = new int[10];
		int input;
		boolean whileCont = true;
		while (whileCont) {
			System.out.println("------------------------------------------");
			for (int i = 0; i < sitArr.length; i++) {
				System.out.print("  " + sitArr[i]);
			} // �¼� ��ȣ ��� for end
			System.out.println();
			System.out.println("------------------------------------------");
			for (int i = 0; i < selectArr.length; i++) {
				System.out.print("  " + selectArr[i]);
			} // �¼� ���� for end
			System.out.println();
			System.out.println("���ϴ� �¼��� ��ȣ�� �Է��ϼ���  || ���� : -1");
			System.out.println("���� ��ҽ� �¼���ȣ + 10 �� �Է� �� �ֽʽÿ�");

			input = scan.nextInt() - 1;
			if (input < 0) {
				whileCont = false;
				break;
			} // ����ÿ��� while�� false�� ����� break�� while���� Ż���Ѵ�
			if (input > selectArr.length * 2 + 1) {
				System.out.println("�߸� �����ϼ̽��ϴ�");
			} else if (input > selectArr.length) {
				input = input - 10;
				if (selectArr[input] == 1) {
					selectArr[input]--;
					System.out.println("��ҵǾ����ϴ�");
				} else {
					System.out.println(input + 1 + "�� �ڸ����� ������ �Ǿ����� �ʽ��ϴ�");
				}
				// ���� ��ҽ�
			} else if (selectArr[input] == 0) {
				selectArr[input]++;
			} else {
				System.out.println("�̹� ����� �ڸ��Դϴ�");
			}
		} // ��ü while end
		System.out.println("�����մϴ�");

	}

}