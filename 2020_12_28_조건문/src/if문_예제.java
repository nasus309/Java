import java.util.Scanner;

public class if문_예제 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("정수를 입력하세요 : ");
		a = s.nextInt();
		
		//입력한 값이 음수이면 양수로 바꿔주고 양수가 입력되면 그대로 출력하는 절대값 프로그램을 if를 사용해서 만들어보세요.
			if (a < 0) {
				//System.out.printf("입력값의 절대 값은 %d 입니다.",Math.abs(a));
				System.out.printf("입력값의 절대 값은 %d 입니다.",a*-1);
			}else
				System.out.printf("입력값의 절대 값은 %d 입니다.",a);
		
		/*
		//3과 4의 공배수 판별하기
		while(true) {
			System.out.println("정수를 입력하세요 : ");
			a = s.nextInt();
			
			if (a==-1)
				break;
			
			if (a % 3 == 0) {
				if (a % 4 == 0) {
					System.out.printf("%d는 3과 4의 공배수입니다.\n",a);
				}else {
					System.out.printf("%d는 3의 배수입니다.\n",a);
				}
			}else {
				System.out.printf("%d는 3의 배수가 아닙니다.\n",a);
			}
		}
		
		*/
		
		
		
		/*
		윤년인지 판단하는 프로그램!
		int year;		
		Scanner s = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요 : ");
		
		year = s.nextInt();
		
		if (year % 4 ==0 && year % 100 != 0) {
			System.out.printf("입력하신 년도 %d는 윤년입니다.",year);
		}else {
			System.out.printf("입력하신 년도 %d는 윤년이 아닙니다.",year);
		} */
		
		
		
	}

}
