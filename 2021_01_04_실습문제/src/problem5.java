import java.util.Scanner;
public class problem5 {

	public static void main(String[] args) {
		/* 1���� 100������ ���� �����ϰ� �����ϰ� ������ ���� ���߸� ����Ǵ� �̴ϰ����� �����Ͻÿ�.
		����ڰ� ���� �Է��ϸ� ���� ���� ���� ���ؼ� ����� �˷���
		Ʈ���� �� ������ ũ��,�۴ٸ� ����ڿ��� �˷���
		������ ������ �� �� ���� ���ڸ� ������� �˷���
		(int)(Math.random()*100)�ڵ带 Ȱ���ϼ��� => 0.0 ~ 1.0 ������ double���� �����ϰ� ���� */
		
		int x = 0; // random���� ������ ��
		int input; // �Է��� ��
		int count=0; //�� ������ ������� �˷��� ����.
		x = (int)(Math.random()*100);
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("1~100������ ���� ���纸����!");
		
		while(true) {   //for(;;)�ᵵ ��.
			count++;
			System.out.println("1~100������ ������ �Է��ϼ��� : ");
			input = s.nextInt();
			if (input < x ) {
				System.out.println("�� ū ���� �Է��ϼ���!");
			}else if(input > x){
				System.out.println("�� ���� ���� �Է��ϼ���!");
			}else {
				System.out.printf("%dȸ ���� ������ ���߼̽��ϴ�!",count);
				break;
			}
		}	
	

	}

}
