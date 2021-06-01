package first;

public class ReferenceDataType {

	public static void main(String[] args) {
		//기본 타입
		int i = 4;
		
		//참조 타입
		//String 클래스
		//str에는 메모리의 위치값이 저장. String 인스턴스를 참조하지 가지는게 아님.
		//new --> 클래스를 메모리에 올려주세요 라는 뜻.
		//메모리에 올라간 클래스를 instance라고 함
		//instance를 참조하는 변수가 str임. 
		//str이 hello를 가지고 있는게 아니고 가르킨다라는 것! 즉 메모리의 위치값이 저장.
		String str = new String("hello");
		
		

	}

}
