import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse extends JFrame {
	
	Mouse(){
		setDefaultCloseOperation(3);
		setTitle("���콺 �̺�Ʈ");
		this.setLayout(new FlowLayout());
		
		JTextField txtX = new JTextField(10);
		JTextField txtY = new JTextField(10);
		this.add(txtX);
		this.add(txtY);
		
		//�߻�޼���?
		this.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				txtX.setText(Integer.toString(e.getX()));
				txtY.setText(Integer.toString(e.getY()));
			}
			
			//�ϳ��� ������ �����ߴµ� ����...?
			
			@Override
			public void mousePressed(MouseEvent e) {	
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
		
		setSize(500,200);
		setVisible(true);
		
	}

}
