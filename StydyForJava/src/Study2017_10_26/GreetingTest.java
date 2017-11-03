package Study2017_10_26;

import java.util.Date;

public class GreetingTest {

	public static void main(String[] args) {
		Date date = new Date();//Date 객체 생성(java.util에서 지원하는 클래스)
		int timeHour = date.getHours();//Date클래스의 getHours메소드로 현재시간 입력받아 저장
		int date1 = date.getDate();
		System.out.println(date1);
		
		if(timeHour<11) {
			System.out.println("おはようございます。");
		}//if end
		else if(timeHour<18) {
			System.out.println("こんにちは");
		}//else if end
		else {
			System.out.println("おやすみなさい");
		}//else end
	}//main method end

}//end class
