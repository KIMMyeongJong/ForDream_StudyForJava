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
		}//if end
		else if(gradesScore >= 90) {
			System.out.println("학점 : " + Grades.A);//학점은 정해진 규칙이 있고 변하지 않기 때문에 열거타입으로 생성 후 가져옴.
		}//first else if end - scoreA
		else if(gradesScore<90&&gradesScore>=80) {//else if는 앞의 if문을 거쳐 오기 때문에  gradesScore<90조건이 필요하지 않다.
			System.out.println("학점 : " + Grades.B);
		}//second else if end - scoreB
		else if(gradesScore<80&&gradesScore>=70) {
			System.out.println("학점 : " + Grades.C);
		}//third else if end - scoreC
		else if(gradesScore<70&&gradesScore>=60) {
			System.out.println("학점 : "+Grades.D);
		}//fourth else if end - scoreD
		else {
			System.out.println("학점 : " + Grades.F);
		}//fifth else if end - scoreF
		
	}//main method end

}//class end
