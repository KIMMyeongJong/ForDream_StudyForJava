package Study2017_11_04;

public class MethodTest_MethodCollection {
	int plus(int x, int y) {//int값을 두개 받아
		int result = x+y;//result에 받은 두값을 연산한 결과를 넣고
		return result;//result를 리턴시킨다
	}
	
	double avg(int x, int y) {//int값을 두개를 받아
		double sum = plus(x, y);//두 변수를 plus메소드를 호출해 계산하고 sum에 넣는다
		double result = sum / 2;//sum에 들어가있는 plus로 계산된 값을 result에 넣는다
		return result;//result를 리턴시킨다
	}
	
	void execute() {//메인메소드에서 부르는 메소드
		double result = avg(10,7);
		println("실행결과 : " + result);
		//print는 콘솔창에 문자열을 출력하는 동작을 하는 메소드
	}
	
	void println(String message) {//메세지를 출력한다.
		System.out.println(message);
	}

}
