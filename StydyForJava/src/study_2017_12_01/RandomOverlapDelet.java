package study_2017_12_01;

import java.util.Random;

public class RandomOverlapDelet {

	public static void main(String[] args) {
		Random rand = new Random();
		int randnum[] = new int[20];
		randnum[0] = rand.nextInt(20);
		for (int i = 1; i < 20; i++) {
			randnum[i] = rand.nextInt(20);
			System.out.println(i + 1 + "¹øÂ°   :    " + randnum[i]);
			
			for (int x = i - 1; x == i; x++) {
				if (randnum[i] == randnum[x]) {
					System.out.println(x);
					i--;
					break;
				} // if end
			} // compare index for end
			
		} // make random in index end
	}// end main
}// end TsetInt class
