
public class ��������� {

	public static void main(String[] args) {
		
		int a = 2, b = 3, c = 4;
		int result1, mok, namugi;
		double result2 = 1.01;
		
		result1 = a+b-c;
		System.out.println(result1);
		
		result1 = a+b*c;
		System.out.println(result1);
		
		
		System.out.println(result2); //�̰� �� 1.500000�ƴ�
		
		mok = c / b;
		System.out.println(mok);
		
		namugi = c % b;
		System.out.println(namugi);
		
		
		//���� ����������
		a = 1;
		System.out.println(++a); //2
		System.out.println(++a); //3
		
		//���� ����������
		a=1;
		System.out.println(a++); //1 
		System.out.println(a++); //2
		
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		

		
		
	}

}
