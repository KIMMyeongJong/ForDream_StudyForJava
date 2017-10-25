package Study2017_10_25;

public class ForTest {

	public static void main(String[] args) {
		/***********************************************
		 * existingFor = ������ for��
		 * improvingFor = ���� for��
		 * ������ for�������� �迭�� ����Ҷ� ���̸� for�� ��� ���
		 * for�� �������� ���̸� ȣ���ؾ� �Ѵٴ� ���� ����
		 * �̰��� ���ֱ� ���� ����ϴ°��� ���� for��
		 ***********************************************/
		ForTest forTest = new ForTest();
		forTest.existingFor();
		forTest.improvingFor();
	}

	void existingFor() {
		for (int i = 0; i < 10; i++) {//i�� 10���� ������ for���� ����
			System.out.println(i);
		}
	}

	void improvingFor() {
		int array[] = { 10, 20, 30, 40, 50, 60 };//�迭����
		for (int i : array) {//�迭�� �׸��� ������� ���� ���� i�� ����
			System.out.println(i);
		}
	}
}
