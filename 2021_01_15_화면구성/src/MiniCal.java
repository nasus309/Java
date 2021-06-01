import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MiniCal extends JFrame {
	
	MiniCal(){
		setDefaultCloseOperation(3);
		setTitle("미니계산기");
		
		setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("첫번째 수");
		JLabel label2 = new JLabel("두번째 수");
		JLabel label3 = new JLabel("   결과       ");
		
		JTextField textField1 = new JTextField(10);
		JTextField textField2 = new JTextField(10);
		JTextField textField3 = new JTextField(10);
		
		JButton btn_plus = new JButton("+");
		JButton btn_minus = new JButton("-");
		JButton btn_multi = new JButton("*");
		JButton btn_div = new JButton("/");
		JButton btn_clear = new JButton("C");
		
		this.add(label1);
		this.add(textField1);
		this.add(label2);
		this.add(textField2);
		this.add(label3);
		this.add(textField3);
		
		this.add(btn_plus);
		this.add(btn_minus);
		this.add(btn_multi);
		this.add(btn_div);
		this.add(btn_clear);
		
		
		
		//ActionLisner a = new ActionListener();
															//클릴할때마다만 필요하기때문에 일회성! 메모리를 차지하기때문에 굳이 위해서 만들어줄 필요가 없음.
		btn_plus.addActionListener(new ActionListener() {  //object 생성...ActionListener의 actionPerformed 메소드?
			@Override
			public void actionPerformed(ActionEvent e) {   //ActionListener의 actionPerformed 메소드를 Override
				try {
					int n1 =Integer.parseInt(textField1.getText());
					int n2 =Integer.parseInt(textField2.getText());
					//textField3.setText(Integer.toString(n1+n2));
					textField3.setText(String.valueOf(n1+n2));
				}catch(NumberFormatException ee) {
					textField3.setText("숫자만 입력!");
				}
			}
		});
		
		btn_minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 =Integer.parseInt(textField1.getText());
					int n2 =Integer.parseInt(textField2.getText());
					textField3.setText(String.valueOf(n1-n2));
				}catch(NumberFormatException ee) {
					textField3.setText("숫자만 입력!");
				}
			}
		});
		
		btn_multi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 =Integer.parseInt(textField1.getText());
					int n2 =Integer.parseInt(textField2.getText());
					textField3.setText(String.valueOf(n1*n2));
//					String result = Integer.toString(Integer.parseInt(textField1.getText()) *  Integer.parseInt(textField2.getText()));
//					textField3.setText(result);
				}catch(NumberFormatException ee) {
					textField3.setText("숫자만 입력!");
				}
			}
		});
		
		btn_div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double n1 =Double.parseDouble(textField1.getText());
					double n2 =Double.parseDouble(textField2.getText());
					if (n1 % n2 ==0) {
						textField3.setText(String.valueOf((int)(n1/n2)));
					}else {
						textField3.setText(String.format("%.3f",(n1/n2)));
					}
				}catch(NumberFormatException ee) {
					textField3.setText("숫자만 입력!");
				}
			}
		});
		
		btn_clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
			}
		});
		
		
		setSize(200,200);
		setVisible(true);
		
	}

}
