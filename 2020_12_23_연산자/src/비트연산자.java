//********�˰� ������ �ڹ� ��Ʈ������ 2�� ������� �˻��غ���***********
public class ��Ʈ������ {

	public static void main(String[] args) {
		
		int a = 3; //00000000000-------00000011�� ����.
		int b = 5;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~b);
		
		/*
		 a =  11, b = 101
		 a = 011  b = 101 �� �ٲ���
		   &�� 001 |�� 111
		     
		 */
		System.out.println("");
		byte c = 3; //00000011 �� ����. not ���ָ� 3+1 �ؼ� -��ȣ �ٿ��ֱ�(-4)~ �ٽ� not ���ָ� 4-1 ���ְ� + �� �� 
		//byte c =128 overflow!
		byte d = 127;
		byte e = 1;
		System.out.println(c+1); // 1�� int�̱� ������ 128�� ����� �����ϰ� ��!
		System.out.println((byte)(d+e)); //d+e ��ü�� byte�� �ٲٱ⶧���� -128�� ��!
		System.out.println("");
		//&��  �μ� �� ���������� Ŭ�� ����...?
		
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
		System.out.printf("%d�� ���� 1ȸ ����Ʈ�ϸ� %d �̴�.\n",p,p<<1); //10100 --> 20
		System.out.printf("%d�� ���� 2ȸ ����Ʈ�ϸ� %d �̴�.\n",p,p<<2); //101000 --> 40
		System.out.printf("%d�� ���� 3ȸ ����Ʈ�ϸ� %d �̴�.\n",p,p<<3); //1010000 --> 80
		//10�� ����� ���� ����Ʈ �ϸ� ����� �� �Ǵµ�! �������� ����� ������!
		
		a = 100;
		int result;
		int i;
		for (i=1; i<=5;i++) {
			result = a << i;
			System.out.printf("%d << %d = %d\n",a,i,result);
			//for�ȿ����� for���� ������ i�� 6�̵Ǿ�����!
		}
			
		for (i=1; i<=5;i++) {
			result = a >> i;
			System.out.printf("%d >> %d = %d\n",a,i,result);
			
			
		}
	}

	
}
