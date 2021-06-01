// 지역변수를 쓰는 이유? 
// => 많은 메소드들과 엮일 경우 변수값이 바뀔 수 도 있기 때문에 문제를 일으킬 수 있다.
public class METHOD_global_local {
	
	//static final int B =1000; 프로그램이 종료될 때까지 a값이 100으로 고정이기 때문에 전역변수를 사용한다. 상수는 대문자로 적는 것을 추천!
	
	//static int a = 100;
	
	static void func1(){
		/**예제1**/
		/*int a = 200;
		System.out.println("func1()에서 a의 값==> " + a);*/
		
		
		/**예제2**/
		System.out.println("void형 메소드는 돌려줄게 없음.");
	}
	
	static int func2() {
		return 100;
	}
	
	
	public static void main(String[] args) {
		/**예제1**/
		/*func1();
		System.out.println("main()에서 a의 값==> " + a);*/	
		
		
		/**예제2**/
		int a;
		
		func1();
		
		a=func2();
		System.out.println("int형 메소드에서 돌려준 값==> "+ a);
	}

}
