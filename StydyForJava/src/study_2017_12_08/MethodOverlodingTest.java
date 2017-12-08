package study_2017_12_08;

public class MethodOverlodingTest {

	public static void main(String[] args) {
		MethodOverlodingClass methodOver = new MethodOverlodingClass();
		
		System.out.println("5 + 6 = "+methodOver.plus(5,6));
		System.out.println("5.5 + 6.1 = "+methodOver.plus(5.5,6.1));
	}

}
