package study_2017_12_06;

public class PrivateTestClass {
	private int testA = 10;
	private int testB = 20;

	void plus() {
		int sum = 0;
		sum = testA + testB;
		System.out.println("같은 클래스 내에서 연산 결과는 " + sum + " 입니다.");
	}

	public int getTestA() {
		return testA;
		// 다른 클래스에서 변수의 값을 알고 싶을 경우나 변수를 사용하고 싶을 경우 직접접근이 불가능하기 때문에 리턴시켜 보여준다
	}

	public void setTestA(int testA) {
		this.testA = testA;
		//다른 클래스에서 private변수 값을 바꾸고 싶을 경우 직접접근이 불가능하기 때문에 같은 타입의 변수를 받아 바꿔 준다
	}

	public int getTestB() {
		return testB;
	}

	public void setTestB(int testB) {
		this.testB = testB;
	}
}
