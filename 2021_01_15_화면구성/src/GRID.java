import java.awt.*;

import javax.swing.*;

public class GRID extends JFrame{
	
		GRID(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("그리드레이아웃 테스트");
			setLayout(new GridLayout(3,3,10,10));
			
			JButton btn[] = new JButton[9];
			
			for(int i=0;i<btn.length;i++) {
				btn[i] = new JButton("버튼 " + (i+1));
				this.add(btn[i]);
			}
			
			setSize(512,512);
			setVisible(true);
 		
	}

}
