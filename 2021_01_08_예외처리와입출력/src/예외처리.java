
public class ����ó�� {
	
	static void xxxx(Exception c) {}
	
	
	public static void main(String[] args) {
		
		int a[][] = new int[4][5];
		String ss = "�ȳ��ϼ���";
		a[3][4] = 100;
		Exception c = new Exception(); //����� ���� Ŭ������ �ƴ�, ���̺귯�� Ŭ����(API)
		xxxx(c); //call by ref
		
		int ����,�μ�Ƽ��;
		
		���� = 50000000;
		//�μ�Ƽ��� ������ 0.2 
		
		try {
			�μ�Ƽ�� = (int)(����*0.002); //Logic ���� -> ������ 0.2�� ���ؾߴµ� ���α׷��� �� �� ®��..
			System.out.printf("���� : %d, �μ�Ƽ�� : %d\n",����,�μ�Ƽ��);
			
		}catch (Exception ����) {
			����.printStackTrace(); //� ������ �Ͼ���� ������ ����ʹ�.
		}
		
		int aa[] = new int[3];
		try {
			aa[3] = 100;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��");
		}
		
		try {
			aa[2] = 100 / 0; //���⼭ ������ ���� ��������� �����ϰ� try������ �Ѿ.
			aa[3] = 100;
		}catch(ArithmeticException e) {
			System.out.println("��������� �߻��߽��ϴ�. 0���� ������ ���� �����Դϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ���� ������ �߻��߽��ϴ�. �迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��.");
		}catch(Exception e) { //Exception ����(logic �������� �� �����)�� �Ǹ������� �������.
			System.out.println("������ ���� ������ �߻��߽��ϴ�.");
			e.printStackTrace(); //�̰� �ɾ��ָ� ���� �߻� �޼��� �����~
		}finally { //�������ο� ������� ������ �����.
			System.out.println("���α׷��� ����˴ϴ�.");
		}
		
		int x =100, y=0;
		int result;
		
		try {
			result = x/y;
		}catch(ArithmeticException e) {
			System.out.print("�߻� ����==> ");
			System.out.println(e.getMessage());
		}
		
		//�����޼��� ���� �����
		
		x = 100;
		y = 0;
		
		try {
			if(y==0)
				throw new Exception("0���� ���������? �ȵ˴ϴ�.");
			result = x/y;
		}catch (Exception e) {
			System.out.print("�߻� ����==> ");
			System.out.println(e.getMessage());
		}
		
		
		
		
		

	}
	
	
}
