import java.io.IOException;
import java.util.Scanner;

public class while��_calc {
	//���ܰ� main method �ȿ��� �Ͼ��, ȣ����(�������) �ʿ� ������...? 
	//����ó�� ���ϰ����ϱ� ���� ������ ó���ش޶�! �ű⼭�� ���ϸ� main method������ ������ �ȵǸ� �ý��ۿ��� ó��...?
	public static void main(String[] args) throws IOException { 
		
		Scanner s = new Scanner(System.in);
		int a,b;
		char ch;
		int n;
		char c;
		
		
		System.out.println('A'+32);
		System.out.println((char)('A'+32));
		
		System.out.print("�빮�� �ϳ��� �Է��ϼ���:");
		c = (char)System.in.read();
		System.out.println((int)c);
		
		if(c>=65 && c<=91) {
			// 65~91 ; �빮�� A~Z
			// c = (char)(c + 32) c�� ��ȭ?�ϰ�;Ɛ�
			System.out.println((char)(c+32)); //65+32=97(�ҹ���a ����Ʈ�ڵ�)
			System.out.println(c);
		}else {
			System.out.println(c);
		}
		
		
		/*������ ���� �� ������ �ƽ�Ű �ڵ带 ���?
		while(true) {
		System.out.printf("���ڸ� �Է��ϼ���:");
		n =System.in.read();
		System.out.println(n);
		}
		--> enter Ű�� ����Ʈ�ڵ� 10�� �ڵ����� ���?
		*/
		
		
		while(true) {
			System.out.println("ù��° �� �Է� : ");
			a = s.nextInt();
			System.out.println("�ι�° �� �Է� : ");
			b = s.nextInt();
			System.out.println("����� �����ڸ� �Է��ϼ��� : ");
			ch = (char)System.in.read(); //���� Ÿ������ �ٲٱ�...��?
			
			switch(ch) {
				case '+':
					System.out.printf("%d + %d = %d �Դϴ�. \n",a,b,a+b); break;
				case '-':
					System.out.printf("%d - %d = %d �Դϴ�. \n",a,b,a-b); break;
				case '*':
					System.out.printf("%d * %d = %d �Դϴ�. \n",a,b,a*b); break;
				case '/':
					System.out.printf("%d / %d = %f �Դϴ�. \n",a,b,a/(float)b); break;
				case '%':
					System.out.printf("%d %% %d = %d �Դϴ�. \n",a,b,a%b); break;
				default:	
					System.out.printf("�����ڸ� �� �� �Է��߽��ϴ�.\n");
					
			}
		}

	}

}
