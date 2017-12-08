package study_2017_12_07;

public class Encapsulation {

	public static void main(String[] args) {
		EncapsulationClass enc = new EncapsulationClass();
		
		enc.schoolNum = 1701035;
		enc.name = "김명종";
		enc.schoolScore = 4.21;
		//클래스 외부에서 데이터를 바꾸기 때문에 정보은닉이 되지 않은 상태
	}
}
