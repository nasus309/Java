package first;

public class StringMethodExam {

	public static void main(String[] args) {
		//String str = new String("hello")
		String str = "hello";
		System.out.println(str.length());
		System.out.println(str.concat(" world")); //문자열을 붙임
		System.out.println(str); //hello 만 나옴
		//str = str.concat(" world"); --> hello world가 됨
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 4));
	}

}
 