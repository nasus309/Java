import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// �迭 answer �� ��� �����͸� �а� �� ������ ������ ��� ������ŭ '*'�� �� �׷����� �׸��� ���α׷��� �ۼ��Ͻÿ�.
		// Ex.Answer = {1,3,5}
		/*
		 1 : *
		 3 : ***
		 5 : *****
		 */
		
		int count = 0;
		int answer2[] = {1,3,5,7,9};
		
		for (int i=0;i<answer2.length;i++) {
			System.out.printf("%d :",answer2[i]);
			for(int j=0;j<answer2[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//�迭ũ�⸦ �Է¹޾Ƽ� �迭�� �����ϰ� �� ���!
		
		int answer[];
		int �迭ũ��;
		Scanner s = new Scanner(System.in);
		
		System.out.println("�迭 ũ�⸦ �Է��ϼ��� :");
		
		�迭ũ�� = s.nextInt();
		
		answer = new int[�迭ũ��];
		
		System.out.println("��" + answer.length + "ũ���� �迭�� ��������ϴ�.");
		
		for(int i=0; i <answer.length;i++) {
			System.out.print("���Ҹ� �Է��ϼ��� : ");
			answer[i] = s.nextInt();
		}
		
		System.out.println("�Է��� �迭 ���� ���� ����ؼ� �׷����� �׸��ϴ�.");
		
		for (int i=0;i<answer.length;i++) {
			if(i<10) {
				System.out.print("�迭 [ "+i+"] ���� : ");
			}else {
				System.out.print("�迭 ["+i+"] ���� : \n");
			}
			
			for(int j=0;j<answer[i];j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
		
	}

}
