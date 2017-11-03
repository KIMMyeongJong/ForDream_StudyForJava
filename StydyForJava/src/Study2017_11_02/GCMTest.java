package Study2017_11_02;

import java.util.Scanner;

public class GCMTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bigNum, smallNum, remainder;
		boolean whileCont = true;
		boolean bigWhileCont = true;
		while (bigWhileCont) {
			System.out.println("두 수를 입력하시오 : 큰수 작은수");
			bigNum = scan.nextInt();
			smallNum = scan.nextInt();

			if (bigNum >= smallNum) {
				while (whileCont) {
					if (smallNum == 0) {
						System.out.println("최대 공약수는 " + bigNum + " 입니다");
						whileCont = false;
					} // if end
					else {
						remainder = bigNum % smallNum;
						bigNum = smallNum;
						smallNum = remainder;
					} // else end
				} // while end
				bigWhileCont = false;
			} // if end
			else {
				System.out.println("다시 입력해 주십시오");
			}
		} // while end
	}// main method end

}// class end
