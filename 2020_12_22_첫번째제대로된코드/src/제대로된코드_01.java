
public class 제대로된코드_01 {

	public static void main(String[] args) {
		// 0 0 0 0 0 0 0 0 = 8bit => 1Byte(ASCII 아스키코드) -> 128(2^8)글자
		// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 = 16bit => 2Byte(UTF(유니코드)) -> 65536개
		
		int a,b; //정수를 저장할 수 있는 공간(변수) a를 만든다
		int result;
		a = 100;
		b = 50;
		// a = b; 하면 a에 b의 값(50)이 들어감. 
		
		
		result = a + b;
		System.out.println(a+ "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a+ "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a+ "*" + b + "=" + result);
		
		// b = 0; --> 분자가 0이 되기때문에 에러남.
		
		result = a / b;
		System.out.println(a+ "/" + b + "=" + result);
		
		System.out.println("나는 "+"배고파요");
		
		
	}

}
