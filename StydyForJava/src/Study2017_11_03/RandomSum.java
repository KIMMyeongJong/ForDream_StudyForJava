package Study2017_11_03;

import java.util.Scanner;

public class RandomSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input;
		int randNum;
		int sum = 0;
		System.out.println("������ �Է��ϼ���");
		input = scan.nextInt();
		
		for(int i = 0; i<=input ; i++) {
			randNum = (int)(Math.random()*100);//������ 100�� ���� �� intŸ������ ���� ��ȯ�� sum���� �� �� �ְ� ��
											       //[���� �������� �Ҽ� 0-1�������� ����]
			sum = sum + randNum;
		}//for end
		System.out.println(sum);//���� ��ü �հ� ���
	}//main method end
}
