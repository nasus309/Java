import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// �ܾ��� ���� ��ġ�� ��� �����ְ� ������ �ܾ ���ߴ� ���α׷��� �����Ͻÿ�.
		// �迭�� ���� ���������� �����ϰ� �迭�� ������ ������ ��� ������.
		/**
		 ������ ���� ���ڴ� �����ϱ��? ovle => lveo
		 Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ��� => love
		 �¾ҽ��ϴ�.
		 **/
		
		//String => ���ڿ� => ���ڹ迭 => char[]
		
		
		String str ="hello";
		str.toCharArray();
		
		Scanner s = new Scanner(System.in);
		String ss;
		String Q[] = {"hello","class","method","object"};
		//Q[0]="hello"
		//Q[1]="class"
		//Q[2]="method"
		//Q[3]="object"
		
		for(int i=0;i<Q.length;i++) {
			char[] question =Q[i].toCharArray(); // 1.hello 2.class ..... 
			//�տ����� ������ char[] �迭�� �ɰ��ش� 
			//question[0] = 'h'
			//question[1] = 'e'
			//question[2] = 'l'
			//question[3] = 'l'
			//question[4] = 'o'
			
			for(int j =0;j<question.length;j++) {
				int idx = (int)(Math.random()*question.length); //��갪�� 0,1,2,3,4 �� ����...
				// 1. 0.4351656 * 5 = 2.xxxxx => idx =2
				// 2. 0.189 * 5 = 0.xxx => idx =0
				char tmp = question[i];
				//1. tmp = 'h' 2.tmp ='l'
				question[i] = question[idx];
				//1. question[0] = 'l' 2.question[0] = 'l'
				question[idx] = tmp;
				//1. question[2] = 'h' 2.question[0] = 'l'
	
				//������ �ٽ� �ݺ��� �� j�� �ٲ�鼭 random���� �ٲ� �ٽ� �����ְ� �ȴ�..
			}
			
			System.out.print("������ ���� ���ڴ� �����ϱ��? ");
				//���� ������ Ȯ���ڵ�.
			for(int k=0;k<question.length;k++) {
				System.out.print(question[k]);
			}
				
			System.out.print(" => ");
			
			
			while(true) {
				ss=s.nextLine();
				
				if(Q[i].equals(ss)) {
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}else {
					System.out.print("Ʋ�Ƚ��ϴ�. ");
					System.out.print("������ ���� ���ڴ� �����ϱ��? ");
				}
			}
		}
		
		System.out.println("��� ������ Ǯ�����ϴ�.");

	}

}
