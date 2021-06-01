import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		//입력한 정수 변수 값에 따라 양수,음수,0 을 출력하는 프로그램을 작성하시오.
		//만약 사용자가 잘 못 입력했을 때 정상적으로 시스템이 종료 될 수 있도록 프로그램을 추가해 보세요.
		
		int input=0;
		Scanner s = new Scanner(System.in);
		
//		try {
//			System.out.println("정수를 입력하세요 : ");
//			input = s.nextInt(); 
//			if (input > 0){
//				System.out.println("입력하신 정수는 양수입니다.");
//			}else if (input < 0){
//				System.out.println("입력하신 정수는 음수입니다.");
//			}else {
//				System.out.println("입력하신 정수는 0입니다.");
//			}
//		}catch (Exception e) {
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		
       /***또 다른 방법***/	
	
		while (true) {
			try {
				System.out.println("정수를 입력하세요 : ");
				input = s.nextInt(); 
				if (input >= 0) {
					if(input != 0) {
						System.out.printf("입력하신 정수 %d는 양수입니다.\n",input);
					}else {
						System.out.printf("입력하신 정수는 0입니다.\n",input);
					}
				}else {
					System.out.printf("입력하신 정수 %d는 음수입니다.\n",input);
				}
			}catch (Exception e) {
				System.out.println("잘못입력하셨습니다.");
				
				s.next(); //앞에 들어온 값은 상관하지말고? 다음 값으로 넘어가라?
			}
		}
		
		
	}

}

