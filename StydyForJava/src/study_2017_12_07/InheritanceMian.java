package study_2017_12_07;

public class InheritanceMian {

	public static void main(String[] args) {
		InheritanceClass inher = new InheritanceClass();
		InheritanceExtends A = new InheritanceExtends();
		InheritanceExtendsB B = new InheritanceExtendsB();
		
		A.Multiply();
		B.Division();
		A.printData();
		B.printData();
	}
}
