package Study2017_11_07;

public class StaticTest {
	static String name = "�����";// �ʱⰪ�� �Էµ� static ����
	static String studentID = "1701035";// �ʱⰪ�� �Էµ� static ����
	static String info;// �ʱ�ȭ ��Ų static ����

	static {
		info = name + "-" + studentID;// ������Ͽ��� �ʱ�ȭ�� ������ name�� studentID �ʵ尪�� ������ �ʱⰪ���� ����
	}
}
