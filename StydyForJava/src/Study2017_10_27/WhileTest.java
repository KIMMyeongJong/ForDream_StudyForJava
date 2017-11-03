package Study2017_10_27;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int multiControl = 0;
		int wantMulti;
		System.out.println("구구단에서 출력하고 싶은 단을 입력하세요");
		wantMulti = scan.nextInt();
		
		while (multiControl < 9) {//multiControl이 9보다 작을때 까지 while문을 반복시킨다.
			
			multiControl++;//multiControl을 하나씩 증가
			System.out.println(wantMulti + " * " + multiControl + " = " + wantMulti * multiControl);
			//multiControl이 앞에서 하나씩 더해지기 때문에 multiControl의 초기값을 0으로 놔두고 while의 범위를 9미만으로 정함
			
		}//while end
	}//main method end
}//class end
