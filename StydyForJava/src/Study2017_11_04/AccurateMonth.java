package Study2017_11_04;

import java.util.Scanner;

public class AccurateMonth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input;
		boolean whileControl = true;
		while (whileControl) {	//while���ǿ� ���ǽ��� �� ������ if������ ���������� �ʾƵ� �ȴ�
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� : ");
			input = scan.nextInt();

			if (input > 0 && input < 13) {
				System.out.println("����ڰ� �Է��� ���� " + input);
				whileControl = false;
			}//if end
		} // while end
	}

}
