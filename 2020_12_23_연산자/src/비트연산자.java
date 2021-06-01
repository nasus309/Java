//********알고 싶으면 자바 비트연산자 2의 보수계산 검색해보기***********
public class 비트연산자 {

	public static void main(String[] args) {
		
		int a = 3; //00000000000-------00000011로 저장.
		int b = 5;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~b);
		
		/*
		 a =  11, b = 101
		 a = 011  b = 101 로 바꿔줌
		   &는 001 |는 111
		     
		 */
		System.out.println("");
		byte c = 3; //00000011 로 저장. not 해주면 3+1 해서 -부호 붙여주기(-4)~ 다시 not 해주면 4-1 해주고 + 가 됨 
		//byte c =128 overflow!
		byte d = 127;
		byte e = 1;
		System.out.println(c+1); // 1이 int이기 때문에 128로 계산이 가능하게 됨!
		System.out.println((byte)(d+e)); //d+e 자체를 byte로 바꾸기때문에 -128이 뜸!
		System.out.println("");
		//&는  두수 중 작은수보다 클수 없다...?
		
		//Shift
		a = 3; //  11
		b = 6; // 110
		
		System.out.println(a);
		System.out.println(a << 1 ); //110
		System.out.println(a << 2); //1100
		System.out.println(a << 3); //11000 
		System.out.println(a >> 1 ); // 1
		System.out.println(a >> 2); // 0
		System.out.println(a >> 3); //0 
		System.out.println(b << 1 ); //1100
		System.out.println(b << 2); //11000
		System.out.println(b << 3); //110000 
		System.out.println(b >> 1 ); // 11
		System.out.println(b >> 2); // 1
		System.out.println(b >> 3); //0 
		
		
		int p = 10; //1010
		System.out.printf("%d를 왼쪽 1회 시프트하면 %d 이다.\n",p,p<<1); //10100 --> 20
		System.out.printf("%d를 왼쪽 2회 시프트하면 %d 이다.\n",p,p<<2); //101000 --> 40
		System.out.printf("%d를 왼쪽 3회 시프트하면 %d 이다.\n",p,p<<3); //1010000 --> 80
		//10의 배수는 왼쪽 시프트 하면 배수로 곱 되는듯! 오른쪽은 배수로 나누기!
		
		a = 100;
		int result;
		int i;
		for (i=1; i<=5;i++) {
			result = a << i;
			System.out.printf("%d << %d = %d\n",a,i,result);
			//for안에서는 for문이 끝나면 i가 6이되어있음!
		}
			
		for (i=1; i<=5;i++) {
			result = a >> i;
			System.out.printf("%d >> %d = %d\n",a,i,result);
			
			
		}
	}

	
}
