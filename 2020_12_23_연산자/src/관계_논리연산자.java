
public class ����_�������� {

	public static void main(String[] args) {
		
		//���迬����
		int a = 10, b = 20;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.printf("%d = %d�� %s�̴�\n",a,b,a=b); //a=b �߱� ������ %s�� 20�� ��.
		
		
		
		//�������� 
		a = 99;
		//���迬���ڰ� �������ں��� ������!
		System.out.println("AND ���� : "+(a>=100 && a<=200));
		System.out.println("OR ���� : "+(a>=100 || a<=200));
		System.out.println("NOT ���� : "+ !(a==100));
		
		
		int num1 = 100, num2 = -200;
		
		boolean c = (num1 !=0 );
		boolean d = (num2 !=0 );
		
		System.out.println("����� AND ���� : "+ (c&&d));
		System.out.println("����� OR ���� : "+ (c||d));
		System.out.println("����� NOT ���� : "+ (!c));
	}

}
