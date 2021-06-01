package first;

public class Truck extends Car {
	public Truck() {
		//super키워드 : 부모 객체를 나타내는 키워드 (this가 나를 나타내는것과 비슷한 구조)
		super(); // 안써도 실행 됨. 자동적으로 생성해주기때문에~ super 안써주면 기본생성자만 생성.
		System.out.println("Truck의 기본생성자입니다.");
	}
}
