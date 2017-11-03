package Study2017_11_03;

import java.util.Random;
import java.util.Scanner;

public class RandomStarMake {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int randNum;
		
		for(int i = 0; i<=20; i++) {
			for(int k = 0; k<50; k++) {
				randNum = rand.nextInt(2);
				if(k==49) {
					System.out.println();
				}
				if(randNum==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
		}
	}

}
