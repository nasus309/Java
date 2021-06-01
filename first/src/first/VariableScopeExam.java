package first;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;	
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value); //매개변수로 선언된 value 
		//value --> 사용범위는 해당 메서드 블럭 내 
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);    --> Error
//		System.out.println(value);         --> Error
		System.out.println(value2);
	}
	
	public static void aaa(int x) {
		String s ="하";
		System.out.println("하이");
	}
	
	
	//모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다!!(new 붙인거 말하는거 같음)
	//main 메서드에는 static 이라는 키워드가 붙어있음.
	/*해당 클래스를 new하지 않았음에도 static 때문에
	class(나 필드)가 인스턴스화 되지 않아도 쓸수 있었음.*/
	//static한 매서드내에서 static하지 않은 필드는 사용 X --> 해당 클래스가 instance화 안됏을 수 도있어서
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		//위처럼 하면 에러남
		System.out.println(staticVal); //인스턴스화 된 필드라 사용가능.
		System.out.println();
		
		//static 한 메소드에서 static하지 않은 변수를 사용하는 방법
		//객체를 생성하고 사용하면 됨.
		VariableScopeExam v1 = new VariableScopeExam(); // 클래스 인스턴스화 시키기
		System.out.println(v1.globalScope); //참조변수.필드명?
		
		VariableScopeExam v2 = new VariableScopeExam(); //globalScope를 저장할 수 있는 공간을 가지게 됨.
		v1.globalScope = 10; //v1이 가지고 있는 globalScope에 값을 저장.
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		v2.scopeTest2(10);
		
		//static한 필드는 instance 생성시에 만드는게 아니고
		//값을 저장할 수 있는 공간이 하나밖에 없음(값을 공유)
		// --> 클래스 변수(static한 변수)라고 함.

		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		//이렇게 하면 100만 나옴.
		/*static한 필드는 인스턴스 생성시에 만들어지는게 아니고
		 값을 저장할 수 있는 공간이 하나밖에 없음.값을 공유 ->클래스 변수*/
		//글로벌 변수는 인스턴스가 생성될 때 만들어지므로 인스턴스변수.
		//클래스 이름을 직접 사용하는 것이 가능 --> 클래스이름.클래스변수명
		System.out.println(VariableScopeExam.staticVal); //class 변수는 class이름을 직접 사용
				
				
		
	}

}
