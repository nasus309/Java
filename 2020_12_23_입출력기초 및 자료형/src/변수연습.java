
public class �������� {

	public static void main(String[] args) {
		
		int a; //4Byte
		int b,c,d; //12Byte
		a = 200;
		int x = 100;
		
		System.out.println(a);
		
		int y;
		float z;
		double w;
		
		y =100;
		z = 123.45f;
		w = 123.45;
		
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		
		int i;
		double j;
		
		i = (int)123.45f;
		j = 200;
		float e = 200; //%f �� ���� 200 �ȵȴ�
		System.out.println(e);
/*		System.out.printf("%d * %f = %f", 1,2, 1*2); 
		--> �̰Ŵ� �� ��������? ; %�� ���������ϴ°Ŷ� �ٸ�~!! float a = 2 �� ����*/
		
		System.out.printf("i�� �� ==> %d \n",i);
		System.out.printf("j�� �� ==> %f \n",j);
		System.out.println();
	
		
		//����ȯ
/*		int a,b = 100;
		double x = 10.0;
		
		b=x; --> ���� ��! double b �� �ٲ� ��� */
		
		//��������
		
		int a1,b1;
		int c1,d1;
		
		a1 = 100 + 100;
		b1 = a1 + 100;
		c1 = a1 + b1 - 100;
		d1 = a1 + b1 + c1;
		
		System.out.printf("a1,b1,c1,d1�� �� ==> %d, %d, %d, %d \n",a1,b1,c1,d1);
		
		a1=b1=c1=d1=100;
		
		System.out.printf("a1,b1,c1,d1�� �� ==> %d, %d, %d, %d \n",a1,b1,c1,d1);
		
		a1 = 100;
		a1 = a1 + 200;
		System.out.printf("a�� �� ==> %d \n",a1);
		
		
		
		
	
	
	}

}
