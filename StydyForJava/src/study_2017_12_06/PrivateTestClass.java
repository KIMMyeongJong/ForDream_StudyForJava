package study_2017_12_06;

public class PrivateTestClass {
	private int testA = 10;
	private int testB = 20;

	void plus() {
		int sum = 0;
		sum = testA + testB;
		System.out.println("���� Ŭ���� ������ ���� ����� " + sum + " �Դϴ�.");
	}

	public int getTestA() {
		return testA;
		// �ٸ� Ŭ�������� ������ ���� �˰� ���� ��쳪 ������ ����ϰ� ���� ��� ���������� �Ұ����ϱ� ������ ���Ͻ��� �����ش�
	}

	public void setTestA(int testA) {
		this.testA = testA;
		//�ٸ� Ŭ�������� private���� ���� �ٲٰ� ���� ��� ���������� �Ұ����ϱ� ������ ���� Ÿ���� ������ �޾� �ٲ� �ش�
	}

	public int getTestB() {
		return testB;
	}

	public void setTestB(int testB) {
		this.testB = testB;
	}
}
