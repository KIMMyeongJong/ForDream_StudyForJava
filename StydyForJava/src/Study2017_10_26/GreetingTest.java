package Study2017_10_26;

import java.util.Date;

public class GreetingTest {

	public static void main(String[] args) {
		Date date = new Date();
		int timeHour = date.getHours();
		
		if(timeHour<11) {
			System.out.println("���Ϫ誦�������ު���");
		}
		else if(timeHour<18) {
			System.out.println("����˪���");
		}
		else {
			System.out.println("���䪹�ߪʪ���");
		}
	}

}
