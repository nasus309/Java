class INT{
	int aa[] = new int[10];
}

public class 배열의이해2 {

	public static void main(String[] args) {
		
		/**나중에 할거다 참고만 해라 
		 * 배열안의 배열**/
		INT x[] = new INT[5];
		x[0] = new INT();
		x[1] = new INT();
		x[0].aa[0] =100;
		
		
		/**예제4**/
		int aa[]= {100,200,300,400};
		int bb[] = new int[] {100,200,300};
		
		int cc[];
		cc = new int[] {100,200};
		int[] dd = new int[1];
		dd[0] = 100;
		int i;
		
		for(i=0;i<4;i++)
			System.out.printf("aa[%d] ==>%d\t",i,aa[i]);
		System.out.println();
		
		for(i=0;i<3;i++)
			System.out.printf("bb[%d] ==>%d\t",i,bb[i]);
		System.out.println();
		
		for(i=0;i<2;i++)
			System.out.printf("cc[%d] ==>%d\t",i,cc[i]);
		System.out.println();
		
		for(i=0;i<1;i++)
			System.out.printf("dd"+ "[%d] ==>%d\t",i,dd[i]);
		System.out.println();
				
		
		
		
		/**예제5**/
		//int aa[]= {100,200,300,400};
		//int cc[]= {100,200};
		cc = aa; //aa배열의 주소를 그대로 가져옴! aa배열의 값이 바뀌면 따라서 cc배열의 값도 바뀌게 됨!(주소는 그대로)
		for(i=0;i<cc.length;i++) {
			System.out.println(cc[i]);
			cc[i] = cc[i]+100;
		}		
		
		for(i=0;i<aa.length;i++) {
			System.out.println(aa[i]);
			aa[i] = aa[i]+100;
		}
		
		for(i=0;i<cc.length;i++) {
			System.out.println(cc[i]);
			cc[i] = cc[i]+100;
		}		
		
		
		/**예제6**/
		//*****참조변수와 기초변수의 성질을 둘다 가지고 있는? String****//
		String ss ="안녕";
		String sss = "반갑";
		System.out.println(ss); //안녕
		System.out.println(System.identityHashCode(ss)); //816
		System.out.println(System.identityHashCode(sss)); //182
		ss=sss;
		System.out.println(ss); //반갑
		System.out.println(System.identityHashCode(ss)); //182
		System.out.println(System.identityHashCode(sss)); //182
		sss="우하하하";
		System.out.println(System.identityHashCode(ss)); //182
		System.out.println(System.identityHashCode(sss)); //145 => sss의 주소가 바뀌어버림~
		System.out.println(ss); //반갑 --> 왜? int와 다르게 heap영역에 기존과 다른 새로운 주소에 data를 만들어버림.
		
		
		
		
		/**예제7**/
		int aaa[] = new int[100]; //2의 배수
		int bbb[] = new int[100]; //2의 배수 역순.
		//int i;
		
		//2의배수
		for(i=0;i<aaa.length;i++) {
			aaa[i] = i * 2;
			System.out.printf("%d\t",aaa[i]);
		}		
		System.out.println();
		
		//2의 배수 역순
		for(i=0;i<aaa.length;i++) {
			bbb[i] = aaa[99-i];
			System.out.printf("%d\t",bbb[i]);
		}
		System.out.println();
		//또다른방법
		for(i=99;i>=0;i--) {
			bbb[i] = aaa[99-i];
			System.out.printf("%d\t",aaa[i]);
		}
		System.out.println();
		

		/**예제8**/
		int ccc[] = {10,20,30,40,50};
		int count,size;
		
		count = dd.length;            //배열 요소의 개수를 계산한다.
		size = count * Integer.BYTES; //배열 전체 크기(바이트)를 계산한다.
		
		System.out.printf("배열 ccc[]의 요소의 개수는 %d개 입니다.\n",count);
		System.out.printf("배열 ccc[]의 요소의 전체 크기는 %d 바이트입니다.\n",size);
		
		
		/**참고**/
		/*
		 int = Integer // Wrapper class -> 기초 자료형을 Object화 했다.
		 char = Character
		 double = Double
		 float = Float
		 short = Short
		 long = Long
		 boolean = Boolean
		 byte = Byte
		 */
		
		Double a = 10.0; //class
		double b = 20.0; //그냥 기초 자료형.참조형으로 바꾸고싶다~ 이 때 Wrapper class 사용 가능~
		
		String str = "안녕하세요 ~~~~~~"; //12글자
		String ddd[] = new String[100];
		int count1 = 0;
		count1 = str.length(); //str 문자의 글자 개수
		System.out.println(count1 * Character.BYTES); // str문자의 byte,Wrapper class
		count1 = ddd.length; //배열의 index 개수
		System.out.println(count1);
		
		System.out.println(Character.BYTES); //2
		System.out.println(Long.BYTES);		 //8
		System.out.println(Integer.BYTES);	 //4
		System.out.println(Double.BYTES);	 //8
		
		//Wrapper class
		Double y[] = new Double[100];
		y[0] = 10.0;
		
		

	}

}
