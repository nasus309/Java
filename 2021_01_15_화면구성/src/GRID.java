import java.awt.*;

import javax.swing.*;

public class GRID extends JFrame{
	
		GRID(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�׸��巹�̾ƿ� �׽�Ʈ");
			setLayout(new GridLayout(3,3,10,10));
			
			JButton btn[] = new JButton[9];
			
			for(int i=0;i<btn.length;i++) {
				btn[i] = new JButton("��ư " + (i+1));
				this.add(btn[i]);
			}
			
			setSize(512,512);
			setVisible(true);
 		
	}

}
