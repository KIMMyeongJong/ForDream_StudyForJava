package Study2017_11_02;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bigNum;
		float smallNum;
		int sum = 0;
		int allSum = 0;

		System.out.println("큰수와 작은수를 입력해 주십시오");
		bigNum = scan.nextInt();
		smallNum = scan.nextInt();
		
		for(int i = (int) smallNum; i<bigNum; i++) {//가급적 포문 제어 변수는 0부터 시작하는것이 좋다 - 배열의 index가 0부터 시작하기 때문
			sum = (int) (smallNum + i);
			allSum = sum + allSum;
		}
		System.out.printf("%4.1f 부터 %x 까지의 합은 %x입니다",smallNum,bigNum,allSum);
	}
}
