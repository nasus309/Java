import java.util.Scanner;

public class do_while��_ {

	public static void main(String[] args) {
		
//		int a =100;
//		
//		while(a==200) {
//			System.out.println("while�� ����");
//		}
//		
//		do {
//			System.out.println("do while�� ����");
//		}while(a==20);
		
		
		
		int n;
		int count=0;
		Scanner s = new Scanner(System.in);
		
		
		do {
			System.out.println("�ȳ��ϼ���. �ֹ� �ްڽ��ϴ�.");
			
			if(count==0) {
				System.out.println("1.īǪġ�� 2.ī��� 3.�Ƹ޸�ī��");
			}else {
				System.out.println("1.īǪġ�� 2.ī��� 3.�Ƹ޸�ī�� 4.�׸�");
			}
			
			n = s.nextInt();
			
			if(n==4 && count==0) {
				n = n + 1;
			}
			
			switch(n) {
				case 1:
					System.out.println("īǪġ�븦 �����ϼ̽��ϴ�.");
					count++;
					break;
				case 2:
					System.out.println("ī��󶼸� �����ϼ̽��ϴ�.");
					count++;
					break;
				case 3:
					System.out.println("�Ƹ޸�ī�븦 �����ϼ̽��ϴ�.");
					count++;
					break;
				case 4:
					System.out.println("�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.");
					break;
				default:
					System.out.println("�߸� �ֹ��ϼ̽��ϴ�.");
			}
		}while(n!=4);
	}
}
