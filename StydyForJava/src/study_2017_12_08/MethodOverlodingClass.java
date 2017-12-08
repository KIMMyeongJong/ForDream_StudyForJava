package study_2017_12_08;

public class MethodOverlodingClass {
	
	int sum = 0;
	double sum2 = 0;
	int plus(int f, int s) {
		sum = f+s;
		return sum;
	}
	
	double plus(double f , double s) {
		sum2 = f+s;
		return sum2;
	}
}
