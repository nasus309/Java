import java.util.Scanner;

public class while��_ {

	public static void main(String[] args) {
		
		/**����1**/
		int i=1;
		int hap=0;
		while(i<=10) {
			
			hap += i;
			i++;
		}
		System.out.println(hap);
		
		/** ���� while���� ���� for��
		hap=0;
		for(i=0;i<=10;i++) {
			hap += i;
		}
		System.out.println(hap);
		**/
		
		
		
		/**����2**/
		int j=2;
		i=1;
		while (j < 10) {
			System.out.printf("[%d��]\n",j);
			while (i <10) {
				System.out.printf("%d * %d = %d\n",j,i,j*i);
				i++;
			}
			j++;
			i=1;
		}
		
		
		/**����3**/
		Scanner s = new Scanner(System.in);
		int a=0;
		int b=0;
		
		while(true) {
			
			try {
				System.out.println("���� ù ��°�� �Է� :");
				a = s.nextInt();
				
				System.out.println("���� �� ��° �� �Է� : ");
				b = s.nextInt();
			}catch (Exception e) {
				System.out.println("�Է°��� ������ �ֽ��ϴ�.");
			}finally {
				System.out.println("�� ���� ���� : "+(a+b));
				if(a==0 || b==0) //�߸��� ���� ������ �ʱ�ȭ �� 0 �� ����! �׷��� a==0 �̷��� �� ��!
					break;
				}
			
			
		}
	

	}
}
