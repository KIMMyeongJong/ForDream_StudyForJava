package study_2017_12_06;

public class PrivateTestMain {

	/*********************************************************************
	 * private ���������ڴ� ������Ű��, �ٸ���Ű�� ������� ������ �޼ҵ带 ������� ���Ѵ�
	 * ���� �ٸ� Ŭ�������� ������ ��� private�� ����Ǿ� �ִ� Ŭ���� ���� �޼ҵ带 ����
	 * ���� �����ϴ� ����� getter�� setter�� �Ἥ ���������� ������ �����ϴ� ����� �ִ�
	 * getter�� setter�� ������ ������ ���콺 - source���� ã�� �� �ִ�
	 * �ѹ��� ����� ��� getter�� ȣ���ϴ� ���� ������ ����ؼ� private�������� ����� ���
	 * ������ �ϳ� ����� �� ������ getter�� ���ϰ��� �����ϴ� ���� ����
	 *********************************************************************/
	
	public static void main(String[] args) {
		PrivateTestClass privateTest = new PrivateTestClass();
		//privateTest.testA = 30;
		//private�� ��ȣ�� ���� �ܺο��� �о�ų� �����ϴ� ���� �Ұ����ϴ�
		
		privateTest.plus();
		//private�����ڰ� ���� �� Ŭ���� ���ο��� ���������� ������ ����� �����ش�
		System.out.println("private TestA�� ���� "+privateTest.getTestA() + "�Դϴ�.");
		//getter�����ڷ� ������ ���������� ������ ���Ϲ��� ���� �����ش�
		System.out.println("private TestA�� ���� "+privateTest.getTestB() + "�Դϴ�.");
		//getter�����ڷ� ������ ���������� ������ ���Ϲ��� ���� �����ش�
		privateTest.setTestA(50);
		//setter�����ڷ� ������ ���� �ٲ� �� �� �ִ�
		privateTest.setTestB(15);
		//setter�����ڷ� ������ ���� �ٲ� �� �� �ִ�
		privateTest.plus();
		//private�����ڰ� ���� �� Ŭ���� ���ο��� ���������� ������ ����� �����ش�
		System.out.println("setter ���� �� private TestA�� ���� "+privateTest.getTestA() + "�Դϴ�.");
		//getter�����ڷ� ������ ���������� ������ ���Ϲ��� ���� �����ش�
		System.out.println("setter ���� �� private TestA�� ���� "+privateTest.getTestB() + "�Դϴ�.");
		//getter�����ڷ� ������ ���������� ������ ���Ϲ��� ���� �����ش�
	}

}
