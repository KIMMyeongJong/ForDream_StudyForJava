package Study2017_11_04;

public class MethodTest_MethodCollection {
	int plus(int x, int y) {//int���� �ΰ� �޾�
		int result = x+y;//result�� ���� �ΰ��� ������ ����� �ְ�
		return result;//result�� ���Ͻ�Ų��
	}
	
	double avg(int x, int y) {//int���� �ΰ��� �޾�
		double sum = plus(x, y);//�� ������ plus�޼ҵ带 ȣ���� ����ϰ� sum�� �ִ´�
		double result = sum / 2;//sum�� ���ִ� plus�� ���� ���� result�� �ִ´�
		return result;//result�� ���Ͻ�Ų��
	}
	
	void execute() {//���θ޼ҵ忡�� �θ��� �޼ҵ�
		double result = avg(10,7);
		println("������ : " + result);
		//print�� �ܼ�â�� ���ڿ��� ����ϴ� ������ �ϴ� �޼ҵ�
	}
	
	void println(String message) {//�޼����� ����Ѵ�.
		System.out.println(message);
	}

}
