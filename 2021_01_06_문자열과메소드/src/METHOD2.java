import java.util.Scanner;

public class METHOD2 {

	/**����1�޼ҵ�**/
	static int plus(int v1,int v2){
		int result;
		result = v1+v2;
		return result;
	}
	
	/**����2�޼ҵ�**/
	static int calc(int v1, int v2, int op) {
		int result;
		
		switch(op) {
		case 1: result = v1 + v2; break;
		case 2: result = v1 - v2; break;
		case 3: result = v1 * v2; break;
		case 4: result = v1 / v2; break;
		default: result = 0;
		
		/* �ٸ����
		switch(op){
		case '+':
			System.out.println("�μ��� ���� :" + (result=v1+v2));
		case '-':
			System.out.println("�μ��� ����� :" + (result=v1-v2));
		case '*':
			System.out.println("�μ��� ���� :" + (result=v1*v2));
		case '/':
			if (v2 == 0)
				break;
			else
				System.out.println("�μ��� ������� :" + (result=v1/v2));
		}
		*/
		
		}
		return result;
	}
	

	
	//���μ��� �����층�� ���� �����̴�.
	//main() -> println() -> �޼���ȣ��,ó�� -> println() ���� -> main()����
	public static void main(String[] args) {
		
		/**����1**/
		int hap;
		hap = plus(100,200);
		System.out.println("100�� 200�� plus() �޼ҵ� ����� : " + hap);
		
		
		/**����2**/
		Scanner s = new Scanner(System.in);
		int res;
		int oper, a, b;
		char c;
		
		System.out.println("��� �Է�(1:+, 2:-, 3:*, 4:/) : ");
		oper = s.nextInt();
		System.out.println("ù��° ���ڸ� �Է� : ");
		a = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է� : ");
		b = s.nextInt();
		
		/* �ٸ����
		 c = s.next().charAt(0);
		res = clac(a,b,c) �̷��� �ᵵ ��.*/
		
		res = calc(a,b,oper);
		
		System.out.println("��� ����� " + res);
	}

}
