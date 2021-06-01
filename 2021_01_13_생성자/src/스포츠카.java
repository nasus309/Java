
public class 스포츠카 extends 자동차 {

	boolean 천장오픈;
	boolean Turbor;//속도필드 + 색상필드(자동차 슈퍼 클래스)
	
	void 천장오픈알아보기() {
		
	}
	
	@Override
	void 가속() { 
		속도= 속도 + 30;
	}
}
