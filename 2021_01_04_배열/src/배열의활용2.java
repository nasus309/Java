import java.util.Scanner;

public class �迭��Ȱ��2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char[] stack = new char[5];
		int top=0;
		
		char carName = 'A';
		int select = 9;
		
		while (select != 3) {
			System.out.printf("<1>�ڵ��� �ֱ� <2>�ڵ��� ���� <3>�� : ");
			select = s.nextInt();
			switch(select){
			case 1:
				if(top>=5) {
					System.out.println("�ͳ��� �� ���� ���� ����");
				}else {
					stack[top] = carName++;
					System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
					top++;
				}
			break;
				
			case 2:
				if(top<=0) {
					System.out.println("�������� �ڵ����� ����");
				}else {
					top--;
					System.out.printf("%c �ڵ����� �ͳο��� ����\n",stack[top]);
					stack[top] =' ';
				}
				break;

			case 3:
				System.out.printf("���� �ͳο� %d�밡 ����.\n",top);
				System.out.println("���α׷��� �����մϴ�.");
				break;
					
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}

	}

}
