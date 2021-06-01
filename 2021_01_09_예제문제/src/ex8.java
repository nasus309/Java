import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// 주어진 문자열이 있을 때 문자열 내에 숫자가 있는지를 판별하는 프로그램을 작성하시오.
		
		String str = "안녕하1십니까.";
		Scanner s = new Scanner(System.in);
		str=s.nextLine();
		boolean b = false;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >='0' && str.charAt(i)<='9'  ) {
				System.out.printf("%d자리 글자는 숫자임.\n",(i+1));
				b = true;
			}
		}
		
		if (b==false) {
			System.out.println("입력한 문자열"+str+"는 숫자가 없습니다.");
		}else {
			System.out.println("입력한 문자열"+str+"는 숫자가 있습니다.");
		}
		

	}

}
