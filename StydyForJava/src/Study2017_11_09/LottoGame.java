package Study2017_11_09;

import java.util.Random;
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int userLottoNum[] = new int[7];// 사용자 로또 번호 - 입력과 랜덤 지정
		int lottoNum[] = new int[7];// 컴퓨터 로또 번호 - 전체 랜덤지정
		int randCont = 0;// 사용자부터 자동 갯수 지정 받는 변수
		boolean whileControl = true;// while문 제어 변수 - 배열갯수 넘으면 false지정

		System.out.println("자동 번호 갯수 지정");
		randCont = scan.nextInt();
		int userForControl = 0 + randCont;

		for (int i = 0; i < randCont; i++) {
			userLottoNum[i] = rand.nextInt(44) + 1;
		} // for end

		while (whileControl) {

			System.out.println("로또 번호를 입력해 주십시오");

			for (; userForControl < userLottoNum.length-1; userForControl++) {
				userLottoNum[userForControl] = scan.nextInt();
			} // for end
			whileControl = false;
		} // while end
		for (int i = 0; i < 7; i++)
			System.out.println(userLottoNum[i]);
	}// main method end

}// class end
