package Study2017_11_04;

import java.util.Scanner;

public class AccurateMonth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input;
		boolean whileControl = true;
		while (whileControl) {	//while조건에 조건식을 잘 적으면 if문으로 빠져나가지 않아도 된다
			System.out.print("올바른 월을 입력하시요 : ");
			input = scan.nextInt();

			if (input > 0 && input < 13) {
				System.out.println("사용자가 입력한 월은 " + input);
				whileControl = false;
			}//if end
		} // while end
	}

}
