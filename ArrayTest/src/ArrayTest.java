import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("1번");
		list.add("2번");
		list.add("3번");
		list.add("4번");
		list.add("5번");
		
		for(int i = 6; i<=10; i++) {
			list.add(i + "번");
		}
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
