package Study2017_10_26;

import java.util.Date;

public class GreetingTest {

	public static void main(String[] args) {
		Date date = new Date();//Date ��ü ����(java.util���� �����ϴ� Ŭ����)
		int timeHour = date.getHours();//DateŬ������ getHours�޼ҵ�� ����ð� �Է¹޾� ����
		int date1 = date.getDate();
		System.out.println(date1);
		
		if(timeHour<11) {
			System.out.println("���Ϫ誦�������ު���");
		}//if end
		else if(timeHour<18) {
			System.out.println("����˪���");
		}//else if end
		else {
			System.out.println("���䪹�ߪʪ���");
		}//else end
	}//main method end

}//end class
