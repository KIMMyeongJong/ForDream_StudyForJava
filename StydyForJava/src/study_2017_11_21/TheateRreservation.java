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
			} // 좌석 번호 출력 for end
			System.out.println();
			System.out.println("------------------------------------------");
			for (int i = 0; i < selectArr.length; i++) {
				System.out.print("  " + selectArr[i]);
			} // 좌석 선택 for end
			System.out.println();
			System.out.println("원하는 좌석의 번호를 입력하세요  || 종료 : -1");
			System.out.println("예약 취소시 좌석번호 + 10 을 입력 해 주십시오");

			input = scan.nextInt() - 1;
			if (input < 0) {
				whileCont = false;
				break;
			} // 종료시에는 while을 false로 만들고 break로 while문을 탈출한다
			if (input > selectArr.length * 2 + 1) {
				System.out.println("잘못 선택하셨습니다");
			} else if (input > selectArr.length) {
				input = input - 10;
				if (selectArr[input] == 1) {
					selectArr[input]--;
					System.out.println("취소되었습니다");
				} else {
					System.out.println(input + 1 + "번 자리에는 예약이 되어있지 않습니다");
				}
				// 예약 취소시
			} else if (selectArr[input] == 0) {
				selectArr[input]++;
			} else {
				System.out.println("이미 예약된 자리입니다");
			}
		} // 전체 while end
		System.out.println("종료합니다");

	}

}