import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tool extends JFrame{
	Tool(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("툴바 만들기");
		this.setLayout(new FlowLayout());
		
		JToolBar toolBar = new JToolBar();
				
		JMenuItem newItem = new JMenuItem("새 문서");
		JMenuItem openItem = new JMenuItem("열기");
		JMenuItem closeItem = new JMenuItem("닫기");
		
		add(toolBar,BorderLayout.NORTH);
		
		toolBar.add(newItem);
		toolBar.add(openItem);
		toolBar.addSeparator(new Dimension(20,10)); //구분줄
		toolBar.add(closeItem);
		
		JLabel lbl = new JLabel("이 글자가 바뀝니다.");
		this.add(lbl);
		
		newItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText("[새 문서]를 선택했습니다.");
			}
		});
		
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText("[열기]를 선택했습니다.");
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
