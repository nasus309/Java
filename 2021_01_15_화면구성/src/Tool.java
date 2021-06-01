import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tool extends JFrame{
	Tool(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("���� �����");
		this.setLayout(new FlowLayout());
		
		JToolBar toolBar = new JToolBar();
				
		JMenuItem newItem = new JMenuItem("�� ����");
		JMenuItem openItem = new JMenuItem("����");
		JMenuItem closeItem = new JMenuItem("�ݱ�");
		
		add(toolBar,BorderLayout.NORTH);
		
		toolBar.add(newItem);
		toolBar.add(openItem);
		toolBar.addSeparator(new Dimension(20,10)); //������
		toolBar.add(closeItem);
		
		JLabel lbl = new JLabel("�� ���ڰ� �ٲ�ϴ�.");
		this.add(lbl);
		
		newItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText("[�� ����]�� �����߽��ϴ�.");
			}
		});
		
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText("[����]�� �����߽��ϴ�.");
			}
		});
		
		closeItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		setSize(300,200);
		setVisible(true);
	}
	
}
