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
		}//if end
		else if(gradesScore >= 90) {
			System.out.println("���� : " + Grades.A);//������ ������ ��Ģ�� �ְ� ������ �ʱ� ������ ����Ÿ������ ���� �� ������.
		}//first else if end - scoreA
		else if(gradesScore<90&&gradesScore>=80) {//else if�� ���� if���� ���� ���� ������  gradesScore<90������ �ʿ����� �ʴ�.
			System.out.println("���� : " + Grades.B);
		}//second else if end - scoreB
		else if(gradesScore<80&&gradesScore>=70) {
			System.out.println("���� : " + Grades.C);
		}//third else if end - scoreC
		else if(gradesScore<70&&gradesScore>=60) {
			System.out.println("���� : "+Grades.D);
		}//fourth else if end - scoreD
		else {
			System.out.println("���� : " + Grades.F);
		}//fifth else if end - scoreF
		
	}//main method end

}//class end
