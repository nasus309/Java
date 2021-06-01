
public class 이차원배열_ {

	public static void main(String[] args) {

//		int x[][] = new int[3][4];
//		System.out.println(x.length * Integer.BYTES);
		
		/**예제1 : 2차원배열**/
		int aa[][] = new int[3][4]; 
		
		aa[0][0]=1;aa[0][1]=2;aa[0][2]=3;aa[0][3]=4;
		aa[1][0]=5;aa[1][1]=6;aa[1][2]=7;aa[1][3]=8;
		aa[2][0]=9;aa[2][1]=10;aa[2][2]=11;aa[2][3]=12;
		
		System.out.printf("aa[0][0]부터 aa[2][3]까지 출력\n");
		System.out.printf("%3d %3d %3d %3d\n",aa[0][0],aa[0][1],aa[0][2],aa[0][3]);
		System.out.printf("%3d %3d %3d %3d\n",aa[1][0],aa[1][1],aa[1][2],aa[1][3]);
		System.out.printf("%3d %3d %3d %3d\n",aa[2][0],aa[2][1],aa[2][2],aa[2][3]);
		
		for(int i=0;i<aa.length;i++) {        //aa.length = 3;
			for(int j=0;j<aa[0].length;j++) { //aa[0].length = 4;
				System.out.printf("aa[%d][%d] : %d\t\t",i,j,aa[i][j]);
			}
			System.out.println();
		}
		
		
		/**예제2 : 2차원 배열의 초기화**/ 
		int b[] = new int[3];
		b[0] = 10; b[1] = 20; b[2] =30;
		
		for(int x :b) {
			System.out.println(x);
		}
		
		System.out.println();
		
		int cc[][] = {{10,20,30},
					  {40,50,60},
					  {70,80,90}};
		
		for (int x[]:cc) { //{10,20,30}
			for (int y : x)
			System.out.println(y); // 10 -> 20 -> 30
		}
		
		for (int x[]:cc) { 
			System.out.println(x); // {10,20,30}이 들어있는 배열의 주소,{40,50,60}이 들어있는 배열의 주소....
		}
		
		System.out.println();
		
		int xx[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		

		

	}

}
