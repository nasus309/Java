package first;

public class StringExam {

	public static void main(String[] args) {
		//str1���� hello�� ���������� hello�� ����� ����Ǵ� ������ �����̵�.
		//������ �ʴ´ٴ°Ŵ�?
		String str1 = "hello";
		//str2�� ��������� hello�� �ִ��� ���� ������ ���θ������ʰ� str1�� hello�� ����Ŵ.
		//�� str1�� str2�� ���� instance�� �����ϰ� ����. 
		String str2 = "hello";
		
		//new�� �̿��ϸ� new��� ������ ���� ��������� �ִ°��� �������� �ʰ� 
		//hello��� ���ڿ��� ���ο� instance ����(heap����)�� ����.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		//���� ����Ű�� �ִ� �޸� ������ �ּҰ� ����?
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�."); //����
		
		if(str1 == str3)
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�."); //�ٸ�
		
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� ���۷����Դϴ�."); //�ٸ�
		
		//�ѹ� ������ Ŭ������ ������ ����(String Ŭ������)
		System.out.println(str1);
		
		System.out.println(str1.substring(3)); //index 3������ ©��޶�
	
		System.out.println(str1);
	}

}
