import java.util.Scanner;

public class if문_중첩_ {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int a; //정수형 변수 a를 선언
		
		System.out.println("정수를 입력하세요 : ");
		a = s.nextInt();
		
		
		if (a>50) {
			if (a<100) {
				System.out.println("50보다 크고 100보다 작군요");
			}else {
				System.out.println("와~ 100보다 크군요");
			}
		}else {
			System.out.println("50보다 작거나 같군요!");
		}

	}

}
