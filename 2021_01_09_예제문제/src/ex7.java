import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		/*피보나치 수열은 앞의 두 수 를 더해서 다음 수를 만드어 나가는 수열이다.
		예를 들어 앞의 두수가 1과 1이라면 그 다음수는 2가되고 그 다음 수는 3으로 1,1,2,3,5,8,13,21...같은 식으로 진행된다.
		시작하는 피보나치수열의 10번째 수는 무엇인지 게산하는 프로그램을 완성하시오. */
		
		//Scanner s = new Scanner(System.in);
		int s1;
		int s2;
		int i;
		int sum=0;
		int temp=0;
		
		int num1 =1;
		int num2 =1;
		int num3 =0;

		
		/*System.out.println("첫번째 숫자 입력: ");
		s1 = s.nextInt();
		System.out.println("두번째 숫자 입력: ");
		s2 = s.nextInt();*/
		
		System.out.print(num1+","+num2);
		System.out.println();
		for(i=0;i<10;i++) {
			num3 = num1 + num2;
			temp = num1;
			System.out.print(num2+","+num3);
			num1 = num2;
			num2 = num3;
			
			System.out.println();
		}
		System.out.println("10번째 값은"+ temp + "입니다.");

	}

}
