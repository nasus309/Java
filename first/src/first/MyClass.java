package first;

public class MyClass {
	
	//public ����Ÿ�� �޼ҵ�� (�Ű�������) { �ʿ��� ��� ���� }
	//void --> ����Ÿ�� ����
	public void method1() {
		System.out.println("m1�� �����..");
	}
	
	//������ �޾Ƶ��̰� return�� x
	public void method2(int x) {
		System.out.println(x + "�� �̿��� m2 ����");
	}
	
	//�ƹ��͵� �޾Ƶ����� �ʾ����� �������� ����
	public int method3() {
		System.out.println("m3����");
		return 10;
	}
	
	//���� 2���� �޾Ƶ��̰� ������ x
	public void method4(int x, int y) {
		System.out.println( x + y + "m4 ����");
	}
	
	
	//���� y�� �޾Ƽ� ������ ����
	public int method5(int y) {
		System.out.println(y + "�̿��� m5 ����");
		return y*2;
	}
}
