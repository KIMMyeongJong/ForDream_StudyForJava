package Study2017_11_07;

import java.awt.*;

import javax.swing.*;
public class GUITest_Frame extends JFrame{
	//JFrame�� ��ӹ޾� �θ��� �޼ҵ带 �����Ӱ� ��� �� �� �ְ� �Ѵ�.
	JFrame frame = new JFrame();
	Button button1 = new Button("click1");
	Button button2 = new Button("click2");
	Button button3 = new Button("click3");
	Button button4 = new Button("click4");

	void basicFrame() {
		setLayout(new FlowLayout());
		
		button1.setSize(100, 100);//��ġ�� ���� �����ָ� ���ļ� ���´�!!
		button2.setSize(100, 100);
		button3.setSize(100, 100);
		button4.setSize(500, 200);
		
		button1.setLocation(0, 0);
		button2.setLocation(100,0);
		button3.setLocation(200, 0);
		button4.setLocation(0, 100);
		frame.add(button1);//frame�� button�� �����ش�
		frame.add(button2);//frame�� button�� �����ش�
		frame.add(button3);//frame�� button�� �����ش�
		frame.setSize(500, 300);
		frame.setLocation(1000, 150);
		frame.setVisible(true);
	}
}
