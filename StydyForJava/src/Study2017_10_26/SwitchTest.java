package Study2017_10_26;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		/***************************************************
		 * switch�� �׽�Ʈ
		 * ������ case���� break�� ������ ���� case���� break�� ���� �� ���� ����
		 * break�� ���� case���� ������ ������ �� �ִ�
		 * case���� ������ �����Ű�� Ű���� ������ ����
		 ****************************************************/
		Scanner scan = new Scanner(System.in);
		int switchControl;
		switchControl = scan.nextInt();
		
		System.out.println("���ڸ� �Է��� �ּ���");
		switchControl = scan.nextInt();
		switch (switchControl) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("����");
			break;
		default:
			System.out.println("���ڰ� �ʹ� Ŀ��");
			break;
		}//switch end
	}//main method end

}//class end
