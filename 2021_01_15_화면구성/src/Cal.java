import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Cal extends JFrame{
	
	
	static void setText(JButton jj,JTextField[] j) {
		
		j[1].setText(jj.getText());
	}
	
	
	Cal(){
		
		setDefaultCloseOperation(3);
		setTitle("°è»ê±â");
		
		setLayout(new GridLayout(5,4));
		
		JButton btn[] = new JButton[16];
		JTextField result[] = new JTextField[4];
		for(int i=0;i<result.length;i++) {
			result[i] = new JTextField();
			this.add(result[i]);
		}
		
		for(int i=0;i<btn.length;i++) {
			
			btn[i] = new JButton();
			btn[i].setFont(new Font("¸¼Àº°íµñ",Font.BOLD,20));
			this.add(btn[i]);
		}
		
		btn[0].setText("7");
		btn[1].setText("8");
		btn[2].setText("9");
		btn[3].setText("+");
		btn[4].setText("6");
		btn[5].setText("4");
		btn[6].setText("5");
		btn[7].setText("-");
		btn[8].setText("1");
		btn[9].setText("2");
		btn[10].setText("3");
		btn[11].setText("*");
		btn[13].setText("0");
		btn[15].setText("/");
		
		btn[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setText(btn[7],result);
			}
		});
		
		
		btn[8].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(result[0]==null) {
					result[0].setText(String.valueOf(Integer.parseInt(btn[8].getText())));
				}else {
					result[0].setText(result[0].getText()+btn[8].getText());
				}
			}
		});
		
		setSize(512,512);
		setVisible(true);
	}
}
