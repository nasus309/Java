// ���������� ���� ����? 
// => ���� �޼ҵ��� ���� ��� �������� �ٲ� �� �� �ֱ� ������ ������ ����ų �� �ִ�.
public class METHOD_test {
	
	//static final int B =1000; ���α׷��� ����� ������ a���� 100���� �����̱� ������ ���������� ����Ѵ�. ����� �빮�ڷ� ���� ���� ��õ!
	
	static int a = 100;
	
	static void print(String s, �ؾ a) {
		s="hi"; //hello�� �ٸ� heap������ ����Ǿ��ִ� hi�� ����...?
		a.n =1000;
		System.out.println(s);
		System.out.println(a);
	}
	
	static void func1(){
		int a = 200;
		System.out.println("func1()���� a�� ��==> " + a);
	}
	
	
	public static void main(String[] args) {
		func1();
		System.out.println("main()���� a�� ��==> " + a);
		
		�ؾ b = new �ؾ();
		b.n = 100;
		String s ="hello";
		
		print(s,b);//hello, �ؾ object
		System.out.println(s);
		System.out.println(b.n);
		
	}

}
