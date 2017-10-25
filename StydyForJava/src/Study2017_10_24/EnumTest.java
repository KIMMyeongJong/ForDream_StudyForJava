package Study2017_10_24;

public class EnumTest {

	public static void main(String[] args) {
		/**************************************************
		 * printWeek = ����Ÿ���� �ҷ��� ���
		 * nameWeek = ���Ű�ü�� ������ name �޼ҵ�
		 * ordinalWeek = ���Ű�ü�� ������ ordinalWeek �޼ҵ�
		 * valueOfWeek = ���Ű�ü�� ������ valueOfWeek �޼ҵ�
		 * valuesWeek = ���Ű�ü�� ������ valuesWeek �޼ҵ�
		 **************************************************/
		EnumTest test = new EnumTest();
		
		test.printWeek();
		test.nameWeek();
		test.ordinalWeek();
		test.valueOfWeek();
		test.valuesWeek();
	}//end main method

	void printWeek() {
		Week today = Week.TUESDAY;//Week��ü�� TUESDAY��ü ����(�ּҰ� ������� ����Ŵ)
		System.out.println("������ " + today + "�Դϴ�.");
		System.out.println();
	}//end printWeek method

	void nameWeek() {
		Week today = Week.TUESDAY;//Week��ü�� TUESDAY��ü ����
		String name = today.name();//Week��ü�� TUESDAY��ü �� ���ڿ��� �����Ŵ
		System.out.println("������ " + today + "�Դϴ�.");
		System.out.println();
	}//end nameWeek method

	void ordinalWeek() {
		Week today = Week.TUESDAY;//Week��ü�� TUESDAY��ü ����
		int ordinal = today.ordinal();//ordinal�޼ҵ�� today�� ����Ű�� Week��ü�� ���° ���Ű�ü���� intŸ������ ����
		System.out.println("������ " + ordinal + "° ���Դϴ�.");
		System.out.println();
	}//end ordinalWeek method

	void valueOfWeek() {
		Week today = Week.valueOf("TUESDAY");//Week��ü�� ""�ȿ� �� �ִ� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� �����Ѵ�
		System.out.println("������ " + today + "�Դϴ�.");
		System.out.println();
	}//end valueOfWeek method

	void valuesWeek() {
		Week[] days = Week.values();//Week��ü���� �迭�� ����� �����Ѵ�
		for (Week day : days) {	      //���� for������ �迭���� �ϳ��� ���
			System.out.println(day);
			System.out.println("---------------------------------");
		}
		System.out.println();
	}//end valuesWeek method
}//end EnumTest class
