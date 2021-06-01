package first;

public class OperatorExam {

	public static void main(String[] args) {
		
		//부호연산자
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		//증감연산자
		int i4 = ++i3; // i3 = i3 + 1; 먼저 더한다음에 더한 결과값을 i4에 넣어줌
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; //i3 = i3 + 1; 먼저 6이 i5에 들어가고 i3에 i3+1을 대입? 
		System.out.println(i5);
		System.out.println(i3);
		
		//산술연산자
		int i = 5;
		int j = 2;
		
		System.out.println( i + j );
		System.out.println( i - j );
		System.out.println( i * j );
		System.out.println( i / j ); //정수를 얻고싶으면 i,j 하나를 실수로!
		System.out.println( i / (double)j );
		System.out.println( i % j );
		
		
		//비교연산자
		i = 10;
		j = 10;
		
		System.out.println( i == j );
		System.out.println( i != j );
		System.out.println( i < j );
		System.out.println( i <= j );
		System.out.println( i > j );
		System.out.println( i >= j );
		
		//복합대입연산자
		i += 10; //i = i + 10
		System.out.println(i);
		System.out.println(i -= 5);
		
		
	}

}
