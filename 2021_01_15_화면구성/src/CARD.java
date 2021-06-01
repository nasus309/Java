import java.awt.*;
import javax.swing.*;

public class CARD extends JFrame{
	
	CARD(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("카드레이아웃 테스트");
		setLayout(new CardLayout());
		
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		
		
		this.add(btn3);//처음 써준게 제일 앞에 나옴...
		this.add(btn1);
		this.add(btn2);
		
		setSize(256,256);
		setVisible(true);
	
		
	}
}
