import java.util.Scanner;

public class switch_case문_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf(" 1~4 중에 선택하세요 : ");
		a = s.nextInt();
		
		//switch_case구문에서 break를 빼면 case에 걸리는 위치에서부터 default까지 모두 출력!
		switch (a) {
		case 1:
			System.out.println("1을 선택했다.");
			break;
		case 2:
			System.out.println("2를 선택했다.");
			break;
		case 3:
			System.out.println("3을 선택했다.");
			break;
		case 4:
			System.out.println("4를 선택했다.");
			break;
		default:
			System.out.println("이상한걸 선택했다.");
		}
			
		
		/*
		학점계산기 switch문
		int n;
		n = s.nextInt();
		switch(n/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			
		} */
		
		
		

	}

}
