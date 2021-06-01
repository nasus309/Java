
public class 자동차 {
	
	자동차(){//2.슈퍼클래스의 생성자를 호출
		//3. 슈퍼클래스가 가지고 있는 멤버 정보를 통해 인스턴스에 추가.	
		System.out.println("슈퍼클래스생성자 실행");
	}
	자동차(String s){
		System.out.println("나는" + s + "서브클래스가 호출한 생성자다.");
	}
	
	static String 색상="빨강";
	//String 색상;
	int 속도;
	static final String 번호="1111"; //final 붙이면 상수취급.
	
	
	void 가속() {
		
	}
	
	void 감속() {
		System.out.println("자동차 감속");
	}
	
	void 색상바꾸기(String sss) {
		this.색상 = sss;
	}

}
