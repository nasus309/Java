import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame{
	Menu(){
		setDefaultCloseOperation(1);
		setTitle("�޴� �����");
		this.setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("�� ���ڰ� �ٲ�ϴ�.");
		this.add(lbl);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("����");
		JMenu editMenu = new JMenu("����");
		
		JMenuItem newItem = new JMenuItem("�� ����");
		JMenuItem openItem = new JMenuItem("����");
		JMenuItem closeItem = new JMenuItem("�ݱ�");
		
		setJMenuBar(menuBar);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator(); //������
		fileMenu.add(closeItem);
		
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
