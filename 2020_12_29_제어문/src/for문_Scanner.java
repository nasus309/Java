import java.util.Scanner;

public class for��_Scanner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//Scanner => Ŭ����(API Ŭ����)
		//s => ScannerŬ������ Object
		//new Scanner(System.in) => ������
		
		
		
		/**���� 1**
		int hap=0;
		int i;
		int num;
		System.out.println("�� �Է� : ");
		num = s.nextInt();
		
		
		for(i=1;i<=num;i++) {
			hap = hap + i;
		}
		
		System.out.printf("1���� %d������ ��: %d \n",num,hap);
		System.out.printf("1���� %d������ ��: %d \n",num,hap/(i-1));
		**/
		
		
		
		/**����2**
		int hap=0;
		int i;
		int num1,num2,num3;
		
		System.out.print("���۰� �Է�: ");
		num1 = s.nextInt();
		System.out.print("���� �Է�: ");
		num2 = s.nextInt();
		System.out.print("�߰��� �Է�: ");
		num3 = s.nextInt();
		
		for(i=num1;i<=num2;i=i+num3) {
			hap = hap + i;
		}
		
		System.out.printf("%d���� %d���� %d�� ������ ���� �� : %d \n",num1,num2,num3,hap);
		s.close();
		**/
		
		
		
		/**����3**/
		int a,b;
		char c;
		for(;;) {
			System.out.println("�����Ͻðڽ��ϱ�(y/n)? : ");
			c = s.next().charAt(0);
			// s.next() => ������ �Է¹޾Ƽ� ó�����ش�.
			// charAt(n) => �Է¹��� ���忡�� n+1��° ���ڸ� �����Ѵ�.
			if (c == 'y') {
				System.out.println("���� ù��° �� �Է� : ");
				a= s.nextInt();
				System.out.println("���� �� ��°�� �Է� : ");
				b = s.nextInt();
				System.out.printf("%d + %d = %d \n",a,b,a+b);
			}else {
				break;
			}
		}
		
		
//		String ss;
//		ss = s.next();
//		System.out.println("");
//		c = ss.charAt(0);
//		System.out.println("ù��° ��¥��"+c);
		
		
		
	}

}
