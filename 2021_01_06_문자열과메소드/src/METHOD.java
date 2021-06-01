import java.util.Scanner;

//이거 class METHOD 들어가면 왜 실행 안되지?
class 붕어빵 {
	int n ;
	static void 빵굽기(){  // 메소드 선언
		System.out.println("붕어빵을 굽습니다.");
	}
}

public class METHOD {
	
	
	
	static int coffee_machine(int button) { 	//method명 앞에 int 때문에 반환을 해야함(return 타입이 int)! 메소드 선언.
												//메소드를 선언 할 때 입력되는 재료를 정의하면 이는 parameter(형식인자). --> button
			
			System.out.println("1.뜨거운 물을 준비한다.");
			System.out.println("2.종이컵을 준비한다.");
			
			switch(button) {
			case 1:
				System.out.println("3.보통커피를 탄다."); break;
			case 2:
				System.out.println("3.설탕커피를 탄다."); break;
			case 3:
				System.out.println("3.블랙커피를 탄다."); break;
			default:
				System.out.println("3.아무거나 탄다."); break;
				
			}
			
			System.out.println("4.물을 붓는다.");
			System.out.println("5.스푼으로 저어서 녹인다.");
			
			return 0; //메소드를 호출한 곳으로 돌아가겠다.
			
			
			
	}
	

	public static void main(String[] args) { //프로그램의 시작은 main에서 부터!!!!!!
		
		Scanner s = new Scanner(System.in); //scanner object를 담을 수 있는 s 변수.
		int coffee;
		int ret;
		
		System.out.println("어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
		coffee = s.nextInt();
		
		// 메소드 호출.(실제로는 내가 메소드로 간다 --> 프로그램의 흐름이 메소드를보고 coffee인자를 들고 메소드 위치로감!)
		// 메소드를 호출 할 때 사용하는 재료는 argument(실인자) 라고 한다.
		ret = coffee_machine(coffee); 
		//System.out.println(ret); //0 출력
		//System.out.println(coffee_machine(coffee)); //return값까지 다 출력. 원래 MTHOD.coffee_machine() 어쩌구~
		System.out.println("손님 커피 여기 있습니다.");
		
		
		//메소드에 static 안붙으면 클래스를 인스턴스화 해줘야함.
		붕어빵 a = new 붕어빵();
		//참조변수.필드명()
		붕어빵.빵굽기();
		
		
		//메소드에 static 붙으면 인스턴스화 필요없음/ 클래스명.필드명()
		붕어빵.빵굽기();
		
		RUN(3); //1번째 RUN을 호출해줌~
		RUN(); //2번째 RUN을 호출해줌~

	}
	static void RUN(int a){
		System.out.println();
	}
	
	static void RUN(){
		System.out.println();
	}
}
