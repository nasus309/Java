// 지역변수를 쓰는 이유? 
// => 많은 메소드들과 엮일 경우 변수값이 바뀔 수 도 있기 때문에 문제를 일으킬 수 있다.
public class METHOD_test {
	
	//static final int B =1000; 프로그램이 종료될 때까지 a값이 100으로 고정이기 때문에 전역변수를 사용한다. 상수는 대문자로 적는 것을 추천!
	
	static int a = 100;
	
	static void print(String s, 붕어빵 a) {
		s="hi"; //hello와 다른 heap영역에 저장되어있는 hi를 저장...?
		a.n =1000;
		System.out.println(s);
		System.out.println(a);
	}
	
	static void func1(){
		int a = 200;
		System.out.println("func1()에서 a의 값==> " + a);
	}
	
	
	public static void main(String[] args) {
		func1();
		System.out.println("main()에서 a의 값==> " + a);
		
		붕어빵 b = new 붕어빵();
		b.n = 100;
		String s ="hello";
		
		print(s,b);//hello, 붕어빵 object
		System.out.println(s);
		System.out.println(b.n);
		
	}

}
