package first;
import java.util.Scanner;
//scanner는 어디론가부터 값을 입력받고 싶을 때 사용하는 class

public class DoWhileExam {

	public static void main(String[] args) {
		
		int value = 0;
		Scanner scan = new Scanner(System.in); //키보드로부터 값을 입력받음
		
		do{
			//반복할 문장들 --> 무조건 한번은 실행!
			value = scan.nextInt(); //정수값을 입력받음
			System.out.println("입력받은 값:"+value);
		}while(value != 10);
		
		System.out.println("반복문 종료!");

	}

}
