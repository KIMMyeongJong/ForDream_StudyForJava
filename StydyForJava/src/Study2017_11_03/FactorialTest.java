package Study2017_11_03;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input;
		int sum = 0;
		int multiSum = 0;
		
		System.out.println("����� ���� �Է� �� �ֽʽÿ�");
		input = scan.nextInt();
		
		for(int i = 1; i<=input; i++) {
			multiSum = input * (input-i);
			System.out.println(sum);
			sum = multiSum * sum;
		}
		System.out.println(sum);
	}

}
