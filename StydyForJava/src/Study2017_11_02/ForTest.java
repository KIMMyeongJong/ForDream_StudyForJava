package Study2017_11_02;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bigNum;
		float smallNum;
		int sum = 0;
		int allSum = 0;

		System.out.println("ū���� �������� �Է��� �ֽʽÿ�");
		bigNum = scan.nextInt();
		smallNum = scan.nextInt();
		
		for(int i = (int) smallNum; i<bigNum; i++) {//������ ���� ���� ������ 0���� �����ϴ°��� ���� - �迭�� index�� 0���� �����ϱ� ����
			sum = (int) (smallNum + i);
			allSum = sum + allSum;
		}
		System.out.printf("%4.1f ���� %x ������ ���� %x�Դϴ�",smallNum,bigNum,allSum);
	}
}
