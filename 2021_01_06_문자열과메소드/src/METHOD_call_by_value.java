import java.util.Scanner;

public class METHOD_call_by_value {
	
	static void func1(int a){
		a = a + 1;
		System.out.println("���޹��� a ==> " + a);
	}
	
/*	
    static Scanner hi() {
		//�������� �ڸ��� ���� �Ǵ� ����Ŭ���� Ÿ�� (--> hi(int a) ) ������ ������ �����Ǹ� 
		//������ call by value
	
		return new Scanner(System.in);
		
	}
*/
	
	public static void main(String[] args) {
		
		int a = 10;
		
		//���ϰ��� ������ System.out.println(func1()); �ϸ� 11 ������?
		System.out.println("func1() ���� ���� a ==> " + a);
		
//		Scanner s = hi();
	
		
	}

}
