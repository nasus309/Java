import java.util.Scanner;

public class for문_Scanner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//Scanner => 클래스(API 클래스)
		//s => Scanner클래스의 Object
		//new Scanner(System.in) => 생성자
		
		
		
		/**예제 1**
		int hap=0;
		int i;
		int num;
		System.out.println("값 입력 : ");
		num = s.nextInt();
		
		
		for(i=1;i<=num;i++) {
			hap = hap + i;
		}
		
		System.out.printf("1에서 %d까지의 합: %d \n",num,hap);
		System.out.printf("1에서 %d까지의 합: %d \n",num,hap/(i-1));
		**/
		
		
		
		/**예제2**
		int hap=0;
		int i;
		int num1,num2,num3;
		
		System.out.print("시작값 입력: ");
		num1 = s.nextInt();
		System.out.print("끝값 입력: ");
		num2 = s.nextInt();
		System.out.print("중간값 입력: ");
		num3 = s.nextInt();
		
		for(i=num1;i<=num2;i=i+num3) {
			hap = hap + i;
		}
		
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d \n",num1,num2,num3,hap);
		s.close();
		**/
		
		
		
		/**예제3**/
		int a,b;
		char c;
		for(;;) {
			System.out.println("실행하시겠습니까(y/n)? : ");
			c = s.next().charAt(0);
			// s.next() => 문장을 입력받아서 처리해준다.
			// charAt(n) => 입력받은 문장에서 n+1번째 글자를 추출한다.
			if (c == 'y') {
				System.out.println("더할 첫번째 수 입력 : ");
				a= s.nextInt();
				System.out.println("더할 두 번째수 입력 : ");
				b = s.nextInt();
				System.out.printf("%d + %d = %d \n",a,b,a+b);
			}else {
				break;
			}
		}
		
		
//		String ss;
//		ss = s.next();
//		System.out.println("");
//		c = ss.charAt(0);
//		System.out.println("첫번째 글짜는"+c);
		
		
		
	}

}
