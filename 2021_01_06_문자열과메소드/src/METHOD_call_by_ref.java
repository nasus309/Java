import java.util.Scanner; //������� �ִ� Ŭ����, �Ϲ������� API��� �θ��ϴ�. ���̺귯����� ��.

class ����{
	int a;
	int b;
}

class ���{
	
}

class myInt{
	int a;
}

public class METHOD_call_by_ref {
	
	static void func1(myInt m) {  // m���� myInt Ÿ���� �޾����.
		m.a = m.a + 1;
		System.out.println("���޹��� a ==> " + m.a);
	}
	
	static void func2(int a){
		a = a + 1;
		System.out.println("���޹��� a ==> " + a);
	}

	
	public static void main(String[] args) {
		
		//Ŭ�������� object�� ����� ���
		//Ŭ������ ������(������Ʈ��) = new Ŭ������(������ ��������~��������~);
		
		myInt m = new myInt(); // myInt()�� ������ ��� �޼ҵ�! => Ŭ�����κ��� object(����)�� �������ش�.
		myInt n = new myInt();
		
		m.a = 10;
		
		func1(m);
		System.out.println("func1() ���� ���� a ==> " + m.a); //call by ref
		
		func2(m.a);
		System.out.println(m.a); //call by value ���⼭ m �� ������Ű�ѳ�? �̰� ��value?
		System.out.println(m);//ref
		
		��� �質�� = new ���();
		
		/*�質��.method() �� ������ ����? 
		Ŭ���� �ȿ� �ƹ������� ���object��� Ŭ������ ���̽����� ���������?*/
		
		���� ȣ���� = new ����();
		ȣ����.a = 1;
	}

}


