package study_2017_12_08;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

//		String s1, s2;
//		s1 = new String("Hello");
//		s2 = new String("Hello");
//
//		if (s1.equals(s2)) {
//			System.out.println("�� ���ڿ��� ����");
//		} else {
//			System.out.println("�� ���ڿ��� �ٸ���");
//		}
		
		String proverb = "A barking Dog";
		String s1,s2,s3,s4,s5,s6;
		
		System.out.println("���ڿ��� ���� : " + proverb.length());
		
		s1 = proverb.concat(" never bites");
		s2 = proverb.replace('b', 'a');
		s3 = proverb.substring(2, 5);
		s4 = proverb.toUpperCase();
		s5 = proverb.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int selectNum = Integer.parseInt(str);
		System.out.println(" �Է� �� ���ڴ� "+selectNum);
		
		
	}//main method end
}//class end
