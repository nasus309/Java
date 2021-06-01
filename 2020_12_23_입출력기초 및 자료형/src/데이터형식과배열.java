
public class 데이터형식과배열 {

	public static void main(String[] args) {
		
		//**정수형,실수형**
		
		int p = 10;
		int q = 0x10; // 0x -> 16진수 표현
		int r = 0b10; // 0b -> 2진수 표현
		
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
		int l = 100, m = 200;
		double n = (double) l/m;
		float result;
		
		result = l/m;
		
		System.out.printf("%f \n", result);
		System.out.println(n);
		
		float x = 0.1234567890123456789012345f; //소수점 8자리
		double y = 0.1234567890123456789012345; //소수점 17자리 ---> ???????????? 무슨기준
		float x1 = 0.00000000001f;
		
		System.out.println(x1);
		
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%30.25f \n",x);
		System.out.printf("%30.25f \n", y);
		
		//**문자형**
		
		char a,b,c,d,e;
		
		a = 'A';
		System.out.printf(" %c \t",a);
		System.out.printf(" %d \n",(int)a);
		
		b = 'a';
		c = (char) (b+1);
		System.out.printf(" %c \t",b);
		System.out.printf(" %c \n",c);
		
		d = '가';
		e = (char) (d+1);
		System.out.printf("%d",(int)d);
		System.out.printf(" %c \n", e);

		
		//i 32하면 어디부터?
		for ( int i =32;i<127;i++) {
			System.out.printf("%c\n", i);
		}
		
		//**Boolean형**
		
		boolean boo1,boo2;
		
		//%b와는 어떻게 다른가? %b는 변수가 존재하면 true, null이거나 false 이면 false임.
		
		boo1 = true;
		System.out.printf("%s \n", boo1);
		System.out.println(boo1);
		
		boo2 = (10==20); //false
		System.out.printf("%s \n", boo2);
		System.out.println(boo2);
		
		
		//**문자열**
		
		int t = 100;
		String s = "안녕하세요";
		/****int는 stack영역에 들어가고 string은 heap영역에 들어감. 
		string의 stack영역에는 heap의 주소값이 들어감.
		 --> 왜? string은 다른 변수형들과 달리 들어가는 글자수에 따라 바이트가 변하는
		     변동형? 가변 data?(참조변수)이기 때문에
		     참조변수는 stack에는 고정크기로 할당 but heap의 주소를 stack에 할당!****/
		
		String str1 = "IT CookBook 입니다";
		String str2 = "10";
		String str3 = "20";
		str2 = str2 + str3;
		
		//st1은 이미 연결되어있는 주소의 heap에 해당하는 데이터를 바꿔주지만
		//str2는 heap에 새로운 데이터를 만들어내서 주소를 연결.
		
		str1 = "JAVA 입니다.";
		
		System.out.printf("%s \n", str1);
		System.out.printf("%s \n", str2);
		
		
	}

}
