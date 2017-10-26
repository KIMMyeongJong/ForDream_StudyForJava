package Study2017_10_26;

import java.util.Scanner;

public class calculateTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int goal;
		int performance;
		int bonus;
		System.out.println("목표 금액을 입력하시오");
		goal = scan.nextInt();

		System.out.println("실적을 입력하세요");
		performance = scan.nextInt();

		if (performance > goal) {
			bonus = (int) ((performance - goal) * 0.1);
			System.out.println("실적달성");
			System.out.println("보너스 : " + bonus);
		} // if end
		else {
			System.out.println("실적을 달성하지 못했습니다.");
		}//else end
	}//main method end

}//class end
