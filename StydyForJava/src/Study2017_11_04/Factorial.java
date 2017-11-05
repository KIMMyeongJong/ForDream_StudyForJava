package Study2017_11_04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input;
		int sum = 1;
		int sum2 = 1;

		System.out.println("정수 입력");
		input = scan.nextInt();
		for (int i = 1; i <= input; i++) {
			sum = (input - i) * sum;
			sum2 = sum2 * i;
		}
		System.out.println(sum);
		System.out.println(sum2);
	}
}
