package Study2017_10_26;

import java.util.Scanner;

public class MonthSwitchTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String monthInput;
		System.out.println("월을 입력해 주세요");
		monthInput = scan.next();
		
		switch (monthInput) {//jdk7부터 문자열타입도 switch지원
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
			System.out.println("너무 많아요");
			break;
		}//end switch
	}//main method end

}//class end
