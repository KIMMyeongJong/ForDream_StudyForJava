package Study2017_11_07;

import java.awt.*;

import javax.swing.*;
public class GUITest_Frame extends JFrame{
	//JFrame을 상속받아 부모의 메소드를 자유롭게 사용 할 수 있게 한다.
	JFrame frame = new JFrame();
	Button button1 = new Button("click1");
	Button button2 = new Button("click2");
	Button button3 = new Button("click3");
	Button button4 = new Button("click4");

	void basicFrame() {
		setLayout(new FlowLayout());
		
		button1.setSize(100, 100);//위치를 지정 안해주면 겹쳐서 나온다!!
		button2.setSize(100, 100);
		button3.setSize(100, 100);
		button4.setSize(500, 200);
		
		button1.setLocation(0, 0);
		button2.setLocation(100,0);
		button3.setLocation(200, 0);
		button4.setLocation(0, 100);
		frame.add(button1);//frame에 button을 더해준다
		frame.add(button2);//frame에 button을 더해준다
		frame.add(button3);//frame에 button을 더해준다
		frame.setSize(500, 300);
		frame.setLocation(1000, 150);
		frame.setVisible(true);
	}
}
