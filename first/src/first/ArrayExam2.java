package first;

public class ArrayExam2 {

	public static void main(String[] args) {
		//2차원 배열
		
		int[][] array4 = new int[3][4];
		array4[0][1] = 10;
		
		int[][] array5 = new int[3][];
		//array5[0][0] = 10; 하면 오류뜸 왜냐면 열?이 안만들어졌기 때문에~
		array5[0] = new int[1]; //하나짜리 index?(1열짜리)
		array5[0][0] = 10;
		array5[1] = new int[2]; //두개짜리 index(2열)
		array5[2] = new int[3]; //세개짜리 index(3열)
		
		int[][] array6 = {{1},{1,2},{1,2,3}}; //초기화
		
		System.out.println(array6[0][0]);
		System.out.println(array6[2][2]);
		

	}

}
