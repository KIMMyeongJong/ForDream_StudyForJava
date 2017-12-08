package study_2017_12_07;

public class InheritanceClass {
	int firstNum;
	int secondNum;
	int sum = 0;
	
	public void calculateFirstNum() {
		this.firstNum += firstNum;
	}
	public void calculateSecondNum() {
		this.secondNum += secondNum;
	}
	
	public void printData() {
		System.out.println("계산 결과는  " + sum);
	}
}
