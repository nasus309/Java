import java.awt.*;
import javax.swing.*;

public class CARD extends JFrame{
	
	CARD(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ī�巹�̾ƿ� �׽�Ʈ");
		setLayout(new CardLayout());
		
		JButton btn1 = new JButton("��ư 1");
		JButton btn2 = new JButton("��ư 2");
		JButton btn3 = new JButton("��ư 3");
		
		
		this.add(btn3);//ó�� ���ذ� ���� �տ� ����...
		this.add(btn1);
		this.add(btn2);
		
		setSize(256,256);
		setVisible(true);
	
		
	}
}
