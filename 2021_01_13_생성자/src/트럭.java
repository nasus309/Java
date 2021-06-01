
public class 트럭 extends 자동차 {

	int 적재량;
	String 색상;
	
	트럭(){ //1. 서브클래스 생성자 호출위치에서 skip
		//4. 서브클래스 멤버들을 생성
		System.out.println("서브(트럭)클래스생성자 실행");
	}
	
	트럭(String s){
		super(s); //default 생성 안하고...문자열 s를...가지고 호출하는 생성자를 호출해달라... 지정안하면 default 타입 호출...
		System.out.println("나는 문자열을 출력하는 생성자입니다.");
	}
	
	@Override
	void 감속() {
		System.out.println("트럭의 속도를 감소 시킵니다.");
	}
	
	
	void 적재량알아보기() {
		
	}
	
	//전역,지역변수 개념
	void 색상변경(String s) {
		this.색상 = s;
	}
}
