package first;

public class MyClass2 {
	
	//메소드 오버로딩 : 비슷한 일을 하지만,
	//타입과 매개변수의 수 중에 하나가 달라야함. 매개변수 이름은 중요하지 않다.
	public int plus(int x,int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x, String y) {
		return x + y;
	}
	

}
