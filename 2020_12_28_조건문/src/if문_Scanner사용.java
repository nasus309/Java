import java.util.Scanner; //미리 정의 되어 있는 클래스(클래스 ; n개의 변수(field)와 n개의 메소드의 묶음), 참조형 변수를 object라고 함!

public class if문_Scanner사용 {

	public static void main(String[] args) {
		
		/*클래스이름 변수(object) 선언 = new 클래스이름();
		ex)class 연봉{ }
		   연봉 x = new 연봉();*/
		
		/*
		  Scanner s; //참조형 타입의 API 메소드이기 때문에 s라는 이름은 스택에 
		               저장이 되지만 실제 내용물(object)은 힙에 저장이 됨.
		                --> Sting도 참조형 타입이라 똑같다. 근데 String은 많이 쓰여서 new 생략하고 바로 String sss~
		             //null
		  s = new Scanner(System.in); 
		  도 가능*/

		Scanner s = new Scanner(System.in); //System.in --> 표준입력시스템 System.out-->현재시스템
		
		int a; //null
		
		System.out.printf("정수를 입력하세요 : ");
		a = s.nextInt(); 
	
		
		if (a % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		double b;
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		b = s1.nextDouble();
		
		if (b>100.0) {
			System.out.println("100보다 큰 실수");
		}else {
			System.out.println("100보다 작은 실수");
		}
		
	}

}
