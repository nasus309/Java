import java.awt.*;

import javax.swing.*;


public class Component extends JFrame {
	
	Component(){
		
		setDefaultCloseOperation(3); //�����ϸ� �� ����... 1(HIDE)�ϸ� �� â�� ����
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Component control");
		
		Container c = this.getContentPane(); //������ â?(panel?)
		c.setBackground(Color.yellow);
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("��ư 1");
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.magenta);
		this.add(btn1);
		
		JButton btn2 = new JButton("��ư 2");
		btn2.setFont(new Font("�������",Font.BOLD,30));
		btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		btn2.setToolTipText("�� ��ư�� ũ�� ������~");
		this.add(btn2);
		
		
		JButton btn3 = new JButton("��ư 3");
		btn3.setEnabled(false);
		this.add(btn3);
		
		setSize(256,256);
		setVisible(true);
		
		
	}

}
