package 컬렉션3;

import java.util.Stack;

public class StackExam {
	//Stack 클래스는 LIFO(후입선출)
	//응용예 : JVM 스택 메모리.
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
		
	}
}
