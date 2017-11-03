package Study2017_11_03;

import java.util.Scanner;

public class RandomSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input;
		int randNum;
		int sum = 0;
		System.out.println("정수를 입력하세요");
		input = scan.nextInt();
		
		for(int i = 0; i<=input ; i++) {
			randNum = (int)(Math.random()*100);//난수에 100을 곱한 후 int타입으로 강제 변환해 sum값에 들어갈 수 있게 함
											       //[원래 랜덤값은 소수 0-1까지중의 난수]
			sum = sum + randNum;
		}//for end
		System.out.println(sum);//랜덤 전체 합계 출력
	}//main method end
}
