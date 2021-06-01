package first;

public class MyClass {
	
	//public 리턴타입 메소드명 (매개변수들) { 필요한 기능 구현 }
	//void --> 리턴타입 없다
	public void method1() {
		System.out.println("m1이 실행됨..");
	}
	
	//정수를 받아들이고 return을 x
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행");
	}
	
	//아무것도 받아들이지 않았지만 정수값을 리턴
	public int method3() {
		System.out.println("m3실행");
		return 10;
	}
	
	//정수 2개를 받아들이고 리턴은 x
	public void method4(int x, int y) {
		System.out.println( x + y + "m4 실행");
	}
	
	
	//정수 y를 받아서 정수를 리턴
	public int method5(int y) {
		System.out.println(y + "이용한 m5 실행");
		return y*2;
	}
}
