package �÷���3;

import java.util.Stack;

public class StackExam {
	//Stack Ŭ������ LIFO(���Լ���)
	//���뿹 : JVM ���� �޸�.
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ����: " + coin.getValue() + "��");
		}
		
	}
}
