
public class 클래스상속 {
	/**메인클래스**/
	
	static void 원넓이(double 반지름) {
		System.out.println(반지름 * 반지름 * Math.PI);
	}
	
	public static void main(String[] args) {
		
		원넓이(3);
		
		// Car 포니 = new Car(); ->abstact 클래스로는 객체생성 못함
		Sedan sedan = new Sedan();
		System.out.println("승용차 인스턴스 생성");
		
		sedan.시동끄기();
		
		
		
	}
}
