package first;

public class MyClassExam {

	public static void main(String[] args) {
		MyClass myclass = new MyClass(); //��ü�� �����
		myclass.method1();
		
		myclass.method2(10);
		
		int value = myclass.method3(); //return���� �޾Ƴ� ���� �ʿ�
		System.out.println(value);
		//System.out.println(myclass.method3());
		
		myclass.method4(1, 2);
		
		int value2 = myclass.method5(55);
		System.out.println(value2);
		

	}

}
