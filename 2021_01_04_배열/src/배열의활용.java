
public class �迭��Ȱ�� {

	public static void main(String[] args) {
		
		//�迭�� ���ø����
		char stack[] = new char[5]; //0~4
		int top = 0;
		 
		stack[top] = 'A'; // top==0
		System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
		top++; 
		System.out.printf("������ ���� ��Ȳ �ִ� %d�� ���� ���� %d�� �԰�\n",stack.length,top);
		
		stack[top] = 'B'; // top==1
		System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
		top++; 
		System.out.printf("������ ���� ��Ȳ �ִ� %d�� ���� ���� %d�� �԰�\n",stack.length,top);
		
		stack[top] = 'C'; // top==2
		System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
		top++; 
		System.out.printf("������ ���� ��Ȳ �ִ� %d�� ���� ���� %d�� �԰�\n",stack.length,top);
		
		stack[top] = 'D'; // top==3
		System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
		top++; // top==4
		System.out.printf("������ ���� ��Ȳ �ִ� %d�� ���� ���� %d�� �԰�\n",stack.length,top);
		
		System.out.println();
		
		top--; // top==3
		System.out.printf("%c �ڵ����� �ͳ��� ��������\n",stack[top]);
		stack[top] =' ';
		
		top--; // top==2
		System.out.printf("%c �ڵ����� �ͳ��� ��������\n",stack[top]);
		stack[top] =' ';
		
		top--; // top==1
		System.out.printf("%c �ڵ����� �ͳ��� ��������\n",stack[top]);
		stack[top] =' ';
	}

}
