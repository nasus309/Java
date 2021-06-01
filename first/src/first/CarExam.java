package first;

public class CarExam {
	
	
	public static void main(String[] args) {
		//new 라는 연산자는 new 연산자 뒤에 나오는 생성자를이용해서 메모리에 객체를 만들라는 명령.
		//메모리에 만들어진 객체(class)를 인스턴스라고 함.
		//만들어진 객체(instance)를 참조하는 변수가 c1임.
		//실행되면 Car라는 객체가 2개만들어지고 
		//각각의 객체를 참조하는 c1,c2 변수가 선언이 됨.
		//변수가 인스턴스를 가지고 있는게 아니라 말 그대로 가리킨다?(참조한다)라는 말.
		
		// 원래 생성자 생성 안해줘도 기본생성자가 있어서?? 에러가 안뜸.
		//근데 생성자를 생성 해주면 , 밑의 문장이 에러가 뜨게 되는데 그때 기본생성자를 다시 생성해 주면 에러 해결!
		Car c1 = new Car();
		Car c2 = new Car(); //Car() 가 생성자
		
		//Car라는 객체는 자동차이름,번호 등등의 속성(field)을 가지고 있음
		//개체별로 속성의 값이 유지된다는 것.
		
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		//Car() 객체의 행동을 Method로 정의할 수 있음.
		//Method란 입력값을 받고 무언가를 한 다음에 결과값을 도출해 내는 개념.
		//Method란 Class가 가지고 있는 기능
		//입력값을 매개변수:Parameter(인자:argument)라고 하고 결과값을 리턴값이라고 함.
		//인자는 어떤 함수를 호출시에 전달되는 값 자체를 의미
		//매개변수는 그 전달된 인자를 받아들이는 변수를 의미
	}

}
