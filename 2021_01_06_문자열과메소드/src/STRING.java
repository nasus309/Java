import java.util.Scanner;
public class STRING {

	public static void main(String[] args) {   /******void�� ��ȯ���� ���� �޼ҵ�******/
		
		/**length() ����**/
		/* �޼ҵ�� ����� �����Ѵ�.
		�޼ҵ�� �Է��� ���� �� �ִ�.(���� ��쵵 ����.)
		�޼ҵ�� ��� ���� �� ����ǰų�, ��ȯ ���� �����ش�.*/
		
		String ss ="IT CookBook. Java";
		int len;
		
		len = ss.length();
		
		System.out.printf("���ڿ� : %s \n",ss);
		System.out.printf("���ڿ� ���� : %d \n",len);

		
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.println("���ڿ� �Է� : ");
		
		//����ڰ� �Է��� ������ ��ȯ�Ѵ�.
		str = s.nextLine(); //enterġ���������� ���ڿ���.....? s.next()�� space�����!
		
		for (int i =0;i<str.length();i++) {
			if(str.charAt(i)=='o')
				System.out.printf("%c",'$');
			else
				System.out.printf("%c",str.charAt(i));
		}
	}
	
	
	public int aa(){    /******��ȯ���� �ִ�(intŸ��) �޼ҵ�******/
		return 10;
	}
	
	public Scanner aaa() {
		return new Scanner(System.in);
	}

}
