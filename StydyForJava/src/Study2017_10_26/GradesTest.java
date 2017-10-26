package Study2017_10_26;

import java.util.Scanner;

public class GradesTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int gradesScore;
		System.out.println("점수를 입력하시오");
		gradesScore = scan.nextInt();
		
		if(gradesScore>100) {
			System.out.println("성적이 이상합니다");
		}
		else if(gradesScore >= 90) {
			System.out.println("학점 : " + Grades.A);
		}
		else if(gradesScore<90&&gradesScore>=80) {
			System.out.println("학점 : " + Grades.B);
		}
		else if(gradesScore<80&&gradesScore>=70) {
			System.out.println("학점 : " + Grades.C);
		}
		else if(gradesScore<70&&gradesScore>=60) {
			System.out.println("학점 : "+Grades.D);
		}
		else {
			System.out.println("학점 : " + Grades.F);
		}
		
	}

}
