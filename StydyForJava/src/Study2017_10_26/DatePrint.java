package Study2017_10_26;

import java.util.Scanner;

public class DatePrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;
		int date;
		int switchControl;

		System.out.println("���� �Է��ϼ���");
		switchControl = scan.nextInt();
		if (switchControl < 13) {
			switch (switchControl) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31�ϱ��� �ֽ��ϴ�.");
				break;
			case 2:
				System.out.println("28�ϱ��� �ֽ��ϴ�.");
				break;
			default:
				System.out.println("30�� ���� �ֽ��ϴ�.");
				break;
			}
		}
	}

}
