
public class ���������İ��迭 {

	public static void main(String[] args) {
		
		//**������,�Ǽ���**
		
		int p = 10;
		int q = 0x10; // 0x -> 16���� ǥ��
		int r = 0b10; // 0b -> 2���� ǥ��
		
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
		int l = 100, m = 200;
		double n = (double) l/m;
		float result;
		
		result = l/m;
		
		System.out.printf("%f \n", result);
		System.out.println(n);
		
		float x = 0.1234567890123456789012345f; //�Ҽ��� 8�ڸ�
		double y = 0.1234567890123456789012345; //�Ҽ��� 17�ڸ� ---> ???????????? ��������
		float x1 = 0.00000000001f;
		
		System.out.println(x1);
		
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%30.25f \n",x);
		System.out.printf("%30.25f \n", y);
		
		//**������**
		
		char a,b,c,d,e;
		
		a = 'A';
		System.out.printf(" %c \t",a);
		System.out.printf(" %d \n",(int)a);
		
		b = 'a';
		c = (char) (b+1);
		System.out.printf(" %c \t",b);
		System.out.printf(" %c \n",c);
		
		d = '��';
		e = (char) (d+1);
		System.out.printf("%d",(int)d);
		System.out.printf(" %c \n", e);

		
		//i 32�ϸ� ������?
		for ( int i =32;i<127;i++) {
			System.out.printf("%c\n", i);
		}
		
		//**Boolean��**
		
		boolean boo1,boo2;
		
		//%b�ʹ� ��� �ٸ���? %b�� ������ �����ϸ� true, null�̰ų� false �̸� false��.
		
		boo1 = true;
		System.out.printf("%s \n", boo1);
		System.out.println(boo1);
		
		boo2 = (10==20); //false
		System.out.printf("%s \n", boo2);
		System.out.println(boo2);
		
		
		//**���ڿ�**
		
		int t = 100;
		String s = "�ȳ��ϼ���";
		/****int�� stack������ ���� string�� heap������ ��. 
		string�� stack�������� heap�� �ּҰ��� ��.
		 --> ��? string�� �ٸ� ��������� �޸� ���� ���ڼ��� ���� ����Ʈ�� ���ϴ�
		     ������? ���� data?(��������)�̱� ������
		     ���������� stack���� ����ũ��� �Ҵ� but heap�� �ּҸ� stack�� �Ҵ�!****/
		
		String str1 = "IT CookBook �Դϴ�";
		String str2 = "10";
		String str3 = "20";
		str2 = str2 + str3;
		
		//st1�� �̹� ����Ǿ��ִ� �ּ��� heap�� �ش��ϴ� �����͸� �ٲ�������
		//str2�� heap�� ���ο� �����͸� ������ �ּҸ� ����.
		
		str1 = "JAVA �Դϴ�.";
		
		System.out.printf("%s \n", str1);
		System.out.printf("%s \n", str2);
		
		
	}

}
