package study_2017_11_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraySort {

	public static void main(String[] args) {
		Random rand = new Random();

		final int SIZE = 10;
		int[] randArr = new int[SIZE];
		String[] nameArr = { "김명종", "박명종", "기명종", "제갈명종", "구명종", "허명종" };
		for (int i = 0; i < SIZE; i++) {
			randArr[i] = rand.nextInt(500);
		}//랜덤한 수를 배열 갯수만큼 발생시켜 저장하는 for end

		for (int i : randArr) {
			System.out.print("  " + i);
		}//정렬되지 않은 랜덤한 수 배열 출력 for end
		System.out.println();
		Arrays.sort(randArr);
		// Arrays클래스의 sort메소드를 통해 배열을 정렬시킨다
		for (int i : randArr) {
			System.out.print("   " + i);
		}
		System.out.println();
		for (String i : nameArr) {
			System.out.print("   " + i);
		}//정렬되지 않은 배열 출력 for end
		System.out.println();
		Arrays.sort(nameArr);
		for (String i : nameArr) {
			System.out.print("   " + i);
		}//정렬된 이름 배열 출력 for end
	}//main method end

}//class end
