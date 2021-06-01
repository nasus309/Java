class myChar{
	char x;
	char y;
}

public class METHOD_call_by {
	
	static void Int(int a) {
		a = 100000;
		//a값은 100000이지만 n은 1000임
	}
	
	static void func1(char x, char y) { // call by value (형식인자에...char가 있어서)
		// x =ch.x의 값인 'A' 가 들어감, y = ch.y 값인 'z'가 들어감.
		char imsi;
		imsi = x;
		x = y;
		y = imsi;
		
		//바뀌긴 하는데 stack에 저장됐다가 날라감.
	}
	
	static void func2(myChar ch) { //ch안에 ch(main메소드에있는거)가 들어있는 주소를 복사해서 넘겼다. func2의 ch는 m 이런거로 바껴도 상관 없음.
		char imsi;
		imsi = ch.x;
		ch.x = ch.y;
		ch.y = imsi;
	}
	
	static void changeChar(char a,char b) {
		
		char imsi;
		imsi = a;
		a = b;
		b = imsi;
		
	}
	
	static void changeChar(myChar m) {
		char imsi;
		imsi = m.x;
		m.x = m.y;
		m.y = imsi;
	}

	
	public static void main(String[] args) {
		
		char x = 'A', y ='Z';
		System.out.printf("원래값 : x = %c, y = %c\n",x,y);
		func1(x,y);
		System.out.printf("값을 전달한 후 : x = %c, y = %c\n\n",x,y);
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'z';
		System.out.printf("원래값 : x = %c, y = %c\n",ch.x,ch.y);
		func2(ch);
		System.out.printf("값을 전달한 후 : x = %c, y = %c\n\n",ch.x,ch.y);
		
		
		
		Integer n = 1000;
		System.out.println(n);
		Int(n);
		System.out.println(n);
		
		myChar Cc = new myChar();
		Cc.x ='A';
		Cc.y ='Z';
		changeChar(Cc.x,Cc);
		System.out.println(Cc.x + " " +Cc.y);
		

	}
	
	static void changeChar(char c, myChar m) {
		m.y = (char) (c+10); //m.y and Cc.y = c+10
		c='Q';
	}

}
