package Study2017_10_24;

public class EnumTest {

	public static void main(String[] args) {
		/**************************************************
		 * printWeek = 열거타입을 불러와 출력
		 * nameWeek = 열거객체가 가지는 name 메소드
		 * ordinalWeek = 열거객체가 가지는 ordinalWeek 메소드
		 * valueOfWeek = 열거객체가 가지는 valueOfWeek 메소드
		 * valuesWeek = 열거객체가 가지는 valuesWeek 메소드
		 **************************************************/
		EnumTest test = new EnumTest();
		
		test.printWeek();
		test.nameWeek();
		test.ordinalWeek();
		test.valueOfWeek();
		test.valuesWeek();
	}//end main method

	void printWeek() {
		Week today = Week.TUESDAY;//Week객체중 TUESDAY객체 참조(주소값 저장시켜 가리킴)
		System.out.println("오늘은 " + today + "입니다.");
		System.out.println();
	}//end printWeek method

	void nameWeek() {
		Week today = Week.TUESDAY;//Week객체중 TUESDAY객체 참조
		String name = today.name();//Week객체중 TUESDAY객체 를 문자열로 저장시킴
		System.out.println("오늘은 " + today + "입니다.");
		System.out.println();
	}//end nameWeek method

	void ordinalWeek() {
		Week today = Week.TUESDAY;//Week객체중 TUESDAY객체 참조
		int ordinal = today.ordinal();//ordinal메소드로 today가 가리키는 Week객체가 몇번째 열거객체인지 int타입으로 저장
		System.out.println("오늘은 " + ordinal + "째 날입니다.");
		System.out.println();
	}//end ordinalWeek method

	void valueOfWeek() {
		Week today = Week.valueOf("TUESDAY");//Week객체중 ""안에 들어가 있는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다
		System.out.println("오늘은 " + today + "입니다.");
		System.out.println();
	}//end valueOfWeek method

	void valuesWeek() {
		Week[] days = Week.values();//Week객체들을 배열로 만들어 리턴한다
		for (Week day : days) {	      //향상된 for문으로 배열값을 하나씩 출력
			System.out.println(day);
			System.out.println("---------------------------------");
		}
		System.out.println();
	}//end valuesWeek method
}//end EnumTest class
