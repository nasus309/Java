
public class 입출력기초 {

	public static void main(String[] args) {
		
		/*메소드 : 특정 기능을 처리, 다른 언어에서는 함수라고도 함 ; 메소드이름()의 형태
                 메소드에 따라 괄호 안에 파라미터(인자)가 필요한 경우도 있음.
          필 드 : 필요한 데이터를 저장하는 공간.(변수들의 집합) ;주로 클래스변수이름.속성 형식으로 사용*/
		
		//**print()와 printf() 사용하기
		
		
		//printf()는 format을 지정하지 않으면 print()와 같음.
		System.out.printf("안녕하세요");
		System.out.printf("안녕하세요");
		//System.out.printf(100); --> **오류** ; printf()는 문장 외에 다른 타입은 format을 지정해주어야함.
		System.out.printf("%d", 100); // {"%d" : 정수, "%f" : 실수, "%c" : 문자, "%s" : 문자열}
		System.out.printf("%f", 100.00); //default 소수점 6자리
		
		
		System.out.print("\n");
		
		System.out.print(100.00); //default 소수점 1자리
		System.out.print(100);
		System.out.print("안녕하세요");
		
		
		System.out.print("\n");
		
		System.out.printf("100+100");
		System.out.printf("\n");
		System.out.printf("\n"); // tab만큼 이동
		System.out.printf("%d",100+100);
		System.out.printf("\n");
		System.out.printf("300");
		System.out.printf("%f",3.14);
		
		System.out.print("\n");
		
		System.out.print(100);
		System.out.print(" ");
		System.out.print(200);
		
		System.out.print("\n");
		
		//출력서식 여러개 이용하기
		System.out.printf("%d %d %f", 100,200,3.14);
		System.out.print("\n");
		System.out.printf("%d %f %f %c %c %s", 23,1.0,12.2,'a','안',"안녕");
		System.out.print("\n");
		System.out.printf("%d + %d = %d", 100,200,100+200);
		System.out.print("\n");
		System.out.printf("%d / %d = %.1f", 100,200,100.0/200.0);
		System.out.print("\n");
		System.out.println("100 " + "+" + " 200 " + " = " + (100+200));
		System.out.println("100 " + "/" + " 200 " + " = " + (100.0/200.0));
		
		int a = 100;
		int b = 200;
		
		System.out.printf("%d + %d = %d",a,b,a+b);
		
		System.out.print("\n");
		
		//구구단
		
		a = 2;
		b = 1;
		System.out.printf("%d * %d = %d", a,b, a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.print("\n");
		
		
		//10진수를 16진수로 바꾸기
		System.out.printf("%x",15);
		System.out.print("\n");
		//boolean은 값이 있으면 무조건 true임.
		System.out.printf("%b \n",0);
		System.out.printf("%b \n",null);
		System.out.printf("%b",false);
		System.out.print("\n");
		
		
		//자릿수를 맞춘 출력
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		
		System.out.printf("%s\n", "Hi-Java");
		System.out.printf("%10s\n", "Hi-Java");
		
		//다양한 서식 활용
		System.out.printf("\n줄바꿈\n연습\n");
		System.out.printf("\t탭키\t연습\n");
		System.out.printf("이것을\r덮어씁니다\n");
		System.out.printf("글자가\"강조\"되는 효과\n");
		System.out.printf("\\\\\\ 역슬래시 세개 출력\n");
		

		
		
		
	

	}

}
