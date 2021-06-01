import java.util.Scanner;

public class METHOD_call_by_value {
	
	static void func1(int a){
		a = a + 1;
		System.out.println("전달받은 a ==> " + a);
	}
	
/*	
    static Scanner hi() {
		//형식인자 자리에 기초 또는 래퍼클래스 타입 (--> hi(int a) ) 같은의 변수가 지정되면 
		//무조건 call by value
	
		return new Scanner(System.in);
		
	}
*/
	
	public static void main(String[] args) {
		
		int a = 10;
		
		//리턴값이 있으면 System.out.println(func1()); 하면 11 나오나?
		System.out.println("func1() 실행 후의 a ==> " + a);
		
//		Scanner s = hi();
	
		
	}

}
