package Study2017_10_26;

import java.util.Scanner;

public class GradesTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int gradesScore;
		System.out.println("������ �Է��Ͻÿ�");
		gradesScore = scan.nextInt();
		
		if(gradesScore>100) {
			System.out.println("������ �̻��մϴ�");
		}
		else if(gradesScore >= 90) {
			System.out.println("���� : " + Grades.A);
		}
		else if(gradesScore<90&&gradesScore>=80) {
			System.out.println("���� : " + Grades.B);
		}
		else if(gradesScore<80&&gradesScore>=70) {
			System.out.println("���� : " + Grades.C);
		}
		else if(gradesScore<70&&gradesScore>=60) {
			System.out.println("���� : "+Grades.D);
		}
		else {
			System.out.println("���� : " + Grades.F);
		}
		
	}

}
