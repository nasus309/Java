import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		//����� ���� �ٱ��ϴ� �ִ� ���� �� �ִ� ����� ���� �Է� �޾�, �ٱ����� ������ �Է��ϴ� ���α׷��� ����� ������.
		//ex) ����� ���� 138���� �ִ� ���� �� �ִ� ����� ���� 10����� �ٱ����� ������ 14��.
		
		Scanner s = new Scanner(System.in);
		int �����;
		int max;
		System.out.println("����� ���� �Է��ϼ��� : ");
		����� = s.nextInt();
		System.out.println("�ٱ��ϴ� �ִ� ������ �ִ� ����� ���� �Է��ϼ��� : ");
		max = s.nextInt();
		
		if ((����� % max) == 0) { //if((����� % max) >0) �̷������ε� �� �� ����..
			System.out.println(�����/max);
		}else {
			System.out.println((�����/max)+1);
		}	
		
	}

}

