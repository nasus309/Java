import java.util.Scanner;

public class ex13 {
	
	static double getDistance(int x1,int y1,int x2,int y2) {
		
		return Math.sqrt((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1) );
	}

	public static void main(String[] args) {
		// ���� �Ÿ��� ����ϴ� getDistance() �޼ҵ带 �����Ͻÿ�.
		// ������ ����� Math.sqrt(double a)�� ���.
		
		Scanner s = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		double result;
		
		System.out.print("ù��° �� : ");
		x1 = Integer.parseInt(s.next());
		y1 = Integer.parseInt(s.next());
		System.out.print("�ι�° �� : ");
		x2 = Integer.parseInt(s.next());
		y2 = Integer.parseInt(s.next());
		
	
		/*System.out.print("x1 ��ǥ�� �Է��ϼ��� : ");
		x1 = s.nextInt();
		System.out.print("y1 ��ǥ�� �Է��ϼ��� : ");
		y1 = s.nextInt();
		System.out.print("x2 ��ǥ�� �Է��ϼ��� : ");
		x2 = s.nextInt();
		System.out.print("x2 ��ǥ�� �Է��ϼ��� : ");
		y2 = s.nextInt();*/
		
		result = getDistance(x1,y1,x2,y2);
		
		System.out.printf("(%d,%d)�� (%d,%d)�� �Ÿ��� %f �Դϴ�.",x1,y1,x2,y2,result);
		
		
		

	}

}
