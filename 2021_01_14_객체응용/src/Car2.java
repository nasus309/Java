
public class Car2 implements 냉난방처리,네비게이션제어 {
	/**인터페이스를...상속받는...?**/
	//다중구현가능
	
	String 시동타입;
	
	//추상메소드를 꼭 구현해줘야함. 안하면 에러.(냉난방처리 인터페이스)
	@Override
	public void 에어컨켜기() {
				
	}
	@Override
	public void 에어컨끄기() {
			
	}
	
	//네비게이션제어 인터페이스
	@Override	
	public void 네비켜기() {
			
	}
	@Override
	public void 네비끄기() {
			
	}
		
	
}
