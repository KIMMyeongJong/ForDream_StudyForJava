package Study2017_11_10;

import java.util.Random;

public class PizzaMake {

	public static void main(String[] args) {
		Random rand = new Random();
		ccc cc = new ccc();
		String[] toppings = { "pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon" };

		for (int k = 0; k < 5; k++) {
			int i = rand.nextInt(4);
			System.out.println("����� ���� ������ " + toppings[i] + "�Դϴ�.");
		}//for end
		for(int i = 0; i<20;i++)
		cc.vivi();
	}//main method end
}//class end
