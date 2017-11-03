package Study2017_11_03;

import java.util.Random;
import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int randNum;
		for(int i = 0; i<=20; i++) {
			for(int k = 0; k<=50; k++) {
				
				randNum = rand.nextInt(26)+65;
				System.out.printf("%c",randNum);
				if(k==49) {
					System.out.println();
				}
			}
		}
	}

}
