package Study2017_10_26;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		/***************************************************
		 * switch문 테스트
		 * 각각의 case에서 break가 없으면 밑의 case들을 break를 만날 때 까지 실행
		 * break가 없는 case문은 범위를 제어할 수 있다
		 * case에서 범위를 제어시키면 키보드 맵핑이 용이
		 ****************************************************/
		Scanner scan = new Scanner(System.in);
		int switchControl;
		switchControl = scan.nextInt();
		
		System.out.println("숫자를 입력해 주세요");
		switchControl = scan.nextInt();
		switch (switchControl) {
		case 0:
			System.out.println("ゼロ");
			break;
		case 1:
			System.out.println("いち");
			break;
		case 2:
			System.out.println("に");
			break;
		case 3:
			System.out.println("さん");
			break;
		default:
			System.out.println("숫자가 너무 커요");
			break;
		}//switch end
	}//main method end

}//class end
