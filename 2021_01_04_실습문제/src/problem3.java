import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		//�Է��� ���� ���� ���� ���� ���,����,0 �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//���� ����ڰ� �� �� �Է����� �� ���������� �ý����� ���� �� �� �ֵ��� ���α׷��� �߰��� ������.
		
		int input=0;
		Scanner s = new Scanner(System.in);
		
//		try {
//			System.out.println("������ �Է��ϼ��� : ");
//			input = s.nextInt(); 
//			if (input > 0){
//				System.out.println("�Է��Ͻ� ������ ����Դϴ�.");
//			}else if (input < 0){
//				System.out.println("�Է��Ͻ� ������ �����Դϴ�.");
//			}else {
//				System.out.println("�Է��Ͻ� ������ 0�Դϴ�.");
//			}
//		}catch (Exception e) {
//			System.out.println("�߸��Է��ϼ̽��ϴ�.");
//		}
		
		
       /***�� �ٸ� ���***/	
	
		while (true) {
			try {
				System.out.println("������ �Է��ϼ��� : ");
				input = s.nextInt(); 
				if (input >= 0) {
					if(input != 0) {
						System.out.printf("�Է��Ͻ� ���� %d�� ����Դϴ�.\n",input);
					}else {
						System.out.printf("�Է��Ͻ� ������ 0�Դϴ�.\n",input);
					}
				}else {
					System.out.printf("�Է��Ͻ� ���� %d�� �����Դϴ�.\n",input);
				}
			}catch (Exception e) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				
				s.next(); //�տ� ���� ���� �����������? ���� ������ �Ѿ��?
			}
		}
		
		
	}

}

