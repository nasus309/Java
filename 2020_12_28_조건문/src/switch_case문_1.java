import java.util.Scanner;

public class switch_case��_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf(" 1~4 �߿� �����ϼ��� : ");
		a = s.nextInt();
		
		//switch_case�������� break�� ���� case�� �ɸ��� ��ġ�������� default���� ��� ���!
		switch (a) {
		case 1:
			System.out.println("1�� �����ߴ�.");
			break;
		case 2:
			System.out.println("2�� �����ߴ�.");
			break;
		case 3:
			System.out.println("3�� �����ߴ�.");
			break;
		case 4:
			System.out.println("4�� �����ߴ�.");
			break;
		default:
			System.out.println("�̻��Ѱ� �����ߴ�.");
		}
			
		
		/*
		�������� switch��
		int n;
		n = s.nextInt();
		switch(n/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			
		} */
		
		
		

	}

}
