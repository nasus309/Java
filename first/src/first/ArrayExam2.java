package first;

public class ArrayExam2 {

	public static void main(String[] args) {
		//2���� �迭
		
		int[][] array4 = new int[3][4];
		array4[0][1] = 10;
		
		int[][] array5 = new int[3][];
		//array5[0][0] = 10; �ϸ� ������ �ֳĸ� ��?�� �ȸ�������� ������~
		array5[0] = new int[1]; //�ϳ�¥�� index?(1��¥��)
		array5[0][0] = 10;
		array5[1] = new int[2]; //�ΰ�¥�� index(2��)
		array5[2] = new int[3]; //����¥�� index(3��)
		
		int[][] array6 = {{1},{1,2},{1,2,3}}; //�ʱ�ȭ
		
		System.out.println(array6[0][0]);
		System.out.println(array6[2][2]);
		

	}

}
