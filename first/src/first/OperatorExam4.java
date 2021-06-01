package first;

public class OperatorExam4 {

	public static void main(String[] args) {
		
		//삼항연산자
		//5가 4보다 큽니까? 참이라면 50, 거짓이라면 40 을 b1에 대입!
		int b1 = (5 > 4) ? 50 : 40;
		System.out.println(b1);
		
		int b2 = 0;
		if (5 > 4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		
		System.out.println(b2);
		
	}

}
