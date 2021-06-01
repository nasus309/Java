package first;

public class OperatorExam2 {

	public static void main(String[] args) {
		
		//연산자 우선순위
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println((a - b) * c);
		
		System.out.println(a > 5 && b > 5); //논리연산자가 비교연산자보다 우선순위
		
		System.out.println(a > 5 || b > 5);
		
		System.out.println(++a - 5);//단항연산자가 산술연산자보다 우선순위.전위연산자
		// a = a + 1을 수행후 산술연산 진행
		//++ -- 같은 것을 단항 연산자중에 증감연산자라고 한다.
		System.out.println(a);
		
		System.out.println(a++ - 5); 
		//후위연산자는 다른연산이 먼저.증감이라해서 우선순위가 아님
		// a-5 부터 실행 후 a = a + 1 실행
		System.out.println(a);
		
		
	}

}
