package Study2017_11_09;

import java.util.Scanner;

public class ArrayMaximumMinimum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arrayTest = new int[10];
		int j = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1+"번째 숫자 입력");
			arrayTest[i] = scan.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 10; k++) {
				j = k + 1;
				if (arrayTest[k] > arrayTest[j]) {
					arrayTest[k] = arrayTest[j];
					arrayTest[j] = arrayTest[k];
				}
			}
		}
		System.out.println(arrayTest[0]);
	}

}
