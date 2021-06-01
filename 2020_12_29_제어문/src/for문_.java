
public class for문_ {
	public static void main(String[] args) {
		
		
		/**예제1**/
		int i; //변수선언
		for (i=0; i<5;i++) {
			System.out.printf("안녕하세요. %d회 반복.\n",i);
		}
		System.out.println(i); // 5임
	
		
		/**예제2**/
		//i=1(초기화) 안해주면 결과 달라짐.
		for (i=1;i<=100;i++) {
			System.out.printf("%d ",i);
			if (i>11)
				break; // 12까지 찍어줌.
		}
		System.out.printf("%d ",i); 
		System.out.println("");
		
		
		/**예제3**/
		// 1~5까지의 합 구하기.
		int sum = 0;
		for (i=1;i<=5;i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 5까지의 합은 %d입니다.\n",sum);
		
		
		/**예제4**/
		//500~1000사이의 홀수들의 합.
		int hap = 0;
		for (i=501;i<=1000;i=i+2) {
			hap += i;
		}
		
		System.out.println("500부터 1000까지의 홀수의 합 : "+hap);
		/*다른방법
		 for (i=500; i<=1000; i++){
		 	if(i%2==1){
		 		hap = hap+i;
		 	}
		 }*/
		
		
		/**예제4**/
		i=0;
		for(;;) {
			System.out.println(i);
			i++;
			if (i>10)
				break;
		}
		
	}

}
