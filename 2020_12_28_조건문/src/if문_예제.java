import java.util.Scanner;

public class if��_���� {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("������ �Է��ϼ��� : ");
		a = s.nextInt();
		
		//�Է��� ���� �����̸� ����� �ٲ��ְ� ����� �ԷµǸ� �״�� ����ϴ� ���밪 ���α׷��� if�� ����ؼ� ��������.
			if (a < 0) {
				//System.out.printf("�Է°��� ���� ���� %d �Դϴ�.",Math.abs(a));
				System.out.printf("�Է°��� ���� ���� %d �Դϴ�.",a*-1);
			}else
				System.out.printf("�Է°��� ���� ���� %d �Դϴ�.",a);
		
		/*
		//3�� 4�� ����� �Ǻ��ϱ�
		while(true) {
			System.out.println("������ �Է��ϼ��� : ");
			a = s.nextInt();
			
			if (a==-1)
				break;
			
			if (a % 3 == 0) {
				if (a % 4 == 0) {
					System.out.printf("%d�� 3�� 4�� ������Դϴ�.\n",a);
				}else {
					System.out.printf("%d�� 3�� ����Դϴ�.\n",a);
				}
			}else {
				System.out.printf("%d�� 3�� ����� �ƴմϴ�.\n",a);
			}
		}
		
		*/
		
		
		
		/*
		�������� �Ǵ��ϴ� ���α׷�!
		int year;		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�⵵�� �Է��ϼ��� : ");
		
		year = s.nextInt();
		
		if (year % 4 ==0 && year % 100 != 0) {
			System.out.printf("�Է��Ͻ� �⵵ %d�� �����Դϴ�.",year);
		}else {
			System.out.printf("�Է��Ͻ� �⵵ %d�� ������ �ƴմϴ�.",year);
		} */
		
		
		
	}

}
