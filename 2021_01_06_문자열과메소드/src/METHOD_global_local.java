// ���������� ���� ����? 
// => ���� �޼ҵ��� ���� ��� �������� �ٲ� �� �� �ֱ� ������ ������ ����ų �� �ִ�.
public class METHOD_global_local {
	
	//static final int B =1000; ���α׷��� ����� ������ a���� 100���� �����̱� ������ ���������� ����Ѵ�. ����� �빮�ڷ� ���� ���� ��õ!
	
	//static int a = 100;
	
	static void func1(){
		/**����1**/
		/*int a = 200;
		System.out.println("func1()���� a�� ��==> " + a);*/
		
		
		/**����2**/
		System.out.println("void�� �޼ҵ�� �����ٰ� ����.");
	}
	
	static int func2() {
		return 100;
	}
	
	
	public static void main(String[] args) {
		/**����1**/
		/*func1();
		System.out.println("main()���� a�� ��==> " + a);*/	
		
		
		/**����2**/
		int a;
		
		func1();
		
		a=func2();
		System.out.println("int�� �޼ҵ忡�� ������ ��==> "+ a);
	}

}
