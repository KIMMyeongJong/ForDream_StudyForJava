package Study2017_11_03;

import javax.swing.*;

public class WindowTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");

		f.setSize(500, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기 버튼 누르면 나가기
		f.setVisible(true);

		JFrame f2 = new JFrame("Frame Test");

		f2.setSize(200, 800);
		f2.setVisible(true);
	}

}
