
public class 관계_논리연산자 {

	public static void main(String[] args) {
		
		//관계연산자
		int a = 10, b = 20;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.printf("%d = %d는 %s이다\n",a,b,a=b); //a=b 했기 때문에 %s에 20이 들어감.
		
		
		
		//논리연산자 
		a = 99;
		//관계연산자가 논리연산자보다 먼저임!
		System.out.println("AND 연산 : "+(a>=100 && a<=200));
		System.out.println("OR 연산 : "+(a>=100 || a<=200));
		System.out.println("NOT 연산 : "+ !(a==100));
		
		
		int num1 = 100, num2 = -200;
		
		boolean c = (num1 !=0 );
		boolean d = (num2 !=0 );
		
		System.out.println("상수의 AND 연산 : "+ (c&&d));
		System.out.println("상수의 OR 연산 : "+ (c||d));
		System.out.println("상수의 NOT 연산 : "+ (!c));
	}

}
