package Study2017_11_02;

import java.util.Scanner;

public class GCMTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bigNum, smallNum, remainder;
		boolean whileCont = true;
		boolean bigWhileCont = true;
		while (bigWhileCont) {
			System.out.println("�� ���� �Է��Ͻÿ� : ū�� ������");
			bigNum = scan.nextInt();
			smallNum = scan.nextInt();

			if (bigNum >= smallNum) {
				while (whileCont) {
					if (smallNum == 0) {
						System.out.println("�ִ� ������� " + bigNum + " �Դϴ�");
						whileCont = false;
					} // if end
					else {
						remainder = bigNum % smallNum;
						bigNum = smallNum;
						smallNum = remainder;
					} // else end
				} // while end
				bigWhileCont = false;
			} // if end
			else {
				System.out.println("�ٽ� �Է��� �ֽʽÿ�");
			}
		} // while end
	}// main method end

}// class end
