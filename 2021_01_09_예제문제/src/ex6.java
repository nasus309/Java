import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// ���ڷ� �̷���� ���ڿ��� ���� �� ���ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶� ���� str�� "12345" ��� ��� 15�� ���
		
		Scanner s = new Scanner(System.in);
		String ss;
		int i;
		int sum=0;
		int sss;
		
		System.out.println("���ڷ� �̷���� ���ڿ� �Է� : ");
		ss = s.nextLine();
		
		for(i=0;i<ss.length();i++) {
			sum = sum + (ss.charAt(i)-'0'); //����1���� ����0�� ���ָ� 1�̳���...!
		}
		
		System.out.println(sum);
		
		
		//sss = Integer.parseInt(s.nextLine());...???>>>....???
		
		
		//int ���ڷ� �Է¹޾Ƽ� ���ڸ� ����?
		System.out.println("���� �Է� : ");
//		sss = Integer.parseInt(s.nextLine());
		sss = s.nextInt();
		
		sum=0;
		while(sss>0) {//123
			sum = sum + sss % 10; // sum = 3
			
			sss = sss / 10; //12
		}
		
		System.out.println(sum);
		
	}

}
