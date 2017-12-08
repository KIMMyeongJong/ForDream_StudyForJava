package study_2017_12_06;

public class PrivateTestMain {

	/*********************************************************************
	 * private 접근제한자는 동일패키지, 다른패키지 상관없이 변수와 메소드를 사용하지 못한다
	 * 따라서 다른 클래스에서 접근할 경우 private가 선언되어 있는 클래스 내의 메소드를 통해
	 * 직접 연산하는 방법과 getter과 setter을 써서 간접적으로 변수에 접근하는 방법이 있다
	 * getter과 setter은 변수에 오른쪽 마우스 - source에서 찾을 수 있다
	 * 한번만 사용할 경우 getter을 호출하는 것이 나으나 계속해서 private변수값을 사용할 경우
	 * 변수를 하나 만들어 그 변수에 getter의 리턴값을 저장하는 것이 낫다
	 *********************************************************************/
	
	public static void main(String[] args) {
		PrivateTestClass privateTest = new PrivateTestClass();
		//privateTest.testA = 30;
		//private로 보호된 값은 외부에서 읽어가거나 설정하는 것이 불가능하다
		
		privateTest.plus();
		//private연산자가 선언 된 클래스 내부에서 직접적으로 연산해 결과를 보여준다
		System.out.println("private TestA의 값은 "+privateTest.getTestA() + "입니다.");
		//getter연산자로 변수에 간접적으로 접근해 리턴받은 값을 보여준다
		System.out.println("private TestA의 값은 "+privateTest.getTestB() + "입니다.");
		//getter연산자로 변수에 간접적으로 접근해 리턴받은 값을 보여준다
		privateTest.setTestA(50);
		//setter연산자로 변수의 값을 바꿔 줄 수 있다
		privateTest.setTestB(15);
		//setter연산자로 변수의 값을 바꿔 줄 수 있다
		privateTest.plus();
		//private연산자가 선언 된 클래스 내부에서 직접적으로 연산해 결과를 보여준다
		System.out.println("setter 적용 후 private TestA의 값은 "+privateTest.getTestA() + "입니다.");
		//getter연산자로 변수에 간접적으로 접근해 리턴받은 값을 보여준다
		System.out.println("setter 적용 후 private TestA의 값은 "+privateTest.getTestB() + "입니다.");
		//getter연산자로 변수에 간접적으로 접근해 리턴받은 값을 보여준다
	}

}
