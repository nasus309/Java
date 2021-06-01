
public class 산술연산자 {

	public static void main(String[] args) {
		
		int a = 2, b = 3, c = 4;
		int result1, mok, namugi;
		double result2 = 1.01;
		
		result1 = a+b-c;
		System.out.println(result1);
		
		result1 = a+b*c;
		System.out.println(result1);
		
		
		System.out.println(result2); //이건 왜 1.500000아님
		
		mok = c / b;
		System.out.println(mok);
		
		namugi = c % b;
		System.out.println(namugi);
		
		
		//전위 증가연산자
		a = 1;
		System.out.println(++a); //2
		System.out.println(++a); //3
		
		//후위 증가연산자
		a=1;
		System.out.println(a++); //1 
		System.out.println(a++); //2
		
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		

		
		
	}

}
