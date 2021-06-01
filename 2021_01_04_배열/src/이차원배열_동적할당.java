import java.util.Scanner;

public class 이차원배열_동적할당 {

	public static void main(String[] args) {
		
		/**예제1**/
		
		Scanner s = new Scanner(System.in);
		int row,col;
		
		System.out.println("행 개수를 입력 : ");
		row = s.nextInt();
		System.out.println("열 개수를 입력 : ");
		col = s.nextInt();
		
		int[][] aa = new int[row][col];
		
		int i,j;
		int val =1;
		
		//배열에 data를 넣어주는 부분
		for(i=0;i<aa.length;i++) {
			for(j=0;j<aa[0].length;j++) {
				aa[i][j] = val;
				val++;
			}
		}
		
		//배열을 출력하는 부분
		System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력\n",row,col);
		
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
		
		
		/**3차원배열**/
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
