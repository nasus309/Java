import java.util.Scanner; //�̸� ���� �Ǿ� �ִ� Ŭ����(Ŭ���� ; n���� ����(field)�� n���� �޼ҵ��� ����), ������ ������ object��� ��!

public class if��_Scanner��� {

	public static void main(String[] args) {
		
		/*Ŭ�����̸� ����(object) ���� = new Ŭ�����̸�();
		ex)class ����{ }
		   ���� x = new ����();*/
		
		/*
		  Scanner s; //������ Ÿ���� API �޼ҵ��̱� ������ s��� �̸��� ���ÿ� 
		               ������ ������ ���� ���빰(object)�� ���� ������ ��.
		                --> Sting�� ������ Ÿ���̶� �Ȱ���. �ٵ� String�� ���� ������ new �����ϰ� �ٷ� String sss~
		             //null
		  s = new Scanner(System.in); 
		  �� ����*/

		Scanner s = new Scanner(System.in); //System.in --> ǥ���Է½ý��� System.out-->����ý���
		
		int a; //null
		
		System.out.printf("������ �Է��ϼ��� : ");
		a = s.nextInt(); 
	
		
		if (a % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
		
		double b;
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		b = s1.nextDouble();
		
		if (b>100.0) {
			System.out.println("100���� ū �Ǽ�");
		}else {
			System.out.println("100���� ���� �Ǽ�");
		}
		
	}

}
