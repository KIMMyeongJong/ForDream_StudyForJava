package Study2017_10_27;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int multiControl = 0;
		int wantMulti;
		System.out.println("�����ܿ��� ����ϰ� ���� ���� �Է��ϼ���");
		wantMulti = scan.nextInt();
		
		while (multiControl < 9) {//multiControl�� 9���� ������ ���� while���� �ݺ���Ų��.
			
			multiControl++;//multiControl�� �ϳ��� ����
			System.out.println(wantMulti + " * " + multiControl + " = " + wantMulti * multiControl);
			//multiControl�� �տ��� �ϳ��� �������� ������ multiControl�� �ʱⰪ�� 0���� ���ΰ� while�� ������ 9�̸����� ����
			
		}//while end
	}//main method end
}//class end
