import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_test {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set ��¼��� JFrame�� �޼ҵ�, ��� �����ϰ� �Ұų�
			
			//�Ϲ������� �빮�� �ʵ�� ���(EXIT_ON_CLOSE)
			/*
			setTitle("GUI����");
			
			setSize(500,500);
			setVisible(true); */
			setTitle("FlowLayout����");
			this.setLayout(new FlowLayout()); //setLayout ������ ��ġ�� ����, this�� â�� �ǹ�
			
			/*
			JButton btn1 = new JButton("��ư1");
			this.add(btn1);
			
			JButton btn2 = new JButton("��ư2");
			this.add(btn2);
			
			JButton btn3 = new JButton("��ư3");
			this.add(btn3);
			
			JButton btn4 = new JButton("��ư4");
			this.add(btn4);
			*/
			
			//btn4.setVisible(false);
			
			JButton btn5[] = new JButton[100];
			
			for (int i=0;i<btn5.length;i++){
				btn5[i] = new JButton("��ư"+i);
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
