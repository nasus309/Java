import java.io.IOException;
import java.util.Scanner;

public class while문_calc {
	//예외가 main method 안에서 일어나면, 호출한(상위블록) 쪽에 던진다...? 
	//예외처리 못하겠으니까 위에 던져서 처리해달라! 거기서도 못하면 main method까지도 던지고 안되면 시스템에서 처리...?
	public static void main(String[] args) throws IOException { 
		
		Scanner s = new Scanner(System.in);
		int a,b;
		char ch;
		int n;
		char c;
		
		
		System.out.println('A'+32);
		System.out.println((char)('A'+32));
		
		System.out.print("대문자 하나를 입력하세요:");
		c = (char)System.in.read();
		System.out.println((int)c);
		
		if(c>=65 && c<=91) {
			// 65~91 ; 대문자 A~Z
			// c = (char)(c + 32) c값 변화?하고싶아먄
			System.out.println((char)(c+32)); //65+32=97(소문자a 바이트코드)
			System.out.println(c);
		}else {
			System.out.println(c);
		}
		
		
		/*글자의 제일 앞 글자의 아스키 코드를 출력?
		while(true) {
		System.out.printf("글자를 입력하세요:");
		n =System.in.read();
		System.out.println(n);
		}
		--> enter 키의 바이트코드 10이 자동으로 출력?
		*/
		
		
		while(true) {
			System.out.println("첫번째 수 입력 : ");
			a = s.nextInt();
			System.out.println("두번째 수 입력 : ");
			b = s.nextInt();
			System.out.println("계산할 연산자를 입력하세요 : ");
			ch = (char)System.in.read(); //문자 타입으로 바꾸기...왜?
			
			switch(ch) {
				case '+':
					System.out.printf("%d + %d = %d 입니다. \n",a,b,a+b); break;
				case '-':
					System.out.printf("%d - %d = %d 입니다. \n",a,b,a-b); break;
				case '*':
					System.out.printf("%d * %d = %d 입니다. \n",a,b,a*b); break;
				case '/':
					System.out.printf("%d / %d = %f 입니다. \n",a,b,a/(float)b); break;
				case '%':
					System.out.printf("%d %% %d = %d 입니다. \n",a,b,a%b); break;
				default:	
					System.out.printf("연산자를 잘 못 입력했습니다.\n");
					
			}
		}

	}

}
