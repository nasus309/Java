
public class ����Test {

	public static void main(String[] args) {
	
	//default ������
	������ǰ LedTV = new ������ǰ();
	������ǰ ��Ÿ�Ϸ� = new ������ǰ();
	
	//�Ķ��Ÿ�� �̿��� ������, �޼ҵ� �����ε�.
	������ǰ ��Ÿ�Ϸ�1 = new ������ǰ(2000);
	//��Ÿ�Ϸ�1.����⵵; �� �� �ȵ�~~~~~~~~??
	System.out.println(��Ÿ�Ϸ�1.����⵵);
	
	// LedTV.���� = 1000000; ->private�� ���� ��.
	// System.out.println(LedTV.����);
	
	System.out.println(LedTV.get����()); //0
	LedTV.set����(10000);
	System.out.println(LedTV.get����()); //10000
	LedTV.������ȿ����� = 1;
	
	LedTV.set����(false);
	System.out.println(LedTV.get����());
	
	}
}
