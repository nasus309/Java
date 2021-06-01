import java.util.Scanner;
public class problem5 {

	public static void main(String[] args) {
		/* 1에서 100사이의 값을 랜덤하게 설정하고 설정된 값을 맞추면 종료되는 미니게임을 구현하시오.
		사용자가 값을 입력하면 랜덤 설정 값과 비교해서 결과를 알려줌
		트라이 할 때마다 크다,작다를 사용자에게 알려줌
		게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려줌
		(int)(Math.random()*100)코드를 활용하세요 => 0.0 ~ 1.0 까지의 double값을 랜덤하게 생성 */
		
		int x = 0; // random으로 생성된 값
		int input; // 입력할 값
		int count=0; //몇 번만에 맞췄는지 알려줄 변수.
		x = (int)(Math.random()*100);
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("1~100까지의 값을 맞춰보세요!");
		
		while(true) {   //for(;;)써도 됨.
			count++;
			System.out.println("1~100까지의 정수를 입력하세요 : ");
			input = s.nextInt();
			if (input < x ) {
				System.out.println("더 큰 값을 입력하세요!");
			}else if(input > x){
				System.out.println("더 작은 값을 입력하세요!");
			}else {
				System.out.printf("%d회 만에 정답을 맞추셨습니다!",count);
				break;
			}
		}	
	

	}

}
