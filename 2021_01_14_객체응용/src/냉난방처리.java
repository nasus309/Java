
public interface 냉난방처리 {
	/**인터페이스**/
	// 시동처리(){} -> 인터페이스에서는 기본생성자 사용 불가능.
	//인터페이스는 메소드에 abstract 안붙여도 추상메소드 취급.
	
	//static final int x = 10;
	int x = 10; // -> static final을 생략시킨것. 인터페이스 안에서는 생략 가능함.
	
	void 에어컨켜기();
	void 에어컨끄기();
	
	static final int CAR_COUNT=0;

}
