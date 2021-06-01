
public class ex4 {

	public static void main(String[] args) {
		// 1+ (-2) + 3 + (-4) + 로 식이 계속 진행 될때 얼마까지 더해야 100이 넘어가는지?
		
		int i;
		int s = 1;
		int num;
		int sum=0;
		int count = 1;
		
		/**내가 한거**/
		for (i=1;sum<=100;i++) {
			if (i%2!=0) {
				sum = sum + i;
				System.out.printf("%d번째 : %d\n",count,sum);
			}else {
				sum = sum - i;
				System.out.printf("%d번째 : %d\n",count,sum);
			}
			count++;
		}
		
		
		/*교수님이한거
		for(i =1; true;i++,s=s*-1) {
			//1. i =1, s=1, 2. i = 2, s = -1 3. i=3,s=-1
			num = s * i; // 1. num = 1 2. num= -2  3.num=3
			sum = sum +num; // 1.sum =1 2.sum = -1  3.sum=2
			System.out.printf("현재 수 : %d, 현재까지 합: %d\t",num,sum);
			System.out.println();
			if(sum >= 100)
				break;
		} */

		
		
	}

}
