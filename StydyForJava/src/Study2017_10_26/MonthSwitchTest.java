package Study2017_10_26;

import java.util.Scanner;

public class MonthSwitchTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String monthInput;
		System.out.println("���� �Է��� �ּ���");
		monthInput = scan.next();
		switch (monthInput) {
		case "january":
			System.out.println("1");
			break;
		case "fabruary":
			System.out.println("2");
			break;
		case "march":
			System.out.println("3");
			break;
		default:
			System.out.println("�ʹ� ���ƿ�");
			break;
		}
	}

}
