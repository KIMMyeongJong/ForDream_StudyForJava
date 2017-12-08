package study_2017_12_07;

public class EncapsulationClass {
	/****************************************
	 * 같은 변수를 다루는 메소드 들을 하나로 묶은 것이 클래스
	 * 
	 ***************************************/
	int schoolNum;
	String name;
	double schoolScore;
	
	public void printDate() {
		System.out.println("학번은 " + schoolNum);
		System.out.println("이름은 " + name);
		System.out.println("학점은 " + schoolNum);
	}
}
