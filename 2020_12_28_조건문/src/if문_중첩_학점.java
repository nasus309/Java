import java.util.Scanner;

public class if��_��ø_���� {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("������ �Է��ϼ��� : ");
		a = s.nextInt();
		
//		if (a >= 90)
//			System.out.printf("A");
//		else
//			if (a >= 80)
//				System.out.printf("B");
//			else
//				if (a >= 70)
//					System.out.printf("C");
//				else
//					if (a >= 60)
//						System.out.printf("D");
//					else
//						System.out.printf("F");
		
		if (a >= 90)
			System.out.printf("A");
		else if (a >= 80)
			System.out.printf
			("B");
		else if (a >= 70)
			System.out.printf("C");
		else if (a >= 60)
			System.out.printf("D");
		else
			System.out.printf("F");
		
		
		System.out.println("�����Դϴ�.");
		
		
		

	}

}
