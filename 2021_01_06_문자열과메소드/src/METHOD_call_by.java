class myChar{
	char x;
	char y;
}

public class METHOD_call_by {
	
	static void Int(int a) {
		a = 100000;
		//a���� 100000������ n�� 1000��
	}
	
	static void func1(char x, char y) { // call by value (�������ڿ�...char�� �־)
		// x =ch.x�� ���� 'A' �� ��, y = ch.y ���� 'z'�� ��.
		char imsi;
		imsi = x;
		x = y;
		y = imsi;
		
		//�ٲ�� �ϴµ� stack�� ����ƴٰ� ����.
	}
	
	static void func2(myChar ch) { //ch�ȿ� ch(main�޼ҵ忡�ִ°�)�� ����ִ� �ּҸ� �����ؼ� �Ѱ��. func2�� ch�� m �̷��ŷ� �ٲ��� ��� ����.
		char imsi;
		imsi = ch.x;
		ch.x = ch.y;
		ch.y = imsi;
	}
	
	static void changeChar(char a,char b) {
		
		char imsi;
		imsi = a;
		a = b;
		b = imsi;
		
	}
	
	static void changeChar(myChar m) {
		char imsi;
		imsi = m.x;
		m.x = m.y;
		m.y = imsi;
	}

	
	public static void main(String[] args) {
		
		char x = 'A', y ='Z';
		System.out.printf("������ : x = %c, y = %c\n",x,y);
		func1(x,y);
		System.out.printf("���� ������ �� : x = %c, y = %c\n\n",x,y);
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'z';
		System.out.printf("������ : x = %c, y = %c\n",ch.x,ch.y);
		func2(ch);
		System.out.printf("���� ������ �� : x = %c, y = %c\n\n",ch.x,ch.y);
		
		
		
		Integer n = 1000;
		System.out.println(n);
		Int(n);
		System.out.println(n);
		
		myChar Cc = new myChar();
		Cc.x ='A';
		Cc.y ='Z';
		changeChar(Cc.x,Cc);
		System.out.println(Cc.x + " " +Cc.y);
		

	}
	
	static void changeChar(char c, myChar m) {
		m.y = (char) (c+10); //m.y and Cc.y = c+10
		c='Q';
	}

}
