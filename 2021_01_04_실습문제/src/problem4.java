
public class problem4 {

	public static void main(String[] args) {
		
		//����� Ȱ���Ͽ� �������� ��� ���� �ظ� ���Ͻÿ�.
		// 2x + 4y = 10�� �� ���ϱ�.
		
		System.out.println("2x + 4y = 10 �������� ���� �ظ� ���ϴ� ���α׷��Դϴ�.");
		int x;
		int y;
		for(x=0;x<=5;x++) { // x=0
			for(y=0;y<=2;y++) { 
				//1 step (x=0) y=0 �ȸ��� y=1 �ȸ��� y=2 �ȸ��� x�� 1�� ������
				//2 step (x=1) y=0 �ȸ��� y=1 �ȸ��� y=2 ����!
				//3 step (x=2) y=0
				if ((2*x)+(4*y)==10) {
					System.out.printf("x = %d, y =%d\n",x,y);
				}
			}	
		}
		//������ -10~10 �϶�
		for(x=-10;x<=10;x++) {
			for(y=-10;y<=10;y++) { 
				if ((2*x)+(4*y)==10) {
					System.out.printf("x = %d, y =%d\n",x,y);
				}		
			}
		}
	}

}
