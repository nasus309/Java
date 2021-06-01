import java.util.Scanner;

public class while문_ {

	public static void main(String[] args) {
		
		/**예제1**/
		int i=1;
		int hap=0;
		while(i<=10) {
			
			hap += i;
			i++;
		}
		System.out.println(hap);
		
		/** 위의 while문과 같은 for문
		hap=0;
		for(i=0;i<=10;i++) {
			hap += i;
		}
		System.out.println(hap);
		**/
		
		
		
		/**예제2**/
		int j=2;
		i=1;
		while (j < 10) {
			System.out.printf("[%d단]\n",j);
			while (i <10) {
				System.out.printf("%d * %d = %d\n",j,i,j*i);
				i++;
			}
			j++;
			i=1;
		}
		
		
		/**예제3**/
		Scanner s = new Scanner(System.in);
		int a=0;
		int b=0;
		
		while(true) {
			
			try {
				System.out.println("더할 첫 번째수 입력 :");
				a = s.nextInt();
				
				System.out.println("더할 두 번째 수 입력 : ");
				b = s.nextInt();
			}catch (Exception e) {
				System.out.println("입력값에 오류가 있습니다.");
			}finally {
				System.out.println("두 수의 합은 : "+(a+b));
				if(a==0 || b==0) //잘못된 값이 들어오면 초기화 값 0 이 들어옴! 그래서 a==0 이렇게 쓴 듯!
					break;
				}
			
			
		}
	

	}
}
