package first;

public class OperatorExam2 {

	public static void main(String[] args) {
		
		//������ �켱����
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println((a - b) * c);
		
		System.out.println(a > 5 && b > 5); //�������ڰ� �񱳿����ں��� �켱����
		
		System.out.println(a > 5 || b > 5);
		
		System.out.println(++a - 5);//���׿����ڰ� ��������ں��� �켱����.����������
		// a = a + 1�� ������ ������� ����
		//++ -- ���� ���� ���� �������߿� ���������ڶ�� �Ѵ�.
		System.out.println(a);
		
		System.out.println(a++ - 5); 
		//���������ڴ� �ٸ������� ����.�����̶��ؼ� �켱������ �ƴ�
		// a-5 ���� ���� �� a = a + 1 ����
		System.out.println(a);
		
		
	}

}
