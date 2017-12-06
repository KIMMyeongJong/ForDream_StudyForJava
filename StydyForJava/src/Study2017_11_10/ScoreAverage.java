package Study2017_11_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScoreAverage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.##");

		final int STUDENT = 5;
		double[] average = new double[5];
		double sum = 0;

		for (int i = 0; i < STUDENT; i++) {
			System.out.println(i + 1 + "번째 성적 입력");
			average[i] = scan.nextDouble();
			sum = average[i] + sum;
		} // for end
		System.out.println("성적 평균은 " + form.format(sum / STUDENT));
	}// main method end
}// class end
