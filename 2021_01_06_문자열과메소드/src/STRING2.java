import java.util.Scanner;
public class STRING2 {

	public static void main(String[] args) {
		
		/**indexOf(),lastIndexOf() 사용 예제**/
		String ss = "Java를 공부하는 중, Java는 재밌어요.^^";
		System.out.println("문자열 ==>" + ss);
		
		System.out.print("제일 처음 나오는 Java 위치 ==> ");
		System.out.println(ss.indexOf("Java"));
		System.out.print("마지막에 나오는 Java 위치 ==> ");
		System.out.println(ss.lastIndexOf("Java"));
		
		
		
		/**startsWith(),endsWith() 사용 예제**/
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 : ");
		str = s.nextLine();
		
		System.out.print("출력 문자열 : ");
		
		if (!str.startsWith("("))
			System.out.printf("(");	
		
		for (int i=0;i<str.length();i++)                //System.out.print(str); 해도됨.
			System.out.printf("%c",str.charAt(i));
		
		if (!str.endsWith(")"))
			System.out.printf(")");
		
		System.out.println(str.indexOf("ll"));  //hello 쳤을 때 괄호 뺀 인덱스 나옴. 즉 2가 나옴. 그럼 어떻게 괄호 포함? 밑에 있음.
		
		
		
        /**괄호 포함한 인덱스 구하기**/		
/*		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 : ");
		str = s.nextLine();
		
		System.out.print("출력 문자열 : ");
		
		if (!str.startsWith("("))	
			str = "(" + str;		

		if (!str.endsWith(")"))
			str = str + ")";
		
		System.out.println(str);
		System.out.println(str.indexOf("ll"));
*/
		
	}

}
