package Study2017_11_09;

import java.util.Random;
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int userLottoNum[] = new int[7];// ����� �ζ� ��ȣ - �Է°� ���� ����
		int lottoNum[] = new int[7];// ��ǻ�� �ζ� ��ȣ - ��ü ��������
		int randCont = 0;// ����ں��� �ڵ� ���� ���� �޴� ����
		boolean whileControl = true;// while�� ���� ���� - �迭���� ������ false����

		System.out.println("�ڵ� ��ȣ ���� ����");
		randCont = scan.nextInt();
		int userForControl = 0 + randCont;

		for (int i = 0; i < randCont; i++) {
			userLottoNum[i] = rand.nextInt(44) + 1;
		} // for end

		while (whileControl) {

			System.out.println("�ζ� ��ȣ�� �Է��� �ֽʽÿ�");

			for (; userForControl < userLottoNum.length-1; userForControl++) {
				userLottoNum[userForControl] = scan.nextInt();
			} // for end
			whileControl = false;
		} // while end
		for (int i = 0; i < 7; i++)
			System.out.println(userLottoNum[i]);
	}// main method end

}// class end
