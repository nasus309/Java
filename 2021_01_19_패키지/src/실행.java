

public class ���� {
	
	public static void main(String[] args) {
		int x = 100;
		double y = 100.0;
		
		String s = Integer.toString(x);
		String ss = String.valueOf(x); //�پ��� �ڷ����� ���� �� ����. ��û���� �����ε�.
		String sss = String.valueOf(y);
		System.out.println(s);
		System.out.println(ss);
		
		if(s==ss) {
			System.out.println("s==ss");
		}
	}

}
