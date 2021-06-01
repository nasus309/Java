import java.util.Scanner;

public class while문 {

	public static void main(String[] args) {
		
		int n; //정수형 변수 n을 선언
		
		Scanner s = new Scanner(System.in); //스캐너 오브젝틑 선언 및 생성
		
		while(true) { //무한루프
			
			System.out.println("자연수 크기 판별 프로그램입니다.");
			
			System.out.println("판별할 자연수를 입력하세요(종료를 원하시면 -1입력) : ");
			
			n = s.nextInt(); //스캐너 s 오브젝트를 활용해서 정수를 입력받아 n변수에 넣어준다.
			
			if(n == -1) //만약 n값이 -1이면 다음 문장을 실행한다.
				break;
			
			if(n >= 50) {      //만약 n값이 50보다 크거나 같으면 다름 블록을 실행한다.
				if(n<100) {        // && 만약 n값이 100보다 작으면 다음 블록을 실행한다.
					System.out.println("입력한 자연수는 50~100 사이에 있네요");
				}else {   //만약 n값이 50보다 크거나 같으면 다름 블록을 실행한다.
					     // && 만약 n값이 100보다 작지 않으면 다음 블록을 실행한다.
					System.out.println("입력한 자연수는 100보다 큽니다.");
				}
			}else {
				System.out.println("입력한 자연수는 50보다 작습니다.");
			}
			
		}

	}

}
