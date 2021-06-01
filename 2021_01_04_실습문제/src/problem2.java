import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		//사과의 수와 바구니당 최대 담을 수 있는 사과의 수를 입력 받아, 바구니의 개수를 입력하는 프로그램을 만들어 보세요.
		//ex) 사과의 수가 138개고 최대 담을 수 있는 사과의 수가 10개라면 바구니의 개수는 14개.
		
		Scanner s = new Scanner(System.in);
		int 사과수;
		int max;
		System.out.println("사과의 수를 입력하세요 : ");
		사과수 = s.nextInt();
		System.out.println("바구니당 최대 담을수 있는 사과의 수를 입력하세요 : ");
		max = s.nextInt();
		
		if ((사과수 % max) == 0) { //if((사과수 % max) >0) 이런식으로도 갈 수 있음..
			System.out.println(사과수/max);
		}else {
			System.out.println((사과수/max)+1);
		}	
		
	}

}

