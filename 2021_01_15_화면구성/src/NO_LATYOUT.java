import javax.swing.*;
import java.awt.*;

public class NO_LATYOUT extends JFrame{
	
	NO_LATYOUT(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���̾ƿ� ����");
		
		this.setLayout(null);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		
		btn1.setBounds(50,50,100,100);
		btn2.setBounds(70,75,100,100);
		btn3.setBounds(100,100,100,100);
		
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		setSize(256,256);
		setVisible(true);
	}
}
