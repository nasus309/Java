package first;

public class DuckExam {

	public static void main(String[] args) {
		
		Duck duck = new Duck();
		duck.sing();
		duck.fly();
		
		//추상클래스는 부모로서의 역할은 가능하지만 그 자체로 객체 생성은 불가능~
		//Bird b = new Bird(); 
	}

}
