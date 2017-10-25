package Study2017_10_25;

public class ForTest {

	public static void main(String[] args) {
		/***********************************************
		 * existingFor = 기존의 for문
		 * improvingFor = 향상된 for문
		 * 기존의 for문에서는 배열을 출력할때 길이를 for문 제어에 사용
		 * for문 돌때마다 길이를 호출해야 한다는 단점 존재
		 * 이것을 없애기 위해 사용하는것이 향상된 for문
		 ***********************************************/
		ForTest forTest = new ForTest();
		forTest.existingFor();
		forTest.improvingFor();
	}

	void existingFor() {
		for (int i = 0; i < 10; i++) {//i가 10보다 작을때 for문을 실행
			System.out.println(i);
		}
	}

	void improvingFor() {
		int array[] = { 10, 20, 30, 40, 50, 60 };//배열선언
		for (int i : array) {//배열의 항목을 순서대로 꺼내 변수 i에 대입
			System.out.println(i);
		}
	}
}
