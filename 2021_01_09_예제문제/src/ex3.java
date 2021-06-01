
public class ex3 {

	public static void main(String[] args) {
		// 1 + (1+2) + (1+2+3) + ..... + (1+2+3+....+10)의 결과
		
		int i;
		int j;
		int sum = 0;
		int temp = 0;
		
		/**내가 한거**/
		for(i=1;i<=10;i++) {
			temp = temp + i;
			sum = sum + temp;
		}
		System.out.println(sum);

		//교수님이 한거
		sum=0;
		for (i=1;i<=10;i++) {
			for(j=1;j<=i;j++) {
				System.out.printf("%d\t",j);
				sum = sum + j;
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
