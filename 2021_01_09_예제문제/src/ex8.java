import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// �־��� ���ڿ��� ���� �� ���ڿ� ���� ���ڰ� �ִ����� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		String str = "�ȳ���1�ʴϱ�.";
		Scanner s = new Scanner(System.in);
		str=s.nextLine();
		boolean b = false;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >='0' && str.charAt(i)<='9'  ) {
				System.out.printf("%d�ڸ� ���ڴ� ������.\n",(i+1));
				b = true;
			}
		}
		
		if (b==false) {
			System.out.println("�Է��� ���ڿ�"+str+"�� ���ڰ� �����ϴ�.");
		}else {
			System.out.println("�Է��� ���ڿ�"+str+"�� ���ڰ� �ֽ��ϴ�.");
		}
		

	}

}
