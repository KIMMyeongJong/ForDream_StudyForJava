package Study2017_11_03;

import java.util.Scanner;

public class MeasureTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input;//Scanner���� �Է¹޴� ����

		System.out.println("���� �Է��Ͻÿ�");
		input = scan.nextInt();//���������� �Է¹���
		System.out.println(input + "�� ����� ������ �����ϴ�");
		
		for (int i = 1; i <= input; i++) {
			if(input%i==0) {
				System.out.print(i+"  ");
			}//if end
		}//for end
	}//main method end

}
