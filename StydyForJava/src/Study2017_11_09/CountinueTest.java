package Study2017_11_09;

public class CountinueTest {

	public static void main(String[] args) {
		String s = "No news is good news";
		int n = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'n' || s.charAt(i) != 'N')
				continue;

			n++;
		}
		System.out.println(n);
	}
}
