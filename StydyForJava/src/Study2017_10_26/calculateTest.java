package Study2017_10_26;

import java.util.Scanner;

public class calculateTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int goal;
		int performance;
		int bonus;
		System.out.println("��ǥ �ݾ��� �Է��Ͻÿ�");
		goal = scan.nextInt();

		System.out.println("������ �Է��ϼ���");
		performance = scan.nextInt();

		if (performance > goal) {
			bonus = (int) ((performance - goal) * 0.1);// 0.1�� ���ԵǾ��� ������ double������ �ٲ��. �� ������ int������ ���� Ÿ�Ժ�ȯ �ؾ���			
			System.out.println("�����޼�");
			System.out.println("���ʽ� : " + bonus);
		} // if end

		else {
			System.out.println("������ �޼����� ���߽��ϴ�.");
		} // else end
	}// main method end

}// class end
