package study_2017_11_20;

import java.util.Scanner;

public class SequentialSerch {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int input;
		int[] intArray = { 10, 20, 30, 60, 70, 90, 100 };
		int[] intArray2 = { 10, 50, 40, 30, 20, 40, 20, 10 };
		int notFound1 = 0;
		int notFound2 = 0;

		System.out.println("찾고자하는 값을 입력해주세요");
		input = scan.nextInt();
		
		for (int i = 0; i < intArray.length; i++) {
			if (input == intArray[i]) {
				System.out.println("첫번째 배열에서는" + i + "번째 인덱스가 찾는 값입니다");
				break;
			}else {
				notFound2 = notFound2 + 1;
			}//if end
		} // intArray for end
		if (notFound2 >= intArray.length) {
			System.out.println("첫번째 배열에서는 찾는 값이 없습니다");
		}

		for (int i = 0; i < intArray2.length; i++) {
			if (input == intArray2[i]) {
				System.out.print("두번째 배열에서는 " + i);
				System.out.println("번째 인덱스가 찾는 값입니다");
			} else {
				notFound1 = notFound1 + 1;
			} // else end
		} // intArray2 for end
		if (notFound1 >= intArray2.length) {
			System.out.println("두번째 배열에서는 찾는 값이 없습니다");
		}
	}
}
