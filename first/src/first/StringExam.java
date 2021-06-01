package first;

public class StringExam {

	public static void main(String[] args) {
		//str1에서 hello가 생성됐을때 hello가 상수가 저장되는 공간에 저장이됨.
		//변하지 않는다는거다?
		String str1 = "hello";
		//str2는 상수영역에 hello가 있는지 보고 있으면 새로만들지않고 str1의 hello를 가르킴.
		//즉 str1과 str2는 같은 instance를 참조하고 있음. 
		String str2 = "hello";
		
		//new를 이용하면 new라고 나오는 순간 상수역역에 있는것을 참조하지 않고 
		//hello라는 문자열을 새로운 instance 영역(heap영역)에 만듦.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		//실제 가르키고 있는 메모리 영역의 주소가 같나?
		if(str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스입니다."); //같음
		
		if(str1 == str3)
			System.out.println("str1과 str3는 같은 레퍼런스입니다."); //다름
		
		if(str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다."); //다름
		
		//한번 생성된 클래스는 변하지 않음(String 클래스만)
		System.out.println(str1);
		
		System.out.println(str1.substring(3)); //index 3번부터 짤라달라
	
		System.out.println(str1);
	}

}
