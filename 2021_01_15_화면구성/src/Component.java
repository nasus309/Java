import java.awt.*;

import javax.swing.*;


public class Component extends JFrame {
	
	Component(){
		
		setDefaultCloseOperation(3); //종료하면 다 꺼짐... 1(HIDE)하면 그 창이 꺼짐
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Component control");
		
		Container c = this.getContentPane(); //현재의 창?(panel?)
		c.setBackground(Color.yellow);
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼 1");
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.magenta);
		this.add(btn1);
		
		JButton btn2 = new JButton("버튼 2");
		btn2.setFont(new Font("맑은고딕",Font.BOLD,30));
		btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		btn2.setToolTipText("이 버튼은 크게 보여요~");
		this.add(btn2);
		
		
		JButton btn3 = new JButton("버튼 3");
		btn3.setEnabled(false);
		this.add(btn3);
		
		setSize(256,256);
		setVisible(true);
		
		
	}

}
