package first;
import java.util.Scanner;
//scanner�� ���а����� ���� �Է¹ް� ���� �� ����ϴ� class

public class DoWhileExam {

	public static void main(String[] args) {
		
		int value = 0;
		Scanner scan = new Scanner(System.in); //Ű����κ��� ���� �Է¹���
		
		do{
			//�ݺ��� ����� --> ������ �ѹ��� ����!
			value = scan.nextInt(); //�������� �Է¹���
			System.out.println("�Է¹��� ��:"+value);
		}while(value != 10);
		
		System.out.println("�ݺ��� ����!");

	}

}
