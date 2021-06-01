

public class Car {
	
	protected String color; //어느 패키지에 있든 부모의 필드를 상속받은 슈퍼클래스에 접근 가능하게 해줌...
	int speed; //다른 패키지에서 쓰려면 public이나 protected로 수정
	
	Car(){
		//서브 클래스(세단)에 필드 생성...?
	}
}
