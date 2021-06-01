import java.util.Scanner;

public class do_while문_ {

	public static void main(String[] args) {
		
//		int a =100;
//		
//		while(a==200) {
//			System.out.println("while문 내부");
//		}
//		
//		do {
//			System.out.println("do while문 내부");
//		}while(a==20);
		
		
		
		int n;
		int count=0;
		Scanner s = new Scanner(System.in);
		
		
		do {
			System.out.println("안녕하세요. 주문 받겠습니다.");
			
			if(count==0) {
				System.out.println("1.카푸치노 2.카페라떼 3.아메리카노");
			}else {
				System.out.println("1.카푸치노 2.카페라떼 3.아메리카노 4.그만");
			}
			
			n = s.nextInt();
			
			if(n==4 && count==0) {
				n = n + 1;
			}
			
			switch(n) {
				case 1:
					System.out.println("카푸치노를 선택하셨습니다.");
					count++;
					break;
				case 2:
					System.out.println("카페라떼를 선택하셨습니다.");
					count++;
					break;
				case 3:
					System.out.println("아메리카노를 선택하셨습니다.");
					count++;
					break;
				case 4:
					System.out.println("주문하신 커피 준비하겠습니다.");
					break;
				default:
					System.out.println("잘못 주문하셨습니다.");
			}
		}while(n!=4);
	}
}
