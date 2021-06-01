package first;

public class Car {
	
	public void run() {
		System.out.println("달리다.");
	}

	
	//타입 필드명
	String name;
	int number;
	
	//생성자를 만들어 둔적이 없는데? 컴파일러는 기본 생성자를 만든다?
	//셍성자가 하는일은 객체가 될 때 필드를 초기화를 수행하는것...
	
	
	
	//변수를 선언할 때는 알아 보기 쉽게 직관적으로 선언해야함
	/*밑에 문장은 원래
	  public Car(String n) {
		name = n;
	} 이었으나 n을 name으로 바꿔주면서 문제가 생겨 this를 써준것이다~*/
	
	//this 는 객체 자신을 참조하는 키워드(자신을 바로 쓰면 안되는듯)
	public Car(String name) {
		this.name = name;
	}
	
	
	//기본생성자 생성
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0); //바로 밑에 생성자 호출!(타입에 알맞는 생성자 호출)
		System.out.println("Car의 기본생성자입니다.");
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	


}
