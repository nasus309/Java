import java.util.Scanner;

public class METHOD2 {

	/**예제1메소드**/
	static int plus(int v1,int v2){
		int result;
		result = v1+v2;
		return result;
	}
	
	/**예제2메소드**/
	static int calc(int v1, int v2, int op) {
		int result;
		
		switch(op) {
		case 1: result = v1 + v2; break;
		case 2: result = v1 - v2; break;
		case 3: result = v1 * v2; break;
		case 4: result = v1 / v2; break;
		default: result = 0;
		
		/* 다른방법
		switch(op){
		case '+':
			System.out.println("두수의 합은 :" + (result=v1+v2));
		case '-':
			System.out.println("두수의 빼기는 :" + (result=v1-v2));
		case '*':
			System.out.println("두수의 곱은 :" + (result=v1*v2));
		case '/':
			if (v2 == 0)
				break;
			else
				System.out.println("두수의 나누기는 :" + (result=v1/v2));
		}
		*/
		
		}
		return result;
	}
	

	
	//프로세스 스케쥴링은 스택 개념이다.
	//main() -> println() -> 메서드호출,처리 -> println() 종료 -> main()종료
	public static void main(String[] args) {
		
		/**예제1**/
		int hap;
		hap = plus(100,200);
		System.out.println("100과 200의 plus() 메소드 결과는 : " + hap);
		
		
		/**예제2**/
		Scanner s = new Scanner(System.in);
		int res;
		int oper, a, b;
		char c;
		
		System.out.println("계산 입력(1:+, 2:-, 3:*, 4:/) : ");
		oper = s.nextInt();
		System.out.println("첫번째 숫자를 입력 : ");
		a = s.nextInt();
		System.out.println("두번째 숫자를 입력 : ");
		b = s.nextInt();
		
		/* 다른방법
		 c = s.next().charAt(0);
		res = clac(a,b,c) 이렇게 써도 됨.*/
		
		res = calc(a,b,oper);
		
		System.out.println("계산 결과는 " + res);
	}

}
