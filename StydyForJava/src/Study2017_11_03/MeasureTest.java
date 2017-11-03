package Study2017_11_03;

import java.util.Scanner;

public class MeasureTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input;//Scanner으로 입력받는 변수

		System.out.println("수를 입력하시오");
		input = scan.nextInt();//정수값으로 입력받음
		System.out.println(input + "의 약수는 다음과 같습니다");
		
		for (int i = 1; i <= input; i++) {
			if(input%i==0) {
				System.out.print(i+"  ");
			}//if end
		}//for end
	}//main method end

}
