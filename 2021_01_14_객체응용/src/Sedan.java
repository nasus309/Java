
public class Sedan extends Car {
	/**추상클래스**/
	String 색상;
	public static final int speed =30;

	
	
	//추상메소드를 꼭 구현해줘야함. 안하면 에러.(Car 클래스에서)
	@Override
	void 시동끄기() {
		this.시동타입 = "OFF";
		System.out.println(시동타입);
	}
	@Override
	void 시동켜기() {
		System.out.println("승용차가 시동을 켭니다.");
	}
	
	
	
	void 가속() {
		
	}
	
	void 감속() {
		System.out.println("자동차 감속");
	}
	


}
