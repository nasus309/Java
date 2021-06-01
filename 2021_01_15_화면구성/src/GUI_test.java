import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_test {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set 어쩌고는 JFrame의 메소드, 어떻게 종료하게 할거냐
			
			//일반적응로 대문자 필드는 상수(EXIT_ON_CLOSE)
			/*
			setTitle("GUI연습");
			
			setSize(500,500);
			setVisible(true); */
			setTitle("FlowLayout연습");
			this.setLayout(new FlowLayout()); //setLayout 때문에 배치가 가능, this는 창을 의미
			
			/*
			JButton btn1 = new JButton("버튼1");
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
			this.add(btn3);
			
			JButton btn4 = new JButton("버튼4");
			this.add(btn4);
			*/
			
			//btn4.setVisible(false);
			
			JButton btn5[] = new JButton[100];
			
			for (int i=0;i<btn5.length;i++){
				btn5[i] = new JButton("버튼"+i);
			}
			
			//this.add(btn5);
			
			setSize(256,256);
			setVisible(true);
			
			
		}
		
	}

	public static void main(String[] args) {
		
		new MyGUI();

	}

}
