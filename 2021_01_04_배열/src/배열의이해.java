import java.util.Scanner;
public class �迭������ {

	public static void main(String[] args) {
		
		int[] a;//���ʺ����� �ƴ϶� ��������, stack�� �ƴ� heap�� �����.but a�� ������? stack�� ���� �� ����.
		int b = 100;
		a = new int[100]; //100�� ¥�� �迭.400byte�� ����.(index�� 0~99) 
		
		System.out.println(b);
		System.out.println(a[99]);
		a[0]=100;
		a[72]=200;
		//a[100]=3; --> �����ϱ� ������ error�ȶ�. ��? heap�� ����ż� �׷���!
		
		
		/* a[0]~a[99]���� ��� ���
		for (int i=0;i < a.length; i++) {
			System.out.println(a[i]);
		} */
		
		
		
		/**����1**/
		int i;
		/*Scanner s; //Scanner�� ���� ��  �ִ� ������ ����.
		s = new Scanner(System.in);
		
		int[] aa = new int[4]; //4���� ����
		int hap=0; 
	
		for (i=0;i<aa.length;i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ���: ",i+1);
			aa[i] = s.nextInt();
			hap += aa[i];
		}
		
		System.out.println("�հ� : "+hap);
		
		int c[] = {1,2,3,4,5,6,7,8}; //8���� ����
		System.out.println(c.length); //�迭�� ũ��
		*/
		
		
		/**����2** for each ����*/
		int arr[] = {2,3,4,5,6,7,8,9,10}; 
		for(i=0;i<arr.length;i++){ //�迭�� �����ؼ� ó���ϴ� �ݺ�
			System.out.println(arr[i]);
		}
		
		for(int x:arr) { //�迭�� ���Ҹ� 0���� ������ �ϳ��� �����ִ� �ݺ�, for each����(�迭���� �������� Ÿ�Կ����� ��밡��?)
			System.out.println(x);
		}
		
		
		
		/**����3**/
		String ss[] = {"�迭","�� ���ó�","����� ����.","�������"};
		
		for(String x : ss) {
			System.out.println(x);
		}
		
		double d[] = {1.0,20.0,3,14,33.22};
		
		for(double x : d) {
			System.out.println(x);
		}
		
		short SHORT[] = new short[10];
		
		char CHAR[] = new char[5];
		
		long LONG[] = new long[100];
		
		
		
		
		/**����**/
		int p[] = new int[5];
		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		
		System.out.println(p); //�迭�� ����ִ� �޸��� �ּҸ� ����. 
							   //p������ ������ ����Ű���ִ� �������� �ּҸ� ������ ����~
		
		
		
		//**************���������� ������� �迭****************
		Scanner sw[] = new Scanner[100]; //������ �����������. object�� ���� X.
		sw[0] = new Scanner(System.in); //�������� object������ �������.
		

		
		
	}
		
}

		
