import java.util.Scanner;

public class �������迭_�����Ҵ� {

	public static void main(String[] args) {
		
		/**����1**/
		
		Scanner s = new Scanner(System.in);
		int row,col;
		
		System.out.println("�� ������ �Է� : ");
		row = s.nextInt();
		System.out.println("�� ������ �Է� : ");
		col = s.nextInt();
		
		int[][] aa = new int[row][col];
		
		int i,j;
		int val =1;
		
		//�迭�� data�� �־��ִ� �κ�
		for(i=0;i<aa.length;i++) {
			for(j=0;j<aa[0].length;j++) {
				aa[i][j] = val;
				val++;
			}
		}
		
		//�迭�� ����ϴ� �κ�
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ���\n",row,col);
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.printf("%3d",aa[i][j]);
			}
			System.out.println();
		}
		
//		for(i=0;i<row;i++) {
//			System.out.println();
//		}
//			for(j=0;j<col;j++) {
//				System.out.println(aa[i][j]);
//			}
//			System.out.println();	
//		}
		
		
		/**3�����迭**/
		int aaa[][][] = new int[2][2][2];
		aaa[0][0][0] = 100;
		aaa[0][0][1] = 100;
		aaa[0][1][0] = 100;
		aaa[0][1][1] = 100;
		aaa[1][0][0] = 100;
		aaa[1][0][1] = 100;
		aaa[1][1][0] = 100;
		aaa[1][1][1] = 100;
		
		
		
	}

}
