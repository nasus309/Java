import java.util.Scanner;
public class STRING {

	public static void main(String[] args) {   /******void는 반환값이 없는 메소드******/
		
		/**length() 예제**/
		/* 메소드는 기능을 수행한다.
		메소드는 입력이 있을 수 있다.(없는 경우도 있음.)
		메소드는 기능 수행 후 종료되거나, 반환 값을 내어준다.*/
		
		String ss ="IT CookBook. Java";
		int len;
		
		len = ss.length();
		
		System.out.printf("문자열 : %s \n",ss);
		System.out.printf("문자열 길이 : %d \n",len);

		
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.println("문자열 입력 : ");
		
		//사용자가 입력한 문장을 반환한다.
		str = s.nextLine(); //enter치기전까지의 문자열들.....? s.next()는 space기반임!
		
		for (int i =0;i<str.length();i++) {
			if(str.charAt(i)=='o')
				System.out.printf("%c",'$');
			else
				System.out.printf("%c",str.charAt(i));
		}
	}
	
	
	public int aa(){    /******반환값이 있는(int타입) 메소드******/
		return 10;
	}
	
	public Scanner aaa() {
		return new Scanner(System.in);
	}

}
