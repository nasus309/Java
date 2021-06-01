import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// 숫자로 이루어진 문자열이 있을 때 각자리의 합을 더한 결과를 출력하는 코드를 완성하라 만일 str이 "12345" 라면 결과 15를 출력
		
		Scanner s = new Scanner(System.in);
		String ss;
		int i;
		int sum=0;
		int sss;
		
		System.out.println("숫자로 이루어진 문자열 입력 : ");
		ss = s.nextLine();
		
		for(i=0;i<ss.length();i++) {
			sum = sum + (ss.charAt(i)-'0'); //문자1에서 문자0을 빼주면 1이나옴...!
		}
		
		System.out.println(sum);
		
		
		//sss = Integer.parseInt(s.nextLine());...???>>>....???
		
		
		//int 숫자로 입력받아서 각자리 덧셈?
		System.out.println("숫자 입력 : ");
//		sss = Integer.parseInt(s.nextLine());
		sss = s.nextInt();
		
		sum=0;
		while(sss>0) {//123
			sum = sum + sss % 10; // sum = 3
			
			sss = sss / 10; //12
		}
		
		System.out.println(sum);
		
	}

}
