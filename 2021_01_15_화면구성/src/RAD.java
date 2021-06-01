import java.awt.*;

import javax.swing.*;

public class RAD extends JFrame{
	
	RAD(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������Ʈ ����");
		
		this.setLayout(new FlowLayout());
		
		ImageIcon img1 = new ImageIcon("images/java1.jpg");
		ImageIcon img2 = new ImageIcon("images/java2.jpg");
		
		JButton btn1 = new JButton("��ư 1",img1);
		this.add(btn1);
		
		JLabel lbl1 = new JLabel("���̺� 1�Դϴ�.");
		JLabel lbl2 = new JLabel(img2);
		this.add(lbl1);
		this.add(lbl2);
		
		JCheckBox chk1 = new JCheckBox("C++");
		JCheckBox chk2 = new JCheckBox("Java");
		JCheckBox chk3 = new JCheckBox("C#",true);
		this.add(chk1);
		this.add(chk2);
		this.add(chk3);
		
		JRadioButton rdo1 = new JRadioButton("��");
		JRadioButton rdo2 = new JRadioButton("���");
		JRadioButton rdo3 = new JRadioButton("����");
		
		this.add(rdo1);
		this.add(rdo2);
		this.add(rdo3);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(rdo1);
		grp.add(rdo2);
		grp.add(rdo3);
		
		setSize(200,300);
		setVisible(true);
	}
}
