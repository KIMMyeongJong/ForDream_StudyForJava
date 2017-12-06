package Study2017_11_07;

public class StaticTest {
	static String name = "김명종";// 초기값이 입력된 static 변수
	static String studentID = "1701035";// 초기값이 입력된 static 변수
	static String info;// 초기화 시킨 static 변수

	static {
		info = name + "-" + studentID;// 정적블록에서 초기화된 변수에 name과 studentID 필드값을 연결해 초기값으로 지정
	}
}
