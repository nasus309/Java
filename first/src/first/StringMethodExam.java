package first;

public class StringMethodExam {

	public static void main(String[] args) {
		//String str = new String("hello")
		String str = "hello";
		System.out.println(str.length());
		System.out.println(str.concat(" world")); //���ڿ��� ����
		System.out.println(str); //hello �� ����
		//str = str.concat(" world"); --> hello world�� ��
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 4));
	}

}
 