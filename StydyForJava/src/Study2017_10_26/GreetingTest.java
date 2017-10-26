package Study2017_10_26;

import java.util.Date;

public class GreetingTest {

	public static void main(String[] args) {
		Date date = new Date();
		int timeHour = date.getHours();
		
		if(timeHour<11) {
			System.out.println("ªªªÏªèª¦ª´ª¶ª¤ªÞª¹¡£");
		}
		else if(timeHour<18) {
			System.out.println("ª³ªóªËªÁªÏ");
		}
		else {
			System.out.println("ªªªäª¹ªßªÊªµª¤");
		}
	}

}
