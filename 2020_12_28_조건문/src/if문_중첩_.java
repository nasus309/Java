import java.util.Scanner;

public class if��_��ø_ {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int a; //������ ���� a�� ����
		
		System.out.println("������ �Է��ϼ��� : ");
		a = s.nextInt();
		
		
		if (a>50) {
			if (a<100) {
				System.out.println("50���� ũ�� 100���� �۱���");
			}else {
				System.out.println("��~ 100���� ũ����");
			}
		}else {
			System.out.println("50���� �۰ų� ������!");
		}

	}

}
