import java.util.Scanner;

public class 배열의활용2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char[] stack = new char[5];
		int top=0;
		
		char carName = 'A';
		int select = 9;
		
		while (select != 3) {
			System.out.printf("<1>자동차 넣기 <2>자동차 빼기 <3>끝 : ");
			select = s.nextInt();
			switch(select){
			case 1:
				if(top>=5) {
					System.out.println("터널이 꽉 차서 차가 못들어감");
				}else {
					stack[top] = carName++;
					System.out.printf("%c 자동차가 터널에 들어감\n",stack[top]);
					top++;
				}
			break;
				
			case 2:
				if(top<=0) {
					System.out.println("빠져나갈 자동차가 없음");
				}else {
					top--;
					System.out.printf("%c 자동차가 터널에서 빠짐\n",stack[top]);
					stack[top] =' ';
				}
				break;

			case 3:
				System.out.printf("현재 터널에 %d대가 있음.\n",top);
				System.out.println("프로그램을 종료합니다.");
				break;
					
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}

	}

}
