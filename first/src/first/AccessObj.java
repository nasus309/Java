package first;

public class AccessObj {
	
	//public 접근 제한자 --> 어떤 클래스든 접근할 수 있다.
	public int p = 3;
	
	//같은 패키지인 경우 접근 허용
	//다른 패키지라도 상속을 받은 자식 클래스인 경우 접근 허용
	protected int p2 = 4;
	
	//default 접근 지정자
	//아무것도 쓰지않은 경우 자신과 같은 패키지 내에서 접근 허용
	int k = 2;
	
	//자기 자신만 접근 가능
	private int i = 1;
	
	
	
}
