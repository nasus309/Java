
public class ����±��� {

	public static void main(String[] args) {
		
		/*�޼ҵ� : Ư�� ����� ó��, �ٸ� ������ �Լ���� �� ; �޼ҵ��̸�()�� ����
                 �޼ҵ忡 ���� ��ȣ �ȿ� �Ķ����(����)�� �ʿ��� ��쵵 ����.
          �� �� : �ʿ��� �����͸� �����ϴ� ����.(�������� ����) ;�ַ� Ŭ���������̸�.�Ӽ� �������� ���*/
		
		//**print()�� printf() ����ϱ�
		
		
		//printf()�� format�� �������� ������ print()�� ����.
		System.out.printf("�ȳ��ϼ���");
		System.out.printf("�ȳ��ϼ���");
		//System.out.printf(100); --> **����** ; printf()�� ���� �ܿ� �ٸ� Ÿ���� format�� �������־����.
		System.out.printf("%d", 100); // {"%d" : ����, "%f" : �Ǽ�, "%c" : ����, "%s" : ���ڿ�}
		System.out.printf("%f", 100.00); //default �Ҽ��� 6�ڸ�
		
		
		System.out.print("\n");
		
		System.out.print(100.00); //default �Ҽ��� 1�ڸ�
		System.out.print(100);
		System.out.print("�ȳ��ϼ���");
		
		
		System.out.print("\n");
		
		System.out.printf("100+100");
		System.out.printf("\n");
		System.out.printf("\n"); // tab��ŭ �̵�
		System.out.printf("%d",100+100);
		System.out.printf("\n");
		System.out.printf("300");
		System.out.printf("%f",3.14);
		
		System.out.print("\n");
		
		System.out.print(100);
		System.out.print(" ");
		System.out.print(200);
		
		System.out.print("\n");
		
		//��¼��� ������ �̿��ϱ�
		System.out.printf("%d %d %f", 100,200,3.14);
		System.out.print("\n");
		System.out.printf("%d %f %f %c %c %s", 23,1.0,12.2,'a','��',"�ȳ�");
		System.out.print("\n");
		System.out.printf("%d + %d = %d", 100,200,100+200);
		System.out.print("\n");
		System.out.printf("%d / %d = %.1f", 100,200,100.0/200.0);
		System.out.print("\n");
		System.out.println("100 " + "+" + " 200 " + " = " + (100+200));
		System.out.println("100 " + "/" + " 200 " + " = " + (100.0/200.0));
		
		int a = 100;
		int b = 200;
		
		System.out.printf("%d + %d = %d",a,b,a+b);
		
		System.out.print("\n");
		
		//������
		
		a = 2;
		b = 1;
		System.out.printf("%d * %d = %d", a,b, a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.printf("%d * %d = %d \n", a,b = b + 1,a*b);
		System.out.print("\n");
		
		
		//10������ 16������ �ٲٱ�
		System.out.printf("%x",15);
		System.out.print("\n");
		//boolean�� ���� ������ ������ true��.
		System.out.printf("%b \n",0);
		System.out.printf("%b \n",null);
		System.out.printf("%b",false);
		System.out.print("\n");
		
		
		//�ڸ����� ���� ���
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		
		System.out.printf("%s\n", "Hi-Java");
		System.out.printf("%10s\n", "Hi-Java");
		
		//�پ��� ���� Ȱ��
		System.out.printf("\n�ٹٲ�\n����\n");
		System.out.printf("\t��Ű\t����\n");
		System.out.printf("�̰���\r����ϴ�\n");
		System.out.printf("���ڰ�\"����\"�Ǵ� ȿ��\n");
		System.out.printf("\\\\\\ �������� ���� ���\n");
		

		
		
		
	

	}

}
