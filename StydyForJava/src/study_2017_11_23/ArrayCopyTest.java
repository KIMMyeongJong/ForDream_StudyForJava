package study_2017_11_23;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] arr2 = Arrays.copyOf(arr, arr.length);

		System.out.println(arr2[0]);
		
		arr2[1] = 999;
		System.out.println(arr[1]);
		System.out.println(arr2[1]);
		
	}

}
