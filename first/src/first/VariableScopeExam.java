package first;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;	
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value); //�Ű������� ����� value 
		//value --> �������� �ش� �޼��� �� �� 
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);    --> Error
//		System.out.println(value);         --> Error
		System.out.println(value2);
	}
	
	public static void aaa(int x) {
		String s ="��";
		System.out.println("����");
	}
	
	
	//��� Ŭ������ �ν��Ͻ�ȭ ���� ���� ä�� ����� �� ����!!(new ���ΰ� ���ϴ°� ����)
	//main �޼��忡�� static �̶�� Ű���尡 �پ�����.
	/*�ش� Ŭ������ new���� �ʾ������� static ������
	class(�� �ʵ�)�� �ν��Ͻ�ȭ ���� �ʾƵ� ���� �־���.*/
	//static�� �ż��峻���� static���� ���� �ʵ�� ��� X --> �ش� Ŭ������ instanceȭ �ȉ��� �� ���־
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		//��ó�� �ϸ� ������
		System.out.println(staticVal); //�ν��Ͻ�ȭ �� �ʵ�� ��밡��.
		System.out.println();
		
		//static �� �޼ҵ忡�� static���� ���� ������ ����ϴ� ���
		//��ü�� �����ϰ� ����ϸ� ��.
		VariableScopeExam v1 = new VariableScopeExam(); // Ŭ���� �ν��Ͻ�ȭ ��Ű��
		System.out.println(v1.globalScope); //��������.�ʵ��?
		
		VariableScopeExam v2 = new VariableScopeExam(); //globalScope�� ������ �� �ִ� ������ ������ ��.
		v1.globalScope = 10; //v1�� ������ �ִ� globalScope�� ���� ����.
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		v2.scopeTest2(10);
		
		//static�� �ʵ�� instance �����ÿ� ����°� �ƴϰ�
		//���� ������ �� �ִ� ������ �ϳ��ۿ� ����(���� ����)
		// --> Ŭ���� ����(static�� ����)��� ��.

		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		//�̷��� �ϸ� 100�� ����.
		/*static�� �ʵ�� �ν��Ͻ� �����ÿ� ��������°� �ƴϰ�
		 ���� ������ �� �ִ� ������ �ϳ��ۿ� ����.���� ���� ->Ŭ���� ����*/
		//�۷ι� ������ �ν��Ͻ��� ������ �� ��������Ƿ� �ν��Ͻ�����.
		//Ŭ���� �̸��� ���� ����ϴ� ���� ���� --> Ŭ�����̸�.Ŭ����������
		System.out.println(VariableScopeExam.staticVal); //class ������ class�̸��� ���� ���
				
				
		
	}

}
