import java.util.Scanner;

public class switch_case��_2 {

	public static void main(String[] args) {
		
		/*
		Scanner s = new Scanner(System.in);
		
		int year;
		
		System.out.printf("��������� �Է��ϼ��� : ");
		year = s.nextInt();
		
		switch (year % 12) {
			case 0: System.out.println("�����̶�"); break; 
			case 1: System.out.println("�߶�"); break;
			case 2: System.out.println("����"); break;
			case 3: System.out.println("������"); break;
			case 4: System.out.println("���"); break;
			case 5: System.out.println("�Ҷ�"); break;
			case 6: System.out.println("ȣ���̶�"); break;
			case 7: System.out.println("�䳢��"); break;
			case 8: System.out.println("���"); break;
			case 9: System.out.println("���"); break;
			case 10: System.out.println("����"); break;
			case 11: System.out.println("���"); break;
		} */
		
		
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("���� �Է��ϼ��� : ");
		n = s.nextInt();
		//break �� ���������� case ���*******
		switch (n) {
			case 3:
			case 4:
			case 5:
				System.out.println("��");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("����");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("����");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("�ܿ�");
		}
		
		
		
	}

}
