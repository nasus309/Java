
public class ex2 {

	public static void main(String[] args) {
		// 1 ~ 20 까지의 정수에서 2의 배수와 3의 배수 정수의 합을 구하시오.
		
		int i;
		int hap=0;
		
		for(i=0;i<=20;i++) {
			if(i%2==0 || i%3==0) {
				hap = hap + i;
			}
		}
		System.out.println("합은 "+hap);

	}

}
