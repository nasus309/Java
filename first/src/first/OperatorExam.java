package first;

public class OperatorExam {

	public static void main(String[] args) {
		
		//��ȣ������
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		//����������
		int i4 = ++i3; // i3 = i3 + 1; ���� ���Ѵ����� ���� ������� i4�� �־���
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; //i3 = i3 + 1; ���� 6�� i5�� ���� i3�� i3+1�� ����? 
		System.out.println(i5);
		System.out.println(i3);
		
		//���������
		int i = 5;
		int j = 2;
		
		System.out.println( i + j );
		System.out.println( i - j );
		System.out.println( i * j );
		System.out.println( i / j ); //������ �������� i,j �ϳ��� �Ǽ���!
		System.out.println( i / (double)j );
		System.out.println( i % j );
		
		
		//�񱳿�����
		i = 10;
		j = 10;
		
		System.out.println( i == j );
		System.out.println( i != j );
		System.out.println( i < j );
		System.out.println( i <= j );
		System.out.println( i > j );
		System.out.println( i >= j );
		
		//���մ��Կ�����
		i += 10; //i = i + 10
		System.out.println(i);
		System.out.println(i -= 5);
		
		
	}

}
