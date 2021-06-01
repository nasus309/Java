package first;

public abstract class Bird { 
	
	//추상클래스가 부모클래스 역할 함
	
	//리턴타입 앞에 abstract붙이면 추상클래스임.
	//메소드가 하나라고 추상메소드가 된다면 클래스도 추상이 될 수 밖에없다
	//따라서 class 앞에 abstract적어줘라!
	
	public abstract void sing();
	public void fly() {
		System.out.println("날다.");
	}
}
