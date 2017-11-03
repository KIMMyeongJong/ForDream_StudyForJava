package Study2017_11_03;

public class AGOGTest {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2;i<=9;i++) {
			for(int k = 1;k<=9;k++) {
				sum = i*k;
				System.out.println(i + "°öÇÏ±â" + k + "´Â " + sum);
			}
		}
	}

}
