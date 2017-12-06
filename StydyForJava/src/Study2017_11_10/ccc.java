package Study2017_11_10;

import java.util.Random;

public class ccc {
	Random rand = new Random();
	
	String[] str = {"자바","자바스크립트","일본어 야루 자타동사","일본드라마","책읽기","N3"};
	
	void vivi() {
		System.out.println(str[rand.nextInt(5)]);
	}
}
