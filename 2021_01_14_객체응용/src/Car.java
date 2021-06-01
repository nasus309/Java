
public abstract class Car {
	/**추상클래스**/
	//모든 메소드가 추상은 아님~
	Car(){
		
	}
	
	String 시동타입;
	
	//추상메소드 : 자식클래스들의 메소드마다 기능이 달라서 써줌.
	abstract void 시동켜기() ;
	abstract void 시동끄기() ;
	
	void 울랄라() {
		
	}
		
	
}
