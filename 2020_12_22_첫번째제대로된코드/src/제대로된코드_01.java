
public class ����ε��ڵ�_01 {

	public static void main(String[] args) {
		// 0 0 0 0 0 0 0 0 = 8bit => 1Byte(ASCII �ƽ�Ű�ڵ�) -> 128(2^8)����
		// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 = 16bit => 2Byte(UTF(�����ڵ�)) -> 65536��
		
		int a,b; //������ ������ �� �ִ� ����(����) a�� �����
		int result;
		a = 100;
		b = 50;
		// a = b; �ϸ� a�� b�� ��(50)�� ��. 
		
		
		result = a + b;
		System.out.println(a+ "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a+ "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a+ "*" + b + "=" + result);
		
		// b = 0; --> ���ڰ� 0�� �Ǳ⶧���� ������.
		
		result = a / b;
		System.out.println(a+ "/" + b + "=" + result);
		
		System.out.println("���� "+"����Ŀ�");
		
		
	}

}
