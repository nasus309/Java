
public class ex9 {

	public static void main(String[] args) {
		// ������ �迭 arr�� ��� ��簪�� ���ϴ� ���α׷��� �ۼ��ϼ���.
		
		
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		
		for (int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
		
		sum = 0;
		for(int x : arr)
			sum  =sum +x;
		
		//2���� �迭 arr2�� ��� ��� ���� ���ϰ� ����� ���� ���α׷�
		
		int arr2[][] = {{1,2,3}, {4,5,6},{7,8,9}};
		int row;
		int column;
		int count=0;
		sum=0;
		
		row = arr2.length; //���Ǳ���
		column = arr2[0].length; //���Ǳ���
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				sum = sum + arr2[i][j];
				count++;
			}
		}
		System.out.println("�迭�� ���� ���� : "+count); //count ��� row*column �ᵵ��.
		System.out.println("�� : " + sum);
		System.out.println("��� : " + (double)sum/count);
	}
	

}
