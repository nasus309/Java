
public class ex9 {

	public static void main(String[] args) {
		// 일차원 배열 arr에 담긴 모든값을 더하는 프로그램을 작성하세요.
		
		
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		
		for (int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
		
		sum = 0;
		for(int x : arr)
			sum  =sum +x;
		
		//2차원 배열 arr2에 담긴 모든 값을 더하고 평균을 내는 프로그램
		
		int arr2[][] = {{1,2,3}, {4,5,6},{7,8,9}};
		int row;
		int column;
		int count=0;
		sum=0;
		
		row = arr2.length; //행의길이
		column = arr2[0].length; //열의길이
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				sum = sum + arr2[i][j];
				count++;
			}
		}
		System.out.println("배열의 원소 개수 : "+count); //count 대신 row*column 써도됨.
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + (double)sum/count);
	}
	

}
