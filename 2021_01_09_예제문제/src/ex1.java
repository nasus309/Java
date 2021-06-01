
public class ex1 {

	public static void main(String[] args) {
		
		int x = 0;
		char ch = 'a';
		int year =0;
		boolean powerOn = true;
		String str = " ";
		
		if (10<x && x<20) {}
		
		if (ch != ' ' || ch != '\t') {}
		if (!(ch==' ' || ch=='\t')) {}
		
		if (ch == 'x' || ch== 'X') {} 
		
		if ('0'<=ch && ch<='9') {}
		
		//if ((ch == (ch.toString.toUpperCase()) ) || (ch == (ch.toLowerCase(ch))) ){}
		
		if (('A'<=ch && ch<='Z') || ('a'<=ch && ch<='z')) {}
		
		if (((year%4==0) && (year%100!=0)) || year%400 ==0) {}
		
		if (powerOn ==false) {}
		
		if (str == "yes") {}
		
		if(str.equals("yes")) {}
		
		int a = 100;
		int b = 200;
		int c;
		
		c= (a>b) ? a: b;//삼항연산자 조건식이 참이면 a 거짓이면 b	
		
		System.out.printf("%s",(str=="yes")?"참이다":"거짓이다.");
	}

}
