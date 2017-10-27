package Study2017_10_27;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int multiControl = 0;
		int wantMulti;
		System.out.println("구구단에서 출력하고 싶은 단을 입력하세요");
		wantMulti = scan.nextInt();
		while (multiControl < 9) {
			multiControl++;
			System.out.println(wantMulti + " * " + multiControl + " = " + wantMulti * multiControl);
		}
	}

}
