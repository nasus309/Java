import java.util.Scanner;
public class 배열의이해 {

	public static void main(String[] args) {
		
		int[] a;//기초변수가 아니라 참조변수, stack이 아닌 heap에 저장됨.but a의 공간은? stack에 저장 돼 있음.
		int b = 100;
		a = new int[100]; //100개 짜리 배열.400byte의 공간.(index는 0~99) 
		
		System.out.println(b);
		System.out.println(a[99]);
		a[0]=100;
		a[72]=200;
		//a[100]=3; --> 실행하기 전에는 error안뜸. 왜? heap에 저장돼서 그런듯!
		
		
		/* a[0]~a[99]까지 모두 출력
		for (int i=0;i < a.length; i++) {
			System.out.println(a[i]);
		} */
		
		
		
		/**예제1**/
		int i;
		/*Scanner s; //Scanner를 담을 수  있는 공간만 생성.
		s = new Scanner(System.in);
		
		int[] aa = new int[4]; //4개의 공간
		int hap=0; 
	
		for (i=0;i<aa.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요: ",i+1);
			aa[i] = s.nextInt();
			hap += aa[i];
		}
		
		System.out.println("합계 : "+hap);
		
		int c[] = {1,2,3,4,5,6,7,8}; //8개의 공간
		System.out.println(c.length); //배열의 크기
		*/
		
		
		/**예제2** for each 구문*/
		int arr[] = {2,3,4,5,6,7,8,9,10}; 
		for(i=0;i<arr.length;i++){ //배열에 접근해서 처리하는 반복
			System.out.println(arr[i]);
		}
		
		for(int x:arr) { //배열이 원소를 0부터 끝까지 하나씩 던져주는 반복, for each구문(배열같이 연속적인 타입에서만 사용가능?)
			System.out.println(x);
		}
		
		
		
		/**예제3**/
		String ss[] = {"배열","좀 빡시네","포기는 없다.","배고프다"};
		
		for(String x : ss) {
			System.out.println(x);
		}
		
		double d[] = {1.0,20.0,3,14,33.22};
		
		for(double x : d) {
			System.out.println(x);
		}
		
		short SHORT[] = new short[10];
		
		char CHAR[] = new char[5];
		
		long LONG[] = new long[100];
		
		
		
		
		/**참고**/
		int p[] = new int[5];
		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		
		System.out.println(p); //배열이 들어있는 메모리의 주소를 찍음. 
							   //p값에는 공간이 가리키고있는 힙영역의 주소를 가지고 있음~
		
		
		
		//**************참조변수를 담기위한 배열****************
		Scanner sw[] = new Scanner[100]; //공간만 만들어져있음. object는 아직 X.
		sw[0] = new Scanner(System.in); //공간마다 object생성을 해줘야함.
		

		
		
	}
		
}

		
