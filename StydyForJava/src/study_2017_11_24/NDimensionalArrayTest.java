package study_2017_11_24;

import java.util.Random;

public class NDimensionalArrayTest {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int sum = 0;
		int [][] arr;
		arr = new int [40][];
		arr [0] = new int [5];
		arr[1] = new int [8];
		arr [2] = new int [10];
		
		for(int i = 3; i<arr.length; i++) {
			arr[i] = new int [rand.nextInt(50)];
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print((i+1) + "¹ø ÇĞ»ı Á¡¼ö  ");
			sum = 0;
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + ",  ");
				sum = sum + arr[i][j];
			}
			System.out.println();
			System.out.println("ÃÑÁ¡ : " + sum + " Æò±Õ : " + sum/arr[i].length);
			System.out.println();
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
