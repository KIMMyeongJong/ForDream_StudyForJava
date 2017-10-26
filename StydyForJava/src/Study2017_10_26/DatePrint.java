package Study2017_10_26;

import java.util.Scanner;

public class DatePrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;
		int date;
		int switchControl;

		System.out.println("달을 입력하세요");
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
				System.out.println("31일까지 있습니다.");
				break;
			case 2:
				System.out.println("28일까지 있습니다.");
				break;
			default:
				System.out.println("30일 까지 있습니다.");
				break;
			}
		}
	}

}
