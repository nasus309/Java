import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		/*�Ǻ���ġ ������ ���� �� �� �� ���ؼ� ���� ���� ����� ������ �����̴�.
		���� ��� ���� �μ��� 1�� 1�̶�� �� �������� 2���ǰ� �� ���� ���� 3���� 1,1,2,3,5,8,13,21...���� ������ ����ȴ�.
		�����ϴ� �Ǻ���ġ������ 10��° ���� �������� �Ի��ϴ� ���α׷��� �ϼ��Ͻÿ�. */
		
		//Scanner s = new Scanner(System.in);
		int s1;
		int s2;
		int i;
		int sum=0;
		int temp=0;
		
		int num1 =1;
		int num2 =1;
		int num3 =0;

		
		/*System.out.println("ù��° ���� �Է�: ");
		s1 = s.nextInt();
		System.out.println("�ι�° ���� �Է�: ");
		s2 = s.nextInt();*/
		
		System.out.print(num1+","+num2);
		System.out.println();
		for(i=0;i<10;i++) {
			num3 = num1 + num2;
			temp = num1;
			System.out.print(num2+","+num3);
			num1 = num2;
			num2 = num3;
			
			System.out.println();
		}
		System.out.println("10��° ����"+ temp + "�Դϴ�.");

	}

}
