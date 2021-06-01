

public class 실행 {
	
	public static void main(String[] args) {
		int x = 100;
		double y = 100.0;
		
		String s = Integer.toString(x);
		String ss = String.valueOf(x); //다양한 자료형을 받을 수 있음. 엄청많은 오버로딩.
		String sss = String.valueOf(y);
		System.out.println(s);
		System.out.println(ss);
		
		if(s==ss) {
			System.out.println("s==ss");
		}
	}

}
