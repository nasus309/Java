import java.util.Scanner; //만들어져 있는 클래스, 일반적으로 API라고 부릅니다. 라이브러리라고도 함.

class 동물{
	int a;
	int b;
}

class 사람{
	
}

class myInt{
	int a;
}

public class METHOD_call_by_ref {
	
	static void func1(myInt m) {  // m에는 myInt 타입을 받아줘라.
		m.a = m.a + 1;
		System.out.println("전달받은 a ==> " + m.a);
	}
	
	static void func2(int a){
		a = a + 1;
		System.out.println("전달받은 a ==> " + a);
	}

	
	public static void main(String[] args) {
		
		//클래스에서 object를 만드는 방법
		//클래스명 변수면(오브젝트명) = new 클래스명(내용이 있을수도~없을수도~);
		
		myInt m = new myInt(); // myInt()는 생성자 라는 메소드! => 클래스로부터 object(변수)를 생성해준다.
		myInt n = new myInt();
		
		m.a = 10;
		
		func1(m);
		System.out.println("func1() 실행 후의 a ==> " + m.a); //call by ref
		
		func2(m.a);
		System.out.println(m.a); //call by value 여기서 m 은 뭘가르키ㅡ넉? 이게 왜value?
		System.out.println(m);//ref
		
		사람 김나현 = new 사람();
		
		/*김나현.method() 가 나오는 이유? 
		클래스 안에 아무내용이 없어도object라는 클래스의 베이스에서 만들어진다?*/
		
		동물 호랑이 = new 동물();
		호랑이.a = 1;
	}

}


